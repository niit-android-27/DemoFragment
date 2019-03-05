package com.luan.session10_view.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragmentTwo extends Fragment {
    public static MyFragmentTwo newInstance(){
       MyFragmentTwo myFragmentTwo =new MyFragmentTwo();
       return myFragmentTwo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment_two,null,false);
    }
}
