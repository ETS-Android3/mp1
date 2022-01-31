package com.mobprog.mentorio_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class CoursesPartition extends AppCompatActivity {
    Button homeBtn;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_page);


        homeBtn.findViewById(R.id.homePartition);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(CoursesPartition.this, HomePartition.class);
                startActivity(homeIntent);
            }
        });
    }
}
