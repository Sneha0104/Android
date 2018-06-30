package com.example.snehasaj.nhpc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class userpage extends AppCompatActivity {
    private static Button ADD_button;
    private static Button DELETE_button;
    private static Button UPDATE_button;
    private static TextView Welcome_To_Second_Page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
    }
}
