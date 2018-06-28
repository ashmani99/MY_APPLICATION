package com.apps.ankitraz.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.Timeline;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

public class TimelineActivity extends ListActivity {
    Intent intent;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        String username=getIntent().getStringExtra("user");
        String uid=getIntent().getStringExtra("uid");
     //  long x=Long.parseLong(uid);

        UserTimeline userTimeline = new UserTimeline.Builder()//User ID of the user to show tweets for
                .screenName(username)//screen name of the user to show tweets for
                .includeReplies(true)//Whether to include replies. Defaults to false.
                .includeRetweets(true)//Whether to include re-tweets. Defaults to true.
                .maxItemsPerRequest(200)//Max number of items to return per request
                .build();


        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build();
        setListAdapter(adapter);
    }

}
