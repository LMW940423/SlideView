package com.android.slide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {

    public int mCount;

    public MyAdapter(FragmentActivity fa, int count) {
        super(fa);
        mCount = count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int index = getRealPosition(position);

        switch(index){
            case 0 :
                return FragFirst.newInstance(index+1);
            case 1:
                return FragSecond.newInstance(index+1);
            case 2:
                return FragThird.newInstance(index+1);
            case 3:
                return FragFourth.newInstance(index+1);
            default:
                return null;
        }

    }

    @Override
    public int getItemCount() {
        return 2000;
    }

    public int getRealPosition(int position) { return position % mCount; }

}