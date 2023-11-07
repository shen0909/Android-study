package com.example.mynotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    定义一个全局的私有的NotificationManager对象
    private  NotificationManager notificationManager;

    private  Notification notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 创建notificationManager
        /* 1、通过getSystemService(String) 方法 可以通过Android系统级服务的句柄，返回对应的对象
         * 此时，需要返回的是NotificationManager 对象，所以应该使用getSystemService(NOTIFICATION_SERVICE)*/
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // 创建Notification 对象
        new NotificationCompat.Builder(this,"notiChID")
                .build();
    }

    // 发起通知方法
    public void fireNotification(View view) {

    }

    // 取消通知方法
    public void cancelNotification(View view) {
    }
}