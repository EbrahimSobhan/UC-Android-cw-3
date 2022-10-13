package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Intent i = new Intent(MainActivity.this,MainActivity2.class);

       final  EditText quizes = findViewById(R.id.quizes);
        final EditText tests = findViewById(R.id.tests);
       final EditText attendnce = findViewById(R.id.attendnce);

        Button calculate = findViewById(R.id.button);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double q = Double.parseDouble(quizes.getText().toString());
                double t = Double.parseDouble(tests.getText().toString());
                double a = Double.parseDouble(attendnce.getText().toString());

                double total = q+t+a;
                //Toast.makeText(MainActivity.this,"total is"+ total,Toast.LENGTH_LONG).show();
                i.putExtra("grades",total);
                startActivity(i);
            }
        });
    }
}