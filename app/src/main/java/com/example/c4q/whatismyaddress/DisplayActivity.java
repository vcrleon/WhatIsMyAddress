package com.example.c4q.whatismyaddress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView viewOne = findViewById(R.id.display_textview1);
        TextView viewTwo = findViewById(R.id.display_textview2);
    }
}
