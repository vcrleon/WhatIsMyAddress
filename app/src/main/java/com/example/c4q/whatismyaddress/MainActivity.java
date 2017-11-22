package com.example.c4q.whatismyaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "address_shared_preferences";
    private SharedPreferences address;
    private EditText email;
    private Button buttonOne;
    private Button buttonTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email_edittext);
        buttonOne = findViewById(R.id.button01);
        buttonTwo = findViewById(R.id.button02);

        address = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = address.edit();
                editor.putString("email address", email.getText().toString());
                email.setText(address.getString("email address", null));
                editor.commit();
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                intent.putExtra("sharedpref", SHARED_PREFS_KEY);
                startActivity(intent);


            }
        });

    }
}
