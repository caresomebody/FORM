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

public class OnboardViewPagerAdapter extends PagerAdapter {
    Context mContext;
    List<OnboardItem> mListOnboard;

    public OnboardViewPagerAdapter(Context mContext, List<OnboardItem> mListOnboard) {
        this.mContext = mContext;
        this.mListOnboard = mListOnboard;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutOnboard= inflater.inflate(R.layout.onboard_screen, null);


        ImageView imageSlide= layoutOnboard.findViewById(R.id.onBoardImage);
        TextView judul= layoutOnboard.findViewById(R.id.judulOnboard);
        TextView deskripsi= layoutOnboard.findViewById(R.id.deskripsi);

        judul.setText(mListOnboard.get(position).getJudul());
        deskripsi.setText(mListOnboard.get(position).getDeskripsi());
        imageSlide.setImageResource(mListOnboard.get(position).getOnboardImg());

        container.addView(layoutOnboard);
        return layoutOnboard;
    }

    @Override
    public int getCount() {
        return mListOnboard.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object );
    }
}
