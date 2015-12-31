package com.example.laserk.helloandroid;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laserk on 2015/12/31.
 */
public class caseHandler extends Handler {
    Context mContext;
    public caseHandler(Context context)
    {
        mContext=context;
    }
    @Override
    public void handleMessage (Message msg)
    {
        if (msg.what==0x123) {
        int upper=msg.getData().getInt("upper");
            List<Integer> nums=new ArrayList<Integer>();
            outer:
            for (int i=2 ;i<=upper;i++)
            {
                for (int j=2;j<=Math.sqrt(i);j++)
                {
                    if (i!=2 && i%j==0)
                        continue  outer;
                }
                nums.add(i);
            }
            Toast.makeText(mContext,nums.toString(),Toast.LENGTH_LONG).show();
        }
    }


}
