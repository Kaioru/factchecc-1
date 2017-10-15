package io.github.omfgshaz.factchecc.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import io.github.omfgshaz.factchecc.R;

public class HomeActivity extends AppCompatActivity {

    public static final int FEED_FRAGMENT_POSITION      = 0;
    public static final int NEWS_FRAGMENT_POSITION      = 1;
    public static final int PROFILE_FRAGMENT_POSITION   = 2;
    public static final int FRAGMENT_PAGE_COUNT         = 3;

    private Toolbar toolbar;
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);

        setUpViewPager();
        setUpBottomBar();
    }

    private void setUpToolbar() {
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
    }

    private void setUpViewPager() {
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new HomeFragmentPagerAdapter(getSupportFragmentManager()));
    }

    private void setUpBottomBar() {
        final BottomBar bottomBar = findViewById(R.id.bottom_bar);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // dont care
            }

            @Override
            public void onPageSelected(int position) {
                bottomBar.selectTabAtPosition(position, true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // idgaf
            }
        });

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {
                if (tabId == R.id.feed_tab) {
                    viewPager.setCurrentItem(FEED_FRAGMENT_POSITION);
                }
                else if (tabId == R.id.news_tab) {
                    viewPager.setCurrentItem(NEWS_FRAGMENT_POSITION);
                }
                else if (tabId == R.id.profile_tab) {
                    viewPager.setCurrentItem(PROFILE_FRAGMENT_POSITION);
                }
            }
        });
    }
}
