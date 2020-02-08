package com.phoenix.form;

import android.content.Intent;
import android.support.design.widget.TabLayout;
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
    TabLayout indikator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        masuk= (Button) findViewById(R.id.button);
        indikator= findViewById(R.id.tabLayout);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk= new Intent(OnboardActivity.this,Welcome.class);
                startActivity(masuk);
            }
        });

        List<OnboardItem> mList = new ArrayList<>();
        mList.add(new OnboardItem("Apa itu FORM?","Aplikasi FORM akan menjawab segala kebutuhan nelayan dari segi peminjaman modal, penyediaan produk dan pendidikan juga pengetahuan nelayan, serta membuka akses pasar untuk peningkatan pendapatan nelayan, juga membuka lapangan pekerjaan untuk pemuda di desa.\n",R.drawable.onboard1));
        mList.add(new OnboardItem("Kenapa harus FORM?","Form akan meregenerasi nelayan menjadi nelayan cerdas dengan berbagai fiturnya yang menyelesaikan segala tantangan dari permodalan, pasokan alat dan produk, edukasi dan mempertemukan nelayan dengan prospek bisnis berkelanjutan. Form juga akan menjadi wadah pemuda berpartisipasi dengan merebranding proses perikanan tangkap unggul.\n",R.drawable.onboard2));
        mList.add(new OnboardItem("Cara bergabung","Klik bergabung pada tombol di bawah ini dan pilih peran yang sesuai dengan anda. Ikuti petunjuk dan peraturannya. Setelah itu anda dapat menikmati fitur-fitur kami. Temukan ekosistem ekopopulis  disini. Meningkatkan perekonomian dengan pertimbangan kesejahteraan dan keberlanjutan alam.\n",R.drawable.onboard3));


        onboard = findViewById(R.id.viewPager);
        onboardViewPagerAdapter = new OnboardViewPagerAdapter(this,mList);
        onboard.setAdapter(onboardViewPagerAdapter);

        indikator.setupWithViewPager(onboard);
    }
}
