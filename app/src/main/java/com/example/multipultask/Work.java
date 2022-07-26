package com.example.multipultask;

import android.os.SystemClock;
import android.util.Log;

public class Work implements Runnable{
    private int taskNum;
    private static final String TAG = "work";

    public Work(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        Log.d(TAG, "run: Stared "+taskNum);
        SystemClock.sleep(1000);
        Log.d(TAG, "run: end");

    }
}
