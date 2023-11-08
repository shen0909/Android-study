package com.example.mynotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    定义一个全局的私有的NotificationManager对象
    private  NotificationManager notificationManager;

    private  Notification notification;

    private  String channelID = "notificationChannelId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1、创建 NotificationManager
        /* 1、通过getSystemService(String) 方法 可以通过Android系统级服务的句柄，返回对应的对象
         * 此时，需要返回的是NotificationManager 对象，所以应该使用getSystemService(NOTIFICATION_SERVICE)*/
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);


        System.out.println("Android sdk"+Build.VERSION.SDK_INT);

        // 2、判断当前版本是否需要创建 NotificationChannel
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            System.out.println("当前版本大于 Android 8.0");
            /* id: channelID 和 notification 一致
             * name: 用户可以看见的名字
             * importance: 重要性*/
            NotificationChannel notificationChannel = new NotificationChannel(channelID,"这是一个测试通知",NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(notificationChannel);
        }

        // 3、创建Notification 对象,并设置通知的属性
        notification = new NotificationCompat.Builder(this,channelID)
                .setContentInfo("通知标题")
                .setContentText("这是我写的通知内容")
                .setSmallIcon(R.drawable.ic_baseline_thumb_up_24)
                .build();
    }

    // 发起通知方法
    public void fireNotification(View view) {
        System.out.println("我click发起通知方法");
        notificationManager.notify(1, notification);

    }

    // 取消通知方法
    public void cancelNotification(View view) {
    }
}