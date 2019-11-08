package com.doubleysoft.alg.leetcode.list;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class CLH implements Lock {
    private final ThreadLocal<Node> preNode = ThreadLocal.withInitial(() -> null);
    private final ThreadLocal<Node> node = ThreadLocal.withInitial(Node::new);
    private final AtomicReference<Node> tail = new AtomicReference<>(new Node());

    public static void main(String[] args) {
        Lock clh = new CLH();
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread() + "开始获取锁");
                        clh.lock();
                        System.out.println(Thread.currentThread() + "获取锁");
                        System.out.println("get lock");

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(Thread.currentThread() + "释放锁");
                        clh.unlock();
                    }
                }
            }).start();
        }
    }

    @Override
    public void lock() {
        final Node node = this.node.get();
        node.locked = true;
        Node pre = this.tail.getAndSet(node);
        this.preNode.set(pre);
        while (pre.locked) ;
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        final Node node = this.node.get();
        node.locked = false;
        this.node.set(this.preNode.get());
    }

    @Override
    public Condition newCondition() {
        return null;
    }

    private static class Node {
        private volatile boolean locked;
    }
}