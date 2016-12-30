package com.sms.worldwide.Settings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.sms.worldwide.Messaging.ViewMessagesActivity;
import com.sms.worldwide.R;

public class Settings extends AppCompatActivity {

    String settingItems[] = {"Native Language", "Ringtone", "Virbration", };
    ArrayAdapter<String> adapter;
    ListView settingsListView;
    ImageButton closeSettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_settings);

        settingsListView = (ListView) findViewById(R.id.settingsListView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, settingItems);
        settingsListView.setAdapter(adapter);

        settingsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String message = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        closeSettingsButton = (ImageButton) findViewById(R.id.closeSettingsButton);
        closeSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ViewMessagesActivity.class);
                startActivity(i);
            }
        });

    }
}
