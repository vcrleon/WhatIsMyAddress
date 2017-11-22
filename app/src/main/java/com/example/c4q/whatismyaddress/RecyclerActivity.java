package com.example.c4q.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RecyclerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.shared_pref_recycler_view);

        Intent intent = getIntent();
        SharedPreferences recyclerPrefs = getApplicationContext().getSharedPreferences(intent.getStringExtra("sharedPref"), MODE_PRIVATE);

        List<Object> values = new ArrayList<>();

        Map<String, ?> allEntries = recyclerPrefs.getAll();
        for(Map.Entry<String, ?> entry : allEntries.entrySet()) {
            values.add(entry.getValue());
        }

        EmailAddressAdapter emailAddressAdapter = new EmailAddressAdapter(values);

    }
}
