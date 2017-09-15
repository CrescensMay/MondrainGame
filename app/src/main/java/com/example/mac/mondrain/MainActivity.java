package com.example.mac.mondrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import mondrainApp.ColorWheel;

public class MainActivity extends AppCompatActivity {

    private TextView jTextViewTop1;
    private TextView jTextViewTop2;
    private TextView jTextViewMiddle1;
    private TextView jTextViewMiddle2;
    private TextView jTextViewBottom1;
    private TextView jTextViewBottom2;
    private TextView jTextViewBottom3;
    private TextView jTextViewBottom4;
    private TextView jTextViewBottom5;
    private TextView jTextViewTitle;
//    private View jRelativeLayout;
    private ColorWheel jColorWheel = new ColorWheel();
    private static int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        jTextViewTitle.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        jTextViewTop1 = (TextView) findViewById(R.id.textFieldTop1);
        jTextViewTop2 = (TextView) findViewById(R.id.textFieldTop2);

        jTextViewMiddle1 = (TextView) findViewById(R.id.textFieldMiddle1);
        jTextViewMiddle2 = (TextView) findViewById(R.id.textFieldMiddle2);

        jTextViewBottom1 = (TextView) findViewById(R.id.textFieldBottom1);
        jTextViewBottom2 = (TextView) findViewById(R.id.textFieldBottom2);
        jTextViewBottom3 = (TextView) findViewById(R.id.textFieldBottom3);
        jTextViewBottom4 = (TextView) findViewById(R.id.textFieldBottom4);
        jTextViewBottom5 = (TextView) findViewById(R.id.textFieldBottom5);


        jTextViewTop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewTop1.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewTop1.setText(colorName);

            }
        });
        jTextViewTop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewTop2.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewTop2.setText(colorName);
            }
        });

        jTextViewMiddle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewMiddle1.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewMiddle1.setText(colorName);

            }
        });
        jTextViewMiddle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewMiddle2.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewMiddle2.setText(colorName);

            }
        });

        jTextViewBottom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewBottom1.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewBottom1.setText(colorName);

            }
        });
        jTextViewBottom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewBottom2.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewBottom2.setText(colorName);

            }
        });
        jTextViewBottom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewBottom3.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewBottom3.setText(colorName);

            }
        });
        jTextViewBottom4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewBottom4.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewBottom4.setText(colorName);

            }
        });
        jTextViewBottom5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color = jColorWheel.getColor();
                jTextViewBottom5.setBackgroundColor(color);
                String colorName = String.valueOf(color);
                jTextViewBottom5.setText(colorName);

            }
        });
//        String top1 = jTextViewTop1.getText().toString();
//        String top2 = jTextViewTop2.getText().toString();
//        String middle1 = jTextViewMiddle1.getText().toString();
//        String middle2 = jTextViewMiddle2.getText().toString();
//        String bottom1 = jTextViewBottom1.getText().toString();
//        String bottom2 = jTextViewBottom2.getText().toString();
//        String bottom3 = jTextViewBottom3.getText().toString();
//        String bottom4 = jTextViewBottom4.getText().toString();
//        String bottom5 = jTextViewBottom5.getText().toString();
//
//        if(top1.equals(top2) && top1.equals(middle1) && top1.equals(middle2) && top1.equals(bottom1) && top1.equals(bottom2) && top1.equals(bottom3 ) && top1.equals(bottom4) && top1.equals(bottom5)
//                && top2.equals(middle1)&& top2.equals(middle2) && top2.equals(bottom1) && top2.equals(bottom2) && top2.equals(bottom3) && top2.equals(bottom4) && top2.equals(bottom5)
//                && middle1.equals(middle2) && middle1.equals(bottom1) && middle1.equals(bottom2) && middle1.equals(bottom3) && middle1.equals(bottom4) && middle1.equals(bottom5)
//                && middle2.equals(bottom1) && middle2.equals(bottom2) && middle2.equals(bottom3) && middle2.equals(bottom4) && middle2.equals(bottom5)){
//
//            Toast.makeText(MainActivity.this,"You've Made all colors uniform",Toast.LENGTH_LONG
//            ).show();
//        }
        Toast.makeText(MainActivity.this,"App succesfully launched!",Toast.LENGTH_LONG).show();

    }
}
