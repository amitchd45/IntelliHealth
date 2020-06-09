package com.solutions.intellihealth.Ui.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.solutions.intellihealth.Adapters.SwipePagerAdapter;
import com.solutions.intellihealth.R;

import me.relex.circleindicator.CircleIndicator;

public class StartActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private CircleIndicator sliderDotspanel;
    private int dotscount;
    int currentPage = 0;
    int NUM_PAGES = 0;
    private SwipePagerAdapter swipePagerAdapter;
    private TextView tv_register;
    private Button btn_signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        init();
        setSwipe();
        setUp();
    }

    private void setUp() {
        btn_signIn.setOnClickListener(task->{
            startActivity(new Intent(StartActivity.this,LoginActivity.class));

        });
        tv_register.setOnClickListener(task->{
            startActivity(new Intent(StartActivity.this,RegisterActivity.class));
        });
    }

    private void init() {
        btn_signIn =findViewById(R.id.btn_signIn);
        tv_register =findViewById(R.id.tv_register);
        viewPager =findViewById(R.id.viewPager);
        sliderDotspanel =findViewById(R.id.SliderDots);
    }

    private void setSwipe() {

        swipePagerAdapter = new SwipePagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(swipePagerAdapter);

        sliderDotspanel.setViewPager(viewPager);
        swipePagerAdapter.notifyDataSetChanged();

    }
}