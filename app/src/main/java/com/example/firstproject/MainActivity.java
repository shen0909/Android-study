package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.edit_text);
        setContentView(R.layout.progress_bar);
        /*TextView textView = findViewById(R.id.tv_one);
        textView.setText("小杨最厉害");*/

       /* Button button = findViewById(R.id.btn_one);
        // 点击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("你点击了"+button.getText());
            }
        });
        // 长按事件
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });
        // 触摸方法
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });*/

        progressBar = findViewById(R.id.pd_one);
        Button button = findViewById(R.id.btn_pb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(progressBar.getVisibility() == View.VISIBLE){
                    progressBar.setVisibility(View.GONE);
                }else{
                    progressBar.setVisibility(View.VISIBLE);
                }
            }
        });

        ProgressBar progressBar1 = findViewById(R.id.pb_two);
        Button button1 = findViewById(R.id.btn_pd_add);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int progress = progressBar1.getProgress();
                progress += 1;
                progressBar1.setProgress(progress);
            }
        });
    }
    // 显示进度条
    public void showPb(View view) {
        if(progressBar.getVisibility() == View.VISIBLE){
            progressBar.setVisibility(View.GONE);
        }else{
            progressBar.setVisibility(View.VISIBLE);
        }
    }
}