package com.example.binali.upwork_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Activity_A extends AppCompatActivity {

    EditText urname,urpassword;
    Button clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        urname = (EditText) findViewById(R.id.name);
        urpassword = (EditText) findViewById(R.id.password);
        clk = (Button) findViewById(R.id.button2);

    }







}
