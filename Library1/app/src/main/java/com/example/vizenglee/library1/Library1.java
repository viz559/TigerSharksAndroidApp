package com.example.vizenglee.library1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Library1 extends AppCompatActivity {

    public Button homeBT;

    public void goHome(){
        homeBT=(Button)findViewById(R.id.Homebutton);
        homeBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent goto1=new Intent(Library1.this,Home.class);
                startActivity(goto1);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library1);
        goHome();
    }
}
