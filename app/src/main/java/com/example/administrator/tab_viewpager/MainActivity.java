package com.example.administrator.tab_viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.tab_viewpager.ui.activity.NavitationActivity;
import com.example.administrator.tab_viewpager.ui.activity.NavitationFollowScrollActivity;
import com.example.administrator.tab_viewpager.ui.activity.TabNavitationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tv1(View view) {
        startActivity(new Intent(this, NavitationFollowScrollActivity.class));
    }

    public void tv2(View view) {
        startActivity(new Intent(this, TabNavitationActivity.class));
    }

    public void tv3(View view) {
        startActivity(new Intent(this, NavitationActivity.class));
    }
}
