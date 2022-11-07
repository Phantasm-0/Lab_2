package org.example;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Integer int1 = 5;
        Integer int2 = 6;
        Date date = new Date(new Date().getTime() + 60000);
        Future future = Timer.GetAfter(int1, int2, (a, b) -> a*b,date);
        System.out.println(future.get());
    }
}