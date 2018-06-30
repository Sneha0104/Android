package com.example.snehasaj.nhpc;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static Button LOGIN;
    private static TextView LOGIN_PAGE;
    private static TextView Attempt;
    private static TextView attempt_count;
    private static EditText username;
    private static EditText password;
    private static EditText department_id;
    private int counter = 5;
    private static TextView user_regis;
    private Intent packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LOGIN = (Button) findViewById(R.id.button_login);
        LOGIN_PAGE = (TextView) findViewById(R.id.textView_login);
        Attempt = (TextView) findViewById(R.id.textView_attempt);
        attempt_count = (TextView) findViewById(R.id.textView_count);
        username = (EditText) findViewById(R.id.editText_username);
        password = (EditText) findViewById(R.id.editText_password);
        department_id = (EditText) findViewById(R.id.editText);
        user_regis = (TextView) findViewById(R.id.textView9);
        attempt_count.setText("no of attempts remaining : 5");

        LOGIN.setOnClickListener((view) -> {
            validate(username.getText().toString(), password.getText().toString(),department_id.getText().toString());
        });
        user_regis.setOnClickListener((View view) -> {
            startActivity(new Intent(MainActivity.this,Employeedirec.class));
        });


    }

    private void validate(String userName, String userPassword, String deptno) {
        if ((userName.equals("Admin")) && (userPassword.equals("1234")) && deptno.equals("01")) {
            Intent intent = new Intent(MainActivity.this,Employeedirec.class);
            startActivity(intent);
        }
        else {
            counter--;
            attempt_count.setText("the remaining attempts"+ String.valueOf(counter));
            if (counter == 0) {
                LOGIN.setEnabled(false);
            }

        }


                                                                          }
}