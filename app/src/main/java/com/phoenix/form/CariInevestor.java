package com.phoenix.form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CariInevestor extends AppCompatActivity {
private RecyclerView recyclerView;
private List<data_investor> listInvest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_inevestor);
        listInvest=new ArrayList<>();
        listInvest.add(new data_investor("Grand Muti","30 ton ubur-ubur","", R.drawable.muti));
        listInvest.add(new data_investor("Rose","30 ton ikan lele","",R.drawable.sunrise));
        listInvest.add(new data_investor("Laut Biru", "1 ton Ikan Paus","",R.drawable.lautbiru));
        listInvest.add(new data_investor("Arnawa","10 ton ikan Arwana", "", R.drawable.arnawa));
    }
}
