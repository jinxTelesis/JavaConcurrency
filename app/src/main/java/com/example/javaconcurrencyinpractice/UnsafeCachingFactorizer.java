package com.example.javaconcurrencyinpractice;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

//NotThreadSafe
public class UnsafeCachingFactorizer {

    private final AtomicReference<BigInteger> lastNumber = new AtomicReference<BigInteger>();

    private final AtomicReference<BigInteger[]> lastFactiors = new AtomicReference<BigInteger[]>();

    public void blahetc(){

        BigInteger i = new BigInteger("ten"); // requiest

        if(i.equals(lastNumber.get())){
            // do something lastFactors.get();
        }
        else{

        }
    }
}
