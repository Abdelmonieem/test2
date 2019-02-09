package com.example.men3m.test;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView imageView;
    TextView name;
    TextView des;
    Button questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.imageView);
        name = findViewById(R.id.textView);
        des=findViewById(R.id.textView2);
        final Intent intent = getIntent();
        String theName = intent.getStringExtra("name");
        String theManufacture = intent.getStringExtra("des");
        int theImg = intent.getIntExtra("img", 0);
        name.setText(theName);
        des.setText(theManufacture);
        imageView.setImageResource(theImg);
        questions=findViewById(R.id.questions);
        questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Main2Activity.this,QuestionsActivity.class);
                startActivity(intent1);
            }
        });
    }
}
