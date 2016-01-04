package com.example.laserk.helloandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
    final String TAG="--Activity TAG--";
    EditText et;
    caseThread cTh;
    Button btnFinish,btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "--Activity OnCreate--");
        InitialActivityBtns();
        et=(EditText) findViewById(R.id.calEdit);
        cTh=new caseThread(MainActivity.this);
        cTh.start();
        InitialImageView();
        InitialToasts();
    }

    private void InitialActivityBtns() {
        btnStart=(Button)findViewById(R.id.ActStart);
        btnStart.setOnClickListener(new onStartActivity());
        btnFinish=(Button)findViewById(R.id.ActFinish);
        btnFinish.setOnClickListener(new onFinishActivity());
    }

    public void ClickCal(View source)
    {
        Message msg=new Message();
        msg.what=0x123;
        Bundle bundle=new Bundle();
        bundle.putInt("upper", Integer.parseInt(et.getText().toString()));
        msg.setData(bundle);
        cTh.mHandler.sendMessage(msg);
    }

    private void InitialToasts() {
        Button btnToast1= (Button)findViewById(R.id.toast1);
        btnToast1.setOnClickListener(new ontoast1ClickListener());
        Button btnToast2=(Button)findViewById(R.id.toast2);
        btnToast2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Toast toast = new Toast(MainActivity.this);
                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                             ImageView image = new ImageView(MainActivity.this);
                                             image.setImageResource(R.drawable.swift);
                                             LinearLayout ll = new LinearLayout(MainActivity.this);
                                             ll.addView(image);
                                             TextView tv = new TextView(MainActivity.this);
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

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "--Activity onStart--");
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.d(TAG, "--Activity onRestart--");

    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(TAG, "--Activity onResume--");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG, "--Activity onPause--");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(TAG, "--Activity onStop--");

    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "--Activity onDestroy--");


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

    //Xml listener subscribe
    public void clickHandler(View source)
    {
        TextView tv=(TextView) findViewById(R.id.show);
        tv.setText("Hello Android - " + new java.util.Date());
    }

    class onStartActivity implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent intent =new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }

    class onFinishActivity implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            MainActivity.this.finish();

        }
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


}
