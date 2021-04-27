package com.current.highcurrency.base.atomic;


import com.current.highcurrency.base.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAdder;

@Slf4j
@ThreadSafe
public class AtomicExample4 {

    //初始化到内存中的值
    private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void main(String[] args) throws Exception{
        //expect值与内存值一致的话更新成功，否则失败，update是准备更新到的内容
        count.compareAndSet(0, 2);
        log.info("count:{}", count.get());
        count.compareAndSet(0, 1);
        log.info("count:{}", count.get());
        count.compareAndSet(1,3 );
        log.info("count:{}", count.get());
        count.compareAndSet(2,4 );
        log.info("count:{}", count.get());
        count.compareAndSet(3,5 );
        log.info("count:{}", count.get());

    }


}
