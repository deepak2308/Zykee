package com.example.deepakkumar.login;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    TextView forget,sign;
    EditText user,pass;
    Button fb,goo,login;

    AlertDialog.Builder builder;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        sign=(TextView)findViewById(R.id.signup);
        forget=(TextView)findViewById(R.id.forgetpassword);
        fb=(Button)findViewById(R.id.fbb);
        goo=(Button)findViewById(R.id.google);
        login=(Button)findViewById(R.id.loginn);

        builder=new AlertDialog.Builder(LogIn.this);



        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SignUpp.class);
                startActivity(intent);
            }
        });

        forget.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getApplicationContext(),forgetpassword.class);
                        startActivity(intent);
            }
        });


    }
}
