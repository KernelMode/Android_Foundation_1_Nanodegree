package com.example.ankur.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager mainView = findViewById(R.id.mainview);
        mainView.setAdapter(new MyFragmentAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(mainView);

    }

    private class MyFragmentAdapter extends FragmentPagerAdapter {

        private String tabTitles[] = new String[] {
                getString(R.string.attractions),
                getString(R.string.restaurant),
                getString(R.string.history),
                getString(R.string.institutes)
        };

        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

        @Override
        public Fragment getItem(int pos) {
            if(pos == 0){
                return new AttractionsFragment();
            }
            else if(pos == 1){
                return new RestaurantsFragment();
            }
            else if(pos == 2){
                return new HistoryFragment();
            }
            return new InstitutesFragment();
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}

