package org.example;
import java.util.concurrent.*;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.*;

public class Timer {


     public static Future<Integer> GetAfter(int a, int b, ToIntBiFunction<Integer,Integer> function,Date date) throws InterruptedException {
         while(date.getTime() > new Date().getTime()){
             Thread.sleep(1000);
         }
        ExecutorService service = Executors.newFixedThreadPool(1);
        return service.submit(() ->{

            return function.applyAsInt(a,b);
        });
    }
}
