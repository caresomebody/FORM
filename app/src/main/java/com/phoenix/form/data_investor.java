package com.phoenix.form;

import android.widget.TextView;

public class data_investor {
    private String nama,kebutuhan,status;
    private int foto_investor;

    public data_investor(String nama, String kebutuhan, String status, int foto_investor) {
        this.nama = nama;
        this.kebutuhan = kebutuhan;
        this.status = status;
        this.foto_investor = foto_investor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKebutuhan() {
        return kebutuhan;
    }

    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFoto_investor() {
        return foto_investor;
    }

    public void setFoto_investor(int foto_investor) {
        this.foto_investor = foto_investor;
    }
}
