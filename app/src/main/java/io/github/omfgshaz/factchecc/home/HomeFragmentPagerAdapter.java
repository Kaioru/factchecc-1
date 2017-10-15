package io.github.omfgshaz.factchecc.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import io.github.omfgshaz.factchecc.feed.FeedFragment;
import io.github.omfgshaz.factchecc.news.NewsFragment;
import io.github.omfgshaz.factchecc.profile.ProfileFragment;

public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {

    public HomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == HomeActivity.FEED_FRAGMENT_POSITION) {
            return new FeedFragment();
        }
        else if (position == HomeActivity.NEWS_FRAGMENT_POSITION) {
            return new NewsFragment();
        }
        else if (position == HomeActivity.PROFILE_FRAGMENT_POSITION) {
            return new ProfileFragment();
        }

        throw new IllegalStateException("i think you set the getCount() wrongly bruv");
    }

    @Override
    public int getCount() {
        return HomeActivity.FRAGMENT_PAGE_COUNT;
    }
}
