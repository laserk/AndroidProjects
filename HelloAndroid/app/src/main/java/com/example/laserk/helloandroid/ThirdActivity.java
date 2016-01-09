package com.example.laserk.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Set;

/**
 * Created by LKang on 1/9/2016.
 */
public class ThirdActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.third_activity);
        String strAction=getIntent().getAction();
        EditText actionET=(EditText)findViewById(R.id.thirdETAction);
        actionET.setText(strAction);

        Set<String> setCategories=getIntent().getCategories();
        EditText categroriesET=(EditText)findViewById(R.id.thirdETCategory);
        categroriesET.setText(setCategories.toString());

    }
}
