package com.company.operationsWithTime;

import java.util.concurrent.TimeUnit;

/**
 * Created by Artem on 17.11.2016.
 */
public class TimeDelay {

    public TimeDelay(){
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
