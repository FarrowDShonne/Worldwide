package com.sms.worldwide.Messaging.Custom;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sms.worldwide.R;

public class ViewMessagesLayoutAdapter extends ArrayAdapter<String> {
    public ViewMessagesLayoutAdapter(Context context, String[] messages) {
        super(context, R.layout.messages_layout, messages);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater  messageInflater = LayoutInflater.from(getContext());
        View customView = messageInflater.inflate(R.layout.messages_layout, parent, false);

        String getContactName = getItem(position);
        TextView setContactName = (TextView) customView.findViewById(R.id.contactNameTextView);
        setContactName.setText(getContactName);
        ImageView getContactImage = (ImageView) customView.findViewById(R.id.contactImageView);
        getContactImage.setImageResource(R.drawable.coolguy);
        return customView;

    }
}
