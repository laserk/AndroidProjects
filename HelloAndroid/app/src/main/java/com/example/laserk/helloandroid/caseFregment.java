package com.example.laserk.helloandroid;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by laserk on 2016/1/4.
 */
public class caseFregment extends Fragment {
    final String TAG ="==Fregment TAG==";

    @Override
    public void onDetach()
    {
        super.onDetach();
        Log.d(TAG, "--onDetach--");
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "--onCreate--");
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle data)
    {
        Log.d(TAG, "--onCreateView--");
        View tv=inflater.inflate(R.layout.fragment_case,container,false);

        ((TextView) tv.findViewById(R.id.fragtv)).setText("Test Fragment");
        return tv;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "--onActivityCreated--");
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "--onStart--");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(TAG, "--onStop--");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(TAG, "--onResume--");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG, "--onPause--");
    }
    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d(TAG, "--onDestoryView--");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "--onDestroy--");
    }

}
