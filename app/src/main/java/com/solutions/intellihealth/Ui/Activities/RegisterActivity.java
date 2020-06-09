package com.solutions.intellihealth.Ui.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.solutions.intellihealth.R;

public class RegisterActivity extends AppCompatActivity {
    private TextView tv_login;
    private Button btn_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
        setUp();
    }

    private void setUp() {
        tv_login.setOnClickListener(task->{
            startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
        });
        btn_signUp.setOnClickListener(task->{
            startActivity(new Intent(RegisterActivity.this,OtpActivity.class));
        });
    }

    private void init() {
        btn_signUp=findViewById(R.id.btn_signUp);
        tv_login=findViewById(R.id.tv_login);
    }
}