package com.example.userinteraction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceivedBroadCast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        CharSequence iData = intent.getStringExtra("msg");
        Toast.makeText(context,"Received Message: "+ iData ,Toast.LENGTH_LONG).show();
    }
}

