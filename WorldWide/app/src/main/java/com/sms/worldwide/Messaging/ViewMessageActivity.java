package com.sms.worldwide.Messaging;

import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.sms.worldwide.R;

public class ViewMessageActivity extends AppCompatActivity {

    private TextView contactNameTextView;
    private ImageButton sendTextImageButton;
    private EditText messageInputTextView;
    private Bundle grabInfo;
    private String contactName, contactNumber, message;
    private SmsManager smsManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);


        grabInfo = getIntent().getExtras();

        contactNameTextView = (TextView) findViewById(R.id.contactNameTextView);
        sendTextImageButton = (ImageButton) findViewById(R.id.sendTextImageButton);
        messageInputTextView = (EditText) findViewById(R.id.messageInputTextView);

        if(grabInfo.getString("contactName") != null){
            contactNameTextView.setText(grabInfo.getString("contactName"));
        }

        contactNumber = "7329635214";

        message = "Testing My SMS APP - Sent From SMS APP";

        sendTextImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    try {
                        smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(contactNumber, null, message, null, null);
                        Toast.makeText(getApplicationContext(), "Sent", Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Message Failed", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                }

        });


    }
}
