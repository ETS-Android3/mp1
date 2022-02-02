package com.mobprog.mentorio_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.huawei.hms.ads.AdListener;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;

public class HomePartition<adListener> extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView botnav;

    // Obtain BannerView.
    BannerView bannerView = findViewById(R.id.hw_banner_view);

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        botnav = findViewById(R.id.botNav);

        botnav.setOnNavigationItemSelectedListener(this);
        botnav.setSelectedItemId(R.id.homePartition);



        // Set the ad unit ID and ad dimensions. "testw6vs28auh3" is a dedicated test ad unit ID.
        bannerView.setAdId("testw6vs28auh3");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_360_57);
        // Set the refresh interval to 60 seconds.
        bannerView.setBannerRefresh(60);
        // Create an ad request to load an ad.
        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);
    }

    AdListener adListener = new AdListener() {
        @Override
        public void onAdLoaded() {
            // Called when an ad is loaded successfully.
        }
        @Override
        public void onAdFailed(int errorCode) {
            // Called when an ad fails to be loaded.
        }
        @Override
        public void onAdOpened() {
            // Called when an ad is opened.
        }
        @Override
        public void onAdClicked() {
            // Called when a user taps an ad.
        }
        @Override
        public void onAdLeave() {
            // Called when a user has left the app.
        }
        @Override
        public void onAdClosed() {
            // Called when an ad is closed.
        }
        @Override
        public void onAdImpression() {
            // Called when an impression is recorded for an ad.
        }
    };
//bannerView.setAdListener(adListener);


//        PERALIHAN PAGE

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.homePartition :
                Intent homePart = new Intent(HomePartition.this, HomePartition.class);
                startActivity(homePart);
                return true;
            case R.id.coursesPartition:
                Intent coursePart = new Intent(HomePartition.this, CoursesPartition.class);
                startActivity(coursePart);
                return true;

            case R.id.userPartition:
                Intent userPart = new Intent(HomePartition.this, UserPartition.class);
                startActivity(userPart);
                return true;
        }
        return false;
    }

}
