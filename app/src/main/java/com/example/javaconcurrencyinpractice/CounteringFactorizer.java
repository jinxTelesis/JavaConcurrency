package com.example.javaconcurrencyinpractice;

import android.app.DownloadManager;

import java.math.BigInteger;
import java.net.ResponseCache;
import java.util.concurrent.atomic.AtomicLong;

//@ThreadSafe
public class CounteringFactorizer {

    private final AtomicLong count = new AtomicLong(0);

    public long getCount() {return count.get();}

    public void service(DownloadManager.Request download, ResponseCache responseCache){

        BigInteger i = new BigInteger("ten");

        count.incrementAndGet(); // atomic

    }
}
