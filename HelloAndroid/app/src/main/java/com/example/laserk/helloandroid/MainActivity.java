package com.example.laserk.helloandroid;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    int [] images =new int[]{
            R.drawable.java,
            R.drawable.javaee,
            R.drawable.swift,
            R.drawable.ajax,
            R.drawable.html,};
    int currentImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearMain = (LinearLayout) findViewById(R.id.root);
        final ImageView image = new ImageView(this);
        linearMain.addView(image);
        image.setImageResource(images[0]);
        //anonymous listener
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(images[++currentImg % images.length]);
            }
        });

    }
    //Xml listener subscribe
public void clickHandler(View source)
{
    TextView tv=(TextView) findViewById(R.id.show);
    tv.setText("Hello Android - " +new java.util.Date());
}
}
