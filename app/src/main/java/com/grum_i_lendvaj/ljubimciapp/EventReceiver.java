package com.grum_i_lendvaj.ljubimciapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

import static android.content.Context.NOTIFICATION_SERVICE;

public class EventReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Notification notification = new NotificationCompat.Builder(context)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Podsjetnik")
                .setContentText(intent.getStringExtra("description"))
                .setVibrate(new long[]{0, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10,
                        20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10,
                        20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10,
                        20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10,
                        20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10,
                        20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10})
                .build();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);

        notificationManager.notify(intent.getIntExtra("id", 0), notification);
    }
}
