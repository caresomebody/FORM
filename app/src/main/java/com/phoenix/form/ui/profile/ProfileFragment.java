package com.phoenix.form.ui.profile;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.phoenix.form.R;
import com.phoenix.form.Timeline;

public class ProfileFragment extends Fragment {
    private ProfileViewModel profileViewModel;
    Button timeline;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        profileViewModel= ViewModelProviders.of(this).get(ProfileViewModel.class);
        View root= inflater.inflate(R.layout.fragment_profile, container, false);

        timeline=(Button) root.findViewById(R.id.timeline);
        timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liatTimeline();
            }
        });
        return root;
    }

    public void liatTimeline(){
        Intent liatTimeline= new Intent(getActivity(), Timeline.class);
        startActivity(liatTimeline);
    }
}
