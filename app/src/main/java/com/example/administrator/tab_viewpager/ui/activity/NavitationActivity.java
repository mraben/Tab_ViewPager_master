package com.example.administrator.tab_viewpager.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.tab_viewpager.R;
import com.example.administrator.tab_viewpager.adapter.ViewPagerAdapter;
import  com.example.library.NavitationLayout;
import com.example.administrator.tab_viewpager.ui.fragment.ChildFragment;

import java.util.ArrayList;
import java.util.List;

public class NavitationActivity extends AppCompatActivity {

    private String[] titles5 = new String[]{"Title一", "Title二", "Title三", "Title四", "Title五"};
    private String[] titles4 = new String[]{"Title一", "Title二", "Title三", "Title四"};
    private String[] titles3 = new String[]{"Title一", "Title二", "Title三"};
    private ViewPagerAdapter viewPagerAdapter1;
    private ViewPagerAdapter viewPagerAdapter2;
    private ViewPagerAdapter viewPagerAdapter3;
    private ViewPagerAdapter viewPagerAdapter4;
    private ViewPagerAdapter viewPagerAdapter5;
    private List<Fragment> fragments1;
    private List<Fragment> fragments2;
    private List<Fragment> fragments3;
    private List<Fragment> fragments4;
    private List<Fragment> fragments5;
    private NavitationLayout navitationLayout1;
    private NavitationLayout navitationLayout2;
    private NavitationLayout navitationLayout3;
    private NavitationLayout navitationLayout4;
    private NavitationLayout navitationLayout5;
    private ViewPager viewPager1;
    private ViewPager viewPager2;
    private ViewPager viewPager3;
    private ViewPager viewPager4;
    private ViewPager viewPager5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navitation);

        viewPager1 = findViewById(R.id.viewpager1);
        viewPager2 = findViewById(R.id.viewpager2);
        viewPager3 = findViewById(R.id.viewpager3);
        viewPager4 = findViewById(R.id.viewpager4);
        viewPager5 = findViewById(R.id.viewpager5);

        navitationLayout1 = findViewById(R.id.bar1);
        navitationLayout2 = findViewById(R.id.bar2);
        navitationLayout3 = findViewById(R.id.bar3);
        navitationLayout4 = findViewById(R.id.bar4);
        navitationLayout5 = findViewById(R.id.bar5);

        fragments1 = new ArrayList<>();
        fragments1.add(new ChildFragment());
        fragments1.add(new ChildFragment());
        fragments1.add(new ChildFragment());
        fragments1.add(new ChildFragment());
        fragments1.add(new ChildFragment());
        viewPagerAdapter1 = new ViewPagerAdapter(getSupportFragmentManager(), fragments1);
        viewPager1.setAdapter(viewPagerAdapter1);

        fragments2 = new ArrayList<>();
        fragments2.add(new ChildFragment());
        fragments2.add(new ChildFragment());
        fragments2.add(new ChildFragment());
        fragments2.add(new ChildFragment());
        viewPagerAdapter2 = new ViewPagerAdapter(getSupportFragmentManager(), fragments2);
        viewPager2.setAdapter(viewPagerAdapter2);

        fragments3 = new ArrayList<>();
        fragments3.add(new ChildFragment());
        fragments3.add(new ChildFragment());
        fragments3.add(new ChildFragment());
        viewPagerAdapter3 = new ViewPagerAdapter(getSupportFragmentManager(), fragments3);
        viewPager3.setAdapter(viewPagerAdapter3);

        fragments4 = new ArrayList<>();
        fragments4.add(new ChildFragment());
        fragments4.add(new ChildFragment());
        fragments4.add(new ChildFragment());
        viewPagerAdapter4 = new ViewPagerAdapter(getSupportFragmentManager(), fragments4);
        viewPager4.setAdapter(viewPagerAdapter4);

        fragments5 = new ArrayList<>();
        fragments5.add(new ChildFragment());
        fragments5.add(new ChildFragment());
        fragments5.add(new ChildFragment());
        viewPagerAdapter5 = new ViewPagerAdapter(getSupportFragmentManager(), fragments5);
        viewPager5.setAdapter(viewPagerAdapter5);

        /**
         * 类型一
         * 不可滑动 - 下划线 + 指示器（宽度match）
         */
        navitationLayout1.setViewPager(this, titles5, viewPager1, R.color.color_333333, R.color.color_2581ff, 16, 16, 0, 0, true);
        navitationLayout1.setBgLine(this, 1, R.color.colorAccent);
        navitationLayout1.setNavLine(this, 3, R.color.colorPrimary, 0);

        /**
         * 类型二
         * 不可滑动 - 指示器（宽度match）
         */
        navitationLayout2.setViewPager(this, titles4, viewPager2, R.color.color_333333, R.color.color_2581ff, 16, 16, 0, 0, true);
        navitationLayout2.setNavLine(this, 3, R.color.colorPrimary, 0);

        /**
         * 类型三
         * 不可滑动 - 下划线 + 指示器（宽度设置margin）
         */
        navitationLayout3.setViewPager(this, titles3, viewPager3, R.color.color_333333, R.color.color_2581ff, 16, 16, 0, 12, true);
        navitationLayout3.setBgLine(this, 1, R.color.colorAccent);
        navitationLayout3.setNavLine(this, 3, R.color.colorPrimary, 0);

        /**
         * 类型四
         * 不可滑动 - 下划线 + 竖向分割线 + 指示器（宽度设置margin）
         */
        navitationLayout4.setViewPager(this, titles3, viewPager4, R.color.color_333333, R.color.color_2581ff, 16, 16, 0, 12, true, R.color.color_333333, 1f, 15f, 15f);
        navitationLayout4.setBgLine(this, 1, R.color.colorAccent);
        navitationLayout4.setNavLine(this, 3, R.color.colorPrimary, 0);

        /**
         * 类型五
         * 不可滑动 - 下划线 + 指示器（宽度设置margin）+ 选中字体变大
         */
        navitationLayout5.setViewPager(this, titles3, viewPager5, R.color.color_333333, R.color.color_2581ff, 14, 18, 0, 12, true);
        navitationLayout5.setBgLine(this, 1, R.color.colorAccent);
        navitationLayout5.setNavLine(this, 3, R.color.colorPrimary, 0);


        /**
         * 设置item点击监听
         */
        navitationLayout1.setOnTitleClickListener(new NavitationLayout.OnTitleClickListener() {
            @Override
            public void onTitleClick(View v) {
                //Toast.makeText(NavitationActivity.this, ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * 设置状态监听
         */
        navitationLayout1.setOnNaPageChangeListener(new NavitationLayout.OnNaPageChangeListener() {
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
