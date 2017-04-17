package com.example.vizenglee.library1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    public Button Lib1;
    public Button Lib2;



    public void gotolibrary1(){
        Lib1= (Button)findViewById(R.id.Lib1);
        Lib1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent goto1 =new Intent(Home.this,Library1.class);
                startActivity(goto1);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        gotolibrary1();
    }
}
