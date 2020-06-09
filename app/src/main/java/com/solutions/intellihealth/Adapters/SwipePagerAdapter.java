package com.solutions.intellihealth.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.solutions.intellihealth.Ui.Fragments.Slider1Fragment;

public class SwipePagerAdapter extends FragmentPagerAdapter {
    public SwipePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public SwipePagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Slider1Fragment swipe_1Fragment = new Slider1Fragment();
                return swipe_1Fragment;

            case 1:
                Slider1Fragment swipe_2Fragment = new Slider1Fragment();
                return swipe_2Fragment;

            case 2:
                Slider1Fragment swipe_3Fragment = new Slider1Fragment();
                return swipe_3Fragment;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

//    public CharSequence getPageTitle(int position) {
//        switch (position) {
//
//            case 0:
//                return "Chats";
//            case 1:
//                return "Matches";
//
//            default:
//                return null;
//        }
//
//    }
}
