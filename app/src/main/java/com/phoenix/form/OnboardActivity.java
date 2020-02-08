package com.phoenix.form;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class OnboardActivity extends AppCompatActivity {

    private ViewPager onboard;
    Button masuk;
    OnboardViewPagerAdapter onboardViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        masuk= (Button) findViewById(R.id.button);


        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk= new Intent(OnboardActivity.this,Welcome.class);
                startActivity(masuk);
            }
        });

        List<OnboardItem> mList = new ArrayList<>();
        mList.add(new OnboardItem("zzzzz","",R.drawable.onboard1));
        mList.add(new OnboardItem("UwU","",R.drawable.onboard2));
        mList.add(new OnboardItem("UwU","",R.drawable.onboard3));


        onboard = findViewById(R.id.viewPager);
        onboardViewPagerAdapter = new OnboardViewPagerAdapter(this,mList);
    }
}
