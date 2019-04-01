package com.bandhan.hazzatun.mybloodbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bank= findViewById(R.id.btnBank);
        Button donor= findViewById(R.id.btnDonor);
        Button user= findViewById(R.id.btnUser);
        Intent intent=getIntent();
    }
    public void donorPlay(View view) {
        Intent intent1=new Intent(this,Donor.class);
        startActivity(intent1);

    }

    public void bankPlay(View view) {
        Intent intent2=new Intent(this,Bank.class);
        startActivity(intent2);

    }

    public void userPlay(View view) {
        Intent intent3=new Intent(this,User.class);
        startActivity(intent3);

    }
}
