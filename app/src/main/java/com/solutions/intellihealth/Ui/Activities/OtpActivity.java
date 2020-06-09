package com.solutions.intellihealth.Ui.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.solutions.intellihealth.R;

public class OtpActivity extends AppCompatActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        init();
    }

    private void init() {
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(task->{
            startActivity(new Intent(OtpActivity.this,VerificationActivity.class));
        });
    }
}