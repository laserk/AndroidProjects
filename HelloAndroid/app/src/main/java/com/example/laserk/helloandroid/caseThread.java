package com.example.laserk.helloandroid;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/**
 * Created by laserk on 2015/12/31.
 */
public class caseThread extends Thread {
    public Handler mHandler;
    private Context mContext;
    public caseThread (Context context){
        mContext=context;
    }
    public void run (){
        Looper.prepare();
        mHandler=new caseHandler(mContext);
        Looper.loop();
    }

}
