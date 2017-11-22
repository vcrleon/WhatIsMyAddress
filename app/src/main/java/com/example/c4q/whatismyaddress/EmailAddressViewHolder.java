package com.example.c4q.whatismyaddress;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by c4q on 11/21/17.
 */

public class EmailAddressViewHolder extends RecyclerView.ViewHolder {

    private TextView emailAddressView;

    public EmailAddressViewHolder(View itemView) {
        super(itemView);
        emailAddressView = itemView.findViewById(R.id.email_address_textview);
    }
}
