
package com.example.android.newsfeed.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;
import android.util.Log;

import com.example.android.newsfeed.News;
import com.example.android.newsfeed.NewsLoader;
import com.example.android.newsfeed.NewsPreferences;
import com.example.android.newsfeed.R;

import java.util.List;


public class FashionFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = FashionFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String fashionUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.fashion));
        Log.e(LOG_TAG, fashionUrl);

        return new NewsLoader(getActivity(), fashionUrl);
    }
}
