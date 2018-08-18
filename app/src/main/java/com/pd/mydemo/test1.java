package com.pd.mydemo;

import android.os.Handler;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

public class test1 extends AppCompatActivity {
    //fragment的适配器
    private MainTabFragmentAdapter mainTabFragmentAdapter;
    //viewpager
    private ViewPager mViewPager;
    //AppBarLayout
    private AppBarLayout mAppBarLayout;
    //顶部HeaderLayout
    private LinearLayout headerLayout;
    //是否隐藏了头部
    private boolean isHideHeaderLayout = false;

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        init();
    }

    //初始化方法
    private void init() {
        mainTabFragmentAdapter = new MainTabFragmentAdapter(getSupportFragmentManager(), this);
        mViewPager = findViewById(R.id.viewpager);
        mTabLayout = findViewById(R.id.tab);
        mTabLayout.addTab(mTabLayout.newTab().setText("AAA"));
        mTabLayout.addTab(mTabLayout.newTab().setText("BBB"));
        mTabLayout.addTab(mTabLayout.newTab().setText("CCC"));
        mTabLayout.addTab(mTabLayout.newTab().setText("DDD"));
        mViewPager.setAdapter(mainTabFragmentAdapter);
        mViewPager.setOffscreenPageLimit(2);
        mTabLayout.setupWithViewPager(mViewPager);
        headerLayout = findViewById(R.id.ll_header_layout);
        initAppBarLayout();
    }

    // 初始化AppBarLayout
    private void initAppBarLayout() {
        //header layout height
        final int headerHeight = getResources().getDimensionPixelOffset(R.dimen.header_height);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.appbar);
//        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//                verticalOffset = Math.abs(verticalOffset);
//                if (verticalOffset >= headerHeight) {
//                    isHideHeaderLayout = true;
//                    //当偏移量超过顶部layout的高度时，我们认为他已经完全移动出屏幕了
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            AppBarLayout.LayoutParams mParams = (AppBarLayout.LayoutParams) headerLayout.getLayoutParams();
//                            mParams.setScrollFlags(0);
//                            headerLayout.setLayoutParams(mParams);
//                            headerLayout.setVisibility(View.GONE);
//                        }
//                    }, 100);
//                }
//            }
//        });
    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            //监听返回键
//            if (isHideHeaderLayout) {
//                isHideHeaderLayout = false;
//              /*微博的效果是，点击返回键拉出上面隐藏的view，并同时让list滚动到最顶部，
//                我这里只给第一个fragment的RecyclerView增加了跳到第0个位置的操作，这里大家可以自行去编写逻辑
//               */
//                ((MainTabFragment) mainTabFragmentAdapter.getFragments().get(0)).getRvList().scrollToPosition(0);
//                headerLayout.setVisibility(View.VISIBLE);
//
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        AppBarLayout.LayoutParams mParams = (AppBarLayout.LayoutParams) headerLayout.getLayoutParams();
//                        mParams.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL | AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED);
//                        headerLayout.setLayoutParams(mParams);
//                    }
//                }, 300);
//            } else {
//                //如果不需要拉出顶部的header，直接关闭当前的界面
//                finish();
//            }
//            return true;
//        }
//        return super.onKeyDown(keyCode, event);
//    }
}


