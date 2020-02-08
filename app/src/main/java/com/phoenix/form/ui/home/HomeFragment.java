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

import com.phoenix.form.CariInevestor;
import com.phoenix.form.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button investor;

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
        return root;
    }

    public void cariInvestor(){
        Intent cariInvest= new Intent(getActivity(),CariInevestor.class);
        startActivity(cariInvest);
    }

}