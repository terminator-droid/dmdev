package com.dudev.regexp.homework.threads;

import com.dudev.regexp.homework.model.Row;
import com.dudev.regexp.homework.model.RowToLog;
import com.dudev.regexp.homework.utils.LogWriterReader;
import com.dudev.regexp.homework.utils.PathUtils;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;


public class DispatcherCallWriter implements Runnable{

    private final BlockingQueue<RowToLog> queue;
    private final AtomicInteger rowNumber = new AtomicInteger(0);

    public DispatcherCallWriter(BlockingQueue<RowToLog> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                RowToLog callRow = queue.take();
                callRow.setNumber(rowNumber.get());
                LogWriterReader.writeLog(PathUtils.CALL_LOG, callRow);
                rowNumber.incrementAndGet();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
