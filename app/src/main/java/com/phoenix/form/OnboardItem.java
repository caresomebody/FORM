package com.phoenix.form;

public class OnboardItem {
    String judul,deskripsi;
    int onboardImg;

    public OnboardItem(String judul, String deskripsi, int onboardImg) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.onboardImg = onboardImg;
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

    public int getOnboardImg() {
        return onboardImg;
    }

    public void setOnboardImg(int onboardImg) {
        this.onboardImg = onboardImg;
    }
}
