package com.datian.demo.thread;

import java.time.LocalDateTime;

/**
 * @author hyx
 * @date 2022/3/27 18:01
 */
public class TwoThread implements Runnable {

    private final Object self;

    public TwoThread(Object self) {
        System.out.println("生成2");
        this.self = self;
    }

    @Override
    public void run() {
        System.out.println("执行了2");
        synchronized (self){
            try {
                self.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("执行完2");

    }
}
