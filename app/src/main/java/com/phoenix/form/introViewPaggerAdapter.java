package com.phoenix.form;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class introViewPaggerAdapter extends PagerAdapter {
   Context conn;
   List<OnboardItem> listt;

    public introViewPaggerAdapter(Context conn, List<OnboardItem> listt) {
        this.conn = conn;
        this.listt = listt;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) conn.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.onboard_screen,null);

        ImageView slideImage = layoutScreen.findViewById(R.id.onBoardImage);
        TextView slideText = layoutScreen.findViewById(R.id.judulOnboard);
        TextView slideDeskripsi = layoutScreen.findViewById(R.id.deskripsi);

        slideText.setText(listt.get(position).getJudul());
        slideDeskripsi.setText(listt.get(position).getDeskripsi());
        slideImage.setImageResource(listt.get(position).getImageView());

        container.addView(layoutScreen);

        return layoutScreen;

    }

    @Override
    public int getCount() {
        return listt.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
    }
}
