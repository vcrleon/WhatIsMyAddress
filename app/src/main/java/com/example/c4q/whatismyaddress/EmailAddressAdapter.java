package com.example.c4q.whatismyaddress;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by c4q on 11/21/17.
 */

public class EmailAddressAdapter extends RecyclerView.Adapter<EmailAddressViewHolder> {

    private List<Object> valueList;


    public EmailAddressAdapter(List<Object> valueList) {
        this.valueList = valueList;
    }

    @Override
    public EmailAddressViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(EmailAddressViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return valueList.size();
    }
}
