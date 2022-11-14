package com.dudev.regexp.homework.threads;

import com.dudev.regexp.homework.model.Row;
import com.dudev.regexp.homework.model.RowFromLog;
import com.dudev.regexp.homework.model.RowToLog;
import com.dudev.regexp.homework.utils.ConstantUtil;
import com.dudev.regexp.homework.utils.FormatUtil;


import java.time.LocalDateTime;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import static com.dudev.regexp.homework.utils.FormatUtil.formatDateTime;
import static com.dudev.regexp.homework.utils.FormatUtil.formatPhoneNumber;

public class Dispatcher implements Runnable {

    private final BlockingQueue<RowFromLog> queueFrom;
    private final BlockingQueue<RowToLog> queueTo;

    public Dispatcher(BlockingQueue<RowFromLog> queueFrom, BlockingQueue<RowToLog> queueTo) {
        this.queueFrom = queueFrom;
        this.queueTo = queueTo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                RowFromLog currentComplaint = queueFrom.take();
                LocalDateTime callDateTime = LocalDateTime.now();
                RowToLog currentToLog = new RowToLog(currentComplaint.getNumber(),
                        callDateTime,
                        formatPhoneNumber(currentComplaint.getPhone()));
                Thread.sleep(ConstantUtil.CALL_TIME);
                queueTo.add(currentToLog);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}