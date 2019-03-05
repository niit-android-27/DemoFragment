package com.luan.session10_view.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyFragmentOne extends Fragment {
    public static MyFragmentOne newInstance(String value){
        MyFragmentOne myFragmentOne = new MyFragmentOne();
        Bundle bundle = new Bundle();
        bundle.putString("KEY",value);
        myFragmentOne.setArguments(bundle);
        return myFragmentOne;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        bundle.getString("KEY"); ///LUAN
        Log.e("NAME", bundle.getString("KEY"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment_one,null,false);
    }


}
