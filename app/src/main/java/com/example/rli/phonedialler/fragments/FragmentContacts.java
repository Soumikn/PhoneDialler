package com.example.rli.phonedialler.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rli.phonedialler.R;

public class FragmentContacts extends Fragment {

    private View v;

    public FragmentContacts(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v=inflater.inflate( R.layout.frag_contacts,container,false );
        return v;

    }
}
