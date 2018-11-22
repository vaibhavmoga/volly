package com.example.user.volly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class userlogin extends AppCompatActivity {
    EditText e1,e2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        e1=findViewById(R.id.editText5);
        e2=findViewById(R.id.editText6);
        b=findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userlogin();
            }
        });
    }
    public void userlogin()
    {
        final String username = e1.getText().toString();
        final String password = e2.getText().toString();
        if (TextUtils.isEmpty(username)) {
            e1.setError("Please enter your username");
            e1.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            e2.setError("Please enter your password");
            e2.requestFocus();
            return;

        }
    }
}
