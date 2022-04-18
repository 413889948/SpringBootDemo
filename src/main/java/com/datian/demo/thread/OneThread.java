package com.datian.demo.thread;

import com.sun.corba.se.pept.transport.Connection;
import lombok.SneakyThrows;

/**
 * @author hyx
 * @date 2022/3/27 18:01
 */
public class OneThread implements Runnable {
    private final Object self;

    public OneThread(Object self) {
        this.self = self;
    }

    @Override
    public void run() {
        System.out.println("执行了1");
        synchronized (self){
            try {
                self.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("执行完1");


    }
}
