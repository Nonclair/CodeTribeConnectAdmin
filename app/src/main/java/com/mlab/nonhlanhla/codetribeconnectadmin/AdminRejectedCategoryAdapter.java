package com.mlab.nonhlanhla.codetribeconnectadmin;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Admin on 12/8/2017.
 */

public class AdminRejectedCategoryAdapter extends FragmentPagerAdapter {
    Context mContext;
    public AdminRejectedCategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new AdminRejectSowetoFragment();}
        else if (position == 1){
            return new AdminRejectPretoriaFragment();
        }else{
            return new AdminRejectTembisaFragment();
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