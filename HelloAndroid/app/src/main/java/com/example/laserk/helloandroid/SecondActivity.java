package com.example.laserk.helloandroid;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by laserk on 2016/1/9.
 */
public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.second_activity);
        EditText et=(EditText)findViewById(R.id.secondET);
        ComponentName comp=getIntent().getComponent();
        et.setText("Component Package Name is "+comp.getPackageName()+
                "\n component Class name is "
                + comp.getClassName());
    }
}
