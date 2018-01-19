package com.mlab.nonhlanhla.codetribeconnectadmin;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



/**
 * Created by Admin on 11/17/2017.
 */

public class AdminRequestCategoryAdapter extends FragmentPagerAdapter {
    Context mContext;
    public AdminRequestCategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new AdminRequestSowetoFragment();}
        else if (position == 1){
            return new AdminRequestPretoriaFragment();
        }else{
            return new AdminRequestTembisaFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0){
            return mContext.getString(R.string.tab_soweto);
        }
        else if (position == 1){
            return mContext.getString(R.string.tab_pretoria);
        }
        else{
            return mContext.getString(R.string.tab_tembisa);
        }

    }
}