package com.sms.worldwide.Messaging;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.sms.worldwide.Messaging.Custom.ViewMessagesLayoutAdapter;
import com.sms.worldwide.R;
import com.sms.worldwide.Settings.Settings;

public class ViewMessagesActivity extends AppCompatActivity {

    private ImageButton settingsButton, newMessageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_messages);

        String[] messages = {"Ape Boy", "Lazarito", "Dad", "Mom", "Pop", "Dad"};
        ListAdapter messageAdapter = new ViewMessagesLayoutAdapter(this, messages);
        ListView messagingListView = (ListView) findViewById(R.id.messagingListView);
        messagingListView.setAdapter(messageAdapter);

        messagingListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String message = String.valueOf(adapterView.getItemAtPosition(i));
                       Intent openMessageView = new Intent(getApplicationContext(), ViewMessageActivity.class);
                        openMessageView.putExtra("contactName", message);
                        startActivity(openMessageView);
                    }
                }
        );

        settingsButton = (ImageButton) findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Settings.class);
                startActivity(i);
            }
        });

        newMessageButton = (ImageButton) findViewById(R.id.newMessageButton);
        newMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
