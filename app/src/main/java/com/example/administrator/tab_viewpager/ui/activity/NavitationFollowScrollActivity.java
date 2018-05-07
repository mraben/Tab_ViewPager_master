package com.example.administrator.tab_viewpager.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.tab_viewpager.R;
import com.example.administrator.tab_viewpager.adapter.ViewPagerAdapter;
import com.example.administrator.tab_viewpager.ui.fragment.ChildFragment;
import com.example.library.NavitationFollowScrollLayout;

import java.util.ArrayList;
import java.util.List;

public class NavitationFollowScrollActivity extends AppCompatActivity {

    private String[] titles = new String[]{"标题一", "标题二", "标题三", "标题四", "标题五", "标题六", "标题七", "标题八", "标题九", "标题十"};
    private ViewPagerAdapter viewPagerAdapter;
    private List<Fragment> fragments;
    private NavitationFollowScrollLayout navitationFollowScrollLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navitation_follow_scroll);
        viewPager = findViewById(R.id.viewpager);
        navitationFollowScrollLayout = findViewById(R.id.bar);

        fragments = new ArrayList<>();
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(viewPagerAdapter);

        /**
         * 类型一
         * 可滑动 - 下划线 + 指示器（宽度margin）
         */
        navitationFollowScrollLayout.setViewPager(this, titles, viewPager, R.color.color_333333, R.color.color_2581ff, 16, 16, 12, true, R.color.color_333333, 0f, 15f, 15f, 100);
        navitationFollowScrollLayout.setBgLine(this, 1, R.color.colorAccent);
        navitationFollowScrollLayout.setNavLine(this, 3, R.color.colorPrimary);


        /**
         * 设置item点击监听
         */
        navitationFollowScrollLayout.setOnTitleClickListener(new NavitationFollowScrollLayout.OnTitleClickListener() {
            @Override
            public void onTitleClick(View v) {
                // Toast.makeText(NavitationFollowScrollActivity.this, ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * 设置状态监听
         */
        navitationFollowScrollLayout.setOnNaPageChangeListener(new NavitationFollowScrollLayout.OnNaPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
