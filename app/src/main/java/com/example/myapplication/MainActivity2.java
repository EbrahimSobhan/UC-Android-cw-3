package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView result = findViewById(R.id.result);
        TextView msg = findViewById(R.id.msg);
        Bundle b = getIntent().getExtras();
        double total = b.getDouble("grades");
        result.setText("درجتك هي : "+total);

        if(total > 90){
            msg.setText("مبروك!!!");
            msg.setTextColor(Color.parseColor("#FF8E4242"));
        }
        else if(total > 80){
            msg.setText("تستطيع ان تفعل افضل");
            msg.setTextColor(Color.parseColor("#FF890BB6"));
        }



    }
}