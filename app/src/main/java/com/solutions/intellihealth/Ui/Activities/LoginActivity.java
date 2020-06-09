package com.solutions.intellihealth.Ui.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.solutions.intellihealth.R;

public class LoginActivity extends AppCompatActivity {
    private TextView tv_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_register=findViewById(R.id.tv_register);
        tv_register.setOnClickListener(task->{
            startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
        });
    }
}