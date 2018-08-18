package com.pd.mydemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainTabFragmentAdapter extends FragmentPagerAdapter {
    public ArrayList<Fragment> fragments;
    public Context mContext;
    private String[] titles;

    public MainTabFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
        initFragments();
    }

    public ArrayList<Fragment> getFragments() {
        return fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    private void initFragments() {
        titles = new String[]{
               "AAA","bbb","CCC","DDD"
        };

        fragments = new ArrayList<>();

        for ( int i=0; i < titles.length; i++ ){
//            Fragment fragment = MainTabFragment.newInstance(i+"");
            Fragment fragment = MainTabFragment.newInstance();
            fragments.add(fragment);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}

