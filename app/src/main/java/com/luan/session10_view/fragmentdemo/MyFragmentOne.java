package com.luan.session10_view.fragmentdemo;

import android.content.Context;
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
    MyListener myListener;
    Button button;

    public static MyFragmentOne newInstance(String value){
        MyFragmentOne myFragmentOne = new MyFragmentOne();
        //day du lieu vao fragment tu activity
        Bundle bundle = new Bundle();
        bundle.putString("KEY",value);
        myFragmentOne.setArguments(bundle);
        return myFragmentOne;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //lay du lieu ra
        Bundle bundle = getArguments();
        bundle.getString("KEY"); ///LUAN
        Log.e("NAME", bundle.getString("KEY"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.my_fragment_one,null,false);
        button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myListener.callAct("Hello Activity");
            }
        });
        return v;
    }

    public void hello(){
        Log.e("FragmentOne","Hello");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myListener=(MyListener) context;
    }

}
