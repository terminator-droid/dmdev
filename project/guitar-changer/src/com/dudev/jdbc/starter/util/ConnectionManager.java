package com.dudev.jdbc.starter.util;


import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class ConnectionManager {

    private static final String USER_KEY = "db.user";
    private static final String PASSWORD_KEY = "db.password";
    private static final String URL_KEY = "db.url";
    private static final String POOL_SIZE_KEY = "db.pool.size";
    public static final int DEFAULT_POOL_SIZE = 5;
    private static BlockingQueue<Connection> pool;
    private static List<Connection> sourceConnections;

    static {
        try {
            initializePool();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ConnectionManager() {
    }

    private static void initializePool() throws SQLException {
        var poolSize = PropertiesUtil.get(POOL_SIZE_KEY);
        var size = poolSize == null ? DEFAULT_POOL_SIZE : Integer.parseInt(poolSize);
        pool = new ArrayBlockingQueue<>(size);
        sourceConnections = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Connection connection = open();
            Connection connectionProxy = (Connection) Proxy.newProxyInstance(ConnectionManager.class.getClassLoader(), new Class[]{Connection.class},
                    (proxy, method, args) -> method.getName().equals("close") ?
                            pool.add((Connection) proxy)
                            : method.invoke(connection, args));
            pool.add(connectionProxy);
            sourceConnections.add(connection);

        }
    }

    public static void closePool() {
        for (Connection sourceConnection : sourceConnections) {
            try {
                sourceConnection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static Connection getConnection() {
        try {
            return pool.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static Connection open() {
        try {
            return DriverManager.getConnection(
                    PropertiesUtil.get(URL_KEY),
                    PropertiesUtil.get(USER_KEY),
                    PropertiesUtil.get(PASSWORD_KEY)
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
