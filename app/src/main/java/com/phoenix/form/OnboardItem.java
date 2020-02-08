package com.phoenix.form;

public class OnboardItem {
    String judul,deskripsi;
    int imageView;

    public OnboardItem(String judul, String deskripsi, int imageView) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.imageView = imageView;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}
