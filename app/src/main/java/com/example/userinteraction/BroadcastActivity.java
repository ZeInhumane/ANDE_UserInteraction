package com.example.userinteraction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BroadcastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcastrec);
    }

    public void onClickShowBroadcast(View view) {
        // Get the text from Edit Text Box
        EditText st = (EditText)findViewById(R.id.txtMsg);

        Intent intent = new Intent(this,ReceivedBroadCast.class);
        intent.putExtra("msg",st.getText().toString());
        intent.setAction("com.example.CUSTOM_INTENT");
        sendBroadcast(intent);
    }

}