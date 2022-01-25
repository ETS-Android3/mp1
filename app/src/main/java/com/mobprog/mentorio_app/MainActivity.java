package com.mobprog.mentorio_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    Button regBtn;

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        regBtn = (Button) findViewById(R.id.registButton);

        regBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Account  registered successfully", Toast.LENGTH_LONG).show();
                EditText edt = (EditText)findViewById(R.id.username_field);
                userName = edt.getText().toString();
                setContentView(R.layout.homepage);
            }
        });


//        BottomNavigationView bottomNavigationView = findViewById(R.id.navbar);
//
//        bottomNavigationView.setOnItemSelectedListener(this);
    }


     public void goCourses(View view) {
            setContentView(R.layout.courses_page);
        }


    public void goHome(View view) {
        setContentView(R.layout.homepage);
    }

    public void onClick(View view) {
         Intent intent = new Intent(this, HomePartition.class);
         startActivity(intent);
    }


//    private boolean loadFragment(Fragment fragment) {
//        if (fragment != null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.navbar, fragment)
//                    .commit();
//            return true;
//        }
//        return false;
//    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        Fragment fragment = null;
//        switch (item.getItemId()){
//            case R.id.home:
//                fragment = new HomePartition();
//                break;
//            case R.id.book:
//                fragment = new CoursesPartition();
//                break;
//            case R.id.user:
//                fragment = new UserPartition();
//                break;
//        }
//        return loadFragment(fragment);
//    }
}