package com.example.laserk.helloandroid;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
        InitialImageView();
        InitialToasts();
    }

    private void InitialToasts() {
        Button btnToast1= (Button)findViewById(R.id.toast1);
        btnToast1.setOnClickListener(new ontoast1ClickListener());
        Button btnToast2=(Button)findViewById(R.id.toast2);
        btnToast2.setOnClickListener(new View.OnClickListener ()
        {
             @Override
             public void onClick(View v)
             {
                Toast toast=new Toast(MainActivity.this);
                 toast.setGravity(Gravity.CENTER, 0, 0);
                 ImageView image=new ImageView(MainActivity.this);
                 image.setImageResource(R.drawable.swift);
                 LinearLayout ll =new LinearLayout(MainActivity.this);
                 ll.addView(image);
                 TextView tv=new TextView(MainActivity.this);
                 tv.setText("The Information With JPG");
                 tv.setTextSize(24);
                 tv.setTextColor(Color.MAGENTA);
                 ll.addView(tv);
                 toast.setView(ll);
                 toast.setDuration(Toast.LENGTH_LONG);
                 toast.show();
             }

             }
        );
    }

    private void InitialImageView() {
        //imageView
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
    //inner class listener
    class ontoast1ClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
        Toast toast = Toast.makeText(MainActivity.this,
                "A Smiple infomation from Toast button 1",
                Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    //Xml listener subscribe
public void clickHandler(View source)
{
    TextView tv=(TextView) findViewById(R.id.show);
    tv.setText("Hello Android - " +new java.util.Date());
}
}
