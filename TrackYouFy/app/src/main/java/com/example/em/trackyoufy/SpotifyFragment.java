package com.example.em.trackyoufy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emiliaaxen on 16-05-05.
 */
public class SpotifyFragment extends Fragment {

    public SpotifyFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_spotify, container,
                false);
        return view;

    }
}