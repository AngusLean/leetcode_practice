package com.doubleysoft.alg.leetcode;

import java.util.concurrent.TimeUnit;

public class ProducerConsumer {
    private static final int MAX_VAL = 10;
    private volatile int count = 0;

    private <T> T produce_Item() {
        return null;
    }

    private <T> void consome_item(T t) {

    }

    private <T> void insert_item(T t) {

    }

    private <T> void produce() throws InterruptedException {
        while (true) {
            T item = produce_Item();
            if (count == MAX_VAL) {
                TimeUnit.SECONDS.sleep(1);
            }
            insert_item(item);
            count += 1;
            if (count == 1) {

            }
        }

    }
}