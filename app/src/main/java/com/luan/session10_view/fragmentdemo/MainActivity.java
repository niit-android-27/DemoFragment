package com.luan.session10_view.fragmentdemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyListener {
    Button myButton;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton=(Button)findViewById(R.id.myButton);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.my_container,MyFragmentOne.newInstance("Luan"),"MY_FRAGMENT");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add fragment to view
                //FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                //fragmentTransaction.replace(R.id.my_container,MyFragmentTwo.newInstance(),"MY_FRAGMENT");
                //fragmentTransaction.addToBackStack(null);
                //fragmentTransaction.commit();

                //goi hello() cua fragment tu activity
                MyFragmentOne myFragmentOne= (MyFragmentOne)getSupportFragmentManager().findFragmentByTag("MY_FRAGMENT");
                myFragmentOne.hello();
            }
        });
    }


    @Override
    public void callAct(String hi) {
        Toast.makeText(MainActivity.this,hi,Toast.LENGTH_SHORT).show();
    }
}
