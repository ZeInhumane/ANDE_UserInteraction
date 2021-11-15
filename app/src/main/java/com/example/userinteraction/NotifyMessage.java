package com.example.userinteraction;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class NotifyMessage extends AppCompatActivity {
    // id for Notification Channel
    public static final String NOTIFICATION_CHANNEL_ID = "10001";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);

        final Button notify = (Button) findViewById(R.id.notify);

        notify.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(getBaseContext(),NOTIFICATION_CHANNEL_ID);
                builder.setSmallIcon(android.R.drawable.ic_dialog_alert);
                Intent intent = new Intent(getBaseContext(), NotifyMessage.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(getBaseContext(), 0, intent,0);
                builder.setContentIntent(pendingIntent);
                builder.setSmallIcon(R.drawable.stat_notify_chat);
                builder.setContentTitle("Notifications Title");
                builder.setContentText("Your notification content here.");

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O)
                {
                    int importance = NotificationManager.IMPORTANCE_HIGH;
                    NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "NOTIFICATION_CHANNEL_NAME", importance);

                    builder.setChannelId(NOTIFICATION_CHANNEL_ID);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                // Will display the notification in the notification bar
                notificationManager.notify(1, builder.build());
            }

        });
    }

}
