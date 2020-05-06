package com.lin.designmode.single;

import org.junit.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingle {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);
    private static Set<String> flag = new HashSet<String>();
    private static ExecutorService pool = Executors.newFixedThreadPool(100);
    private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            // Thread.sleep(100);
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    try {
                        //  System.out.println("创建线程完毕准备并发----------------" + Thread.currentThread().getName());
                        countDownLatch.await();
                        //System.out.println("创建线程完毕开始并发----------------");
                        String lazySimpleSingleton = LazySimpleSingleton.getLazySimpleSingleton().toString();
                     //   System.out.println(lazySimpleSingleton + ".................");
                        Thread.sleep(1000);
                        synchronized (flag) {
                            boolean contains = flag.contains(lazySimpleSingleton);
                            if (contains) {
                               // System.out.println(lazySimpleSingleton + "+++++++++++++++++++++++++++++++");
                            } else {
                                flag.add(lazySimpleSingleton);
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            pool.execute(thread);
        }
        Thread.sleep(1000 * 1);
        countDownLatch.countDown();

        Thread.sleep(1000 * 3);
        System.out.println(flag);
        pool.shutdown();


    }
}
