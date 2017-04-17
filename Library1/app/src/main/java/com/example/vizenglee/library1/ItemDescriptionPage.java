package com.example.vizenglee.library1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemDescriptionPage extends AppCompatActivity {
    public Button homeBT;

    public void goHome(){
        homeBT= (Button)findViewById(R.id.HomeButton3);
        homeBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent goto1 =new Intent(ItemDescriptionPage.this,Home.class);
                startActivity(goto1);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description_page);
        goHome();
    }
}
