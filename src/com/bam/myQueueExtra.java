package com.bam;

import rzp.exceptions.queue.QueueException;
import rzp.exceptions.queue.QueueExtra;

public class myQueueExtra implements QueueExtra {

    private int maxSize = 0;
    private int endIndex = -1;
    private int []data;

    @Override
    public void offer(int... items) throws QueueException, IllegalStateException {

        if (endIndex + items.length > maxSize) throw new QueueException("Не хватает места для элементов");

        if (data == null) throw new IllegalStateException("ОЧередь не инициализирована");

        for (int i : items)
        {
            offer(i);
        }

        /// Остальные методы реализовываются как в прошлом задании

    }

    @Override
    public void init(int maxSize) throws QueueException {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(int item) {
        return false;
    }

    @Override
    public int peek() throws QueueException {
        return 0;
    }

    @Override
    public int poll() throws QueueException {
        return 0;
    }

    @Override
    public void offer(int item) throws QueueException {

    }
}
