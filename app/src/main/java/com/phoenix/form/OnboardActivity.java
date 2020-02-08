package com.phoenix.form;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OnboardActivity extends AppCompatActivity {

    private ViewPager onboard;
    introViewPaggerAdapter introViewPaggerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<OnboardItem> listt = new ArrayList<>();
        listt.add(new OnboardItem("UwU","",R.drawable.onboard1));
        listt.add(new OnboardItem("UwU","",R.drawable.onboard2));
        listt.add(new OnboardItem("UwU","",R.drawable.onboard3));

        onboard = findViewById(R.id.screen_onboard);
        introViewPaggerAdapter = new introViewPaggerAdapter(this,listt);
    }
}
