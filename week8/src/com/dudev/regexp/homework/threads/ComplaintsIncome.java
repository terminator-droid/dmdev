package com.dudev.regexp.homework.threads;

import com.dudev.regexp.homework.utils.ConstantUtil;
import com.dudev.regexp.homework.utils.LogWriterReader;
import com.dudev.regexp.homework.model.Complaints;
import com.dudev.regexp.homework.model.RowFromLog;
import com.dudev.regexp.homework.model.User;
import com.dudev.regexp.homework.utils.PathUtils;
import com.dudev.regexp.homework.utils.RandomUtil;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ComplaintsIncome implements Runnable {

    private static final AtomicInteger lineCounter = new AtomicInteger(0);
    private final List<User> users;
    public ComplaintsIncome(List<User> users) {
        this.users = users;
    }


    @Override
    public void run() {
        while (true) {
            User currentUser = RandomUtil.getRandomUser(users);
            Complaints currentComplaint = RandomUtil.getRandomComplaint();
            RowFromLog currentRow = new RowFromLog(lineCounter.get(), LocalDateTime.parse(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)), currentUser.fullName(), currentUser.phoneNumber(), currentComplaint);
            try {
                lineCounter.incrementAndGet();
                LogWriterReader.writeLog(PathUtils.COMPLAINT_LOG, currentRow);
                Thread.sleep(ConstantUtil.COMPLAINT_GENERATION_PERIOD);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getLineCounter() {
        return lineCounter.get();
    }
}
