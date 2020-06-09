package com.solutions.intellihealth.Ui.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.solutions.intellihealth.R;

public class VerificationActivity extends AppCompatActivity {
    private MaterialButton btn_done;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        init();
    }

    private void init() {
        btn_done=findViewById(R.id.btn_done);
        btn_done.setOnClickListener(task->{

        });
    }
}