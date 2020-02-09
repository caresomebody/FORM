package com.phoenix.form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends BaseAdapter {
    private Context context;
    private ArrayList<hotel> hotel;

    public adapter(CariInevestor cariInevestor) {

    }

    public void setHotel(ArrayList<hotel> hotel){
        this.hotel = hotel;
    }

    public void setContext(Context context) {
        this.context = context;
        hotel = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return hotel.size();
    }

    @Override
    public Object getItem(int i){
        return hotel.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView (int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.data_hotel, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        hotel hotel = (hotel) getItem(i);
        viewHolder.bind (hotel);
        return view;

    }

    private class ViewHolder {
        private TextView nama_hotel;
        private TextView butuh_ikan;
        private ImageView gambar_hotel;

        ViewHolder(View view){
            nama_hotel = view.findViewById(R.id.nama_investor);
            butuh_ikan = view.findViewById(R.id.kebutuhan);
            gambar_hotel = view.findViewById(R.id.gambar_investor);
        }

        public void bind(com.phoenix.form.hotel hotel) {
            nama_hotel.setText(hotel.getNamaHotel());
            butuh_ikan.setText(hotel.getKebutuhanIkan());
            gambar_hotel.setImageResource(hotel.getGambar());
        }
    }
}
