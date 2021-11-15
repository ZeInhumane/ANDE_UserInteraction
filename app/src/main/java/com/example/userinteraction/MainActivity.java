package com.example.userinteraction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        Intent i ;
        switch (v.getId()) {
            case R.id.btnSharedPref:
                i = new Intent(this, SharedPrefActivity.class);
                startActivity(i);
                break;
            case R.id.btnBoardcastR:
                i = new Intent(this, BroadcastActivity.class);
                startActivity(i);
                break;
            case R.id.btnNotify:
                i = new Intent(this, NotifyActivity.class);
                startActivity(i);
                break;
            // Insert into onClick(View v) method
            case R.id.btnSMSReceived:
                i = new Intent(this, SMSReceived.class);
                startActivity(i);
                break;

        }

    }

}