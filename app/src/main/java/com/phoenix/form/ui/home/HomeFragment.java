package com.phoenix.form.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProviders;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.form.CariInevestor;
import com.phoenix.form.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private int[] mBerita= new int[]{
            R.drawable.karang, R.drawable.natuna, R.drawable.ekspor
    };
    private String [] mJudul= new String[]{
            "Karang adjie", "Natuna melawan","Ekspor benih kobster"
    };
    Button investor;
    CarouselView carouselView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        investor= (Button) root.findViewById(R.id.btn_investor);
        investor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cariInvestor();
            }
        });

        carouselView= root.findViewById(R.id.berita);
        carouselView.setPageCount(mBerita.length);

        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mBerita[position]);

            }
        });
        return root;
    }

    public void cariInvestor(){
        Intent cariInvest= new Intent(getActivity(),CariInevestor.class);
        startActivity(cariInvest);
    }

}