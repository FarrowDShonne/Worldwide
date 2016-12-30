package com.sms.worldwide.Messaging;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sms.worldwide.R;

public class MainActivity extends AppCompatActivity {

    private Button switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, ViewMessagesActivity.class);
        startActivity(i);

    }

    public void switchButton(View view) {

    }
}
