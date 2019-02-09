package com.example.men3m.test;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    public Context createConfigurationContext(Configuration overrideConfiguration) {
        return super.createConfigurationContext(overrideConfiguration);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        List<Mobilemodel> mobilelist= new ArrayList<>();
        Mobilemodel mobilemodel=new Mobilemodel("mobile1","this is mobile one",R.drawable.logo);
        Mobilemodel mobilemode2=new Mobilemodel("mobile2","this is mobile one",R.drawable.logo);
        Mobilemodel mobilemode3=new Mobilemodel("mobile3","this is mobile one",R.drawable.logo);
        Mobilemodel mobilemode4=new Mobilemodel("mobile4","this is mobile one",R.drawable.logo);
        Mobilemodel mobilemode5=new Mobilemodel("mobile5","this is mobile one",R.drawable.logo);
        Mobilemodel mobilemode6=new Mobilemodel("mobile6","this is mobile one",R.drawable.logo);
        Mobilemodel mobilemode7=new Mobilemodel("mobile7","this is mobile one",R.drawable.logo);
        Mobilemodel mobilemode8=new Mobilemodel("mobile8","this is mobile one",R.drawable.logo);
        MobileAdapter mobileAdapter=new MobileAdapter(mobilelist,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mobileAdapter);
        mobilelist.add(mobilemodel);
        mobilelist.add(mobilemode2);
        mobilelist.add(mobilemode3);
        mobilelist.add(mobilemode4);
        mobilelist.add(mobilemode5);
        mobilelist.add(mobilemode6);
        mobilelist.add(mobilemode7);
        mobilelist.add(mobilemode8);


    }

}
