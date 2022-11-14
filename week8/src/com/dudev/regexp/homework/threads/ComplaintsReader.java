package com.dudev.regexp.homework.threads;

import com.dudev.regexp.homework.model.Row;
import com.dudev.regexp.homework.model.RowFromLog;
import com.dudev.regexp.homework.utils.ConstantUtil;
import com.dudev.regexp.homework.utils.LogWriterReader;
import com.dudev.regexp.homework.utils.PathUtils;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ComplaintsReader implements Runnable{

    private BlockingQueue<RowFromLog> queue = new LinkedBlockingDeque<>();
    private static int rowsToSkip;

    public ComplaintsReader(BlockingQueue<RowFromLog> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (rowsToSkip != ComplaintsIncome.getLineCounter()) {
                try {
                    List<RowFromLog> rowsList = LogWriterReader.readLog(PathUtils.COMPLAINT_LOG, rowsToSkip);
                    queue.addAll(rowsList);
                    rowsToSkip += rowsList.size();
                    Thread.sleep(ConstantUtil.SCHEDULE_TIME);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
