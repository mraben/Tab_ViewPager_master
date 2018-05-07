package com.example.administrator.tab_viewpager.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.tab_viewpager.R;
import com.example.administrator.tab_viewpager.adapter.ViewPagerAdapter;
import com.example.administrator.tab_viewpager.ui.fragment.ChildFragment;
import com.example.library.TabNavitationLayout;

import java.util.ArrayList;
import java.util.List;

public class TabNavitationActivity extends AppCompatActivity {

    private String[] titles = new String[]{"标题一", "标题二", "标题三"};
    private ViewPagerAdapter viewPagerAdapter;
    private List<Fragment> fragments;
    private TabNavitationLayout tabNavitationLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_navitation);
        viewPager = findViewById(R.id.viewpager);
        tabNavitationLayout =  findViewById(R.id.bar);

        fragments =  new ArrayList<>();
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
         * stroke + 竖向分割线 + 点击变色
         */
        tabNavitationLayout.setViewPager(this, titles, viewPager, R.drawable.drawable_left, R.drawable.drawable_mid, R.drawable.drawable_right, R.color.color_ffffff, R.color.color_282d31, 16, 0, 1f, true);

        /**
         * 设置item点击监听
         */
        tabNavitationLayout.setOnTitleClickListener(new TabNavitationLayout.OnTitleClickListener() {
            @Override
            public void onTitleClick(View v) {
               // Toast.makeText(TabNavitationActivity.this, ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * 设置状态监听
         */
        tabNavitationLayout.setOnNaPageChangeListener(new TabNavitationLayout.OnNaPageChangeListener() {
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
