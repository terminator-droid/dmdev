package com.dudev.regexp.homework;

import com.dudev.regexp.homework.model.Row;
import com.dudev.regexp.homework.model.RowFromLog;
import com.dudev.regexp.homework.model.RowToLog;
import com.dudev.regexp.homework.model.User;
import com.dudev.regexp.homework.threads.ComplaintsIncome;
import com.dudev.regexp.homework.threads.ComplaintsReader;
import com.dudev.regexp.homework.threads.Dispatcher;
import com.dudev.regexp.homework.threads.DispatcherCallWriter;

import java.util.List;
import java.util.concurrent.*;

public class HelpDescRunner {

    private static ExecutorService executorService;

    public static void main(String[] args) {

        User user1 = new User("Петр Петрович", "43 029 3238");
        User user2 = new User("Иван Иванович", "+375 32 120-55-32");
        User user3 = new User("Евгений Павлович", "+37511 52363 48");

        List<User> users = new CopyOnWriteArrayList<>(List.of(user1, user2, user3));
        BlockingQueue<RowFromLog> complaints = new LinkedBlockingDeque<>();
        BlockingQueue<RowToLog> calls = new LinkedBlockingDeque<>();


        List<Runnable> runnables = List.of(new ComplaintsIncome(users), new ComplaintsReader(complaints), new Dispatcher(complaints, calls),
                new Dispatcher(complaints, calls), new DispatcherCallWriter(calls));
        ExecutorService executorService = Executors.newFixedThreadPool(runnables.size());

        for (Runnable runnable : runnables) {
            executorService.submit(runnable);
        }
    }
}
