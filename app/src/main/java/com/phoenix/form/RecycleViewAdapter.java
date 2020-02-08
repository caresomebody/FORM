package com.phoenix.form;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.DataViewHolder> {

    Context isi;
    List<data_investor>  mData;

    public RecycleViewAdapter(Context isi, List<data_investor> mData) {
        this.isi = isi;
        this.mData = mData;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(isi).inflate(R.layout.data_hotel,parent,false);
        DataViewHolder xHolder= new DataViewHolder(v);
        return xHolder;
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {

        holder.nama.setText(mData.get(position).getNama());
        holder.kebutuhan.setText(mData.get(position).getKebutuhan());
        holder.foto.setImageResource(mData.get(position).getFoto_investor());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {

        private TextView nama,kebutuhan,status;
        private ImageView foto;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            nama=(TextView) itemView.findViewById(R.id.nama_investor);
            kebutuhan=(TextView) itemView.findViewById(R.id.kebutuhan);
            foto=(ImageView) itemView.findViewById(R.id.gambar_investor);

        }
    }
}
