package com.example.test.bpositive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity {

    private static final String TAG="YoutubeActivity";
    YouTubePlayerView youtubeView;
    Button play1;
  /*  YouTubePlayerView youtubeView2;
    Button play2;
    YouTubePlayerView youtubeView3;
    Button play3;*/
    YouTubePlayer.OnInitializedListener listener;
   // YouTubePlayer.OnInitializedListener listener2;
    //YouTubePlayer.OnInitializedListener listener3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        Log.d(TAG, "onCreate: Starting.");
        youtubeView=(YouTubePlayerView)findViewById(R.id.youtubePlay);
        //youtubeView2=(YouTubePlayerView)findViewById(R.id.youtubePlay2);
        //youtubeView3=(YouTubePlayerView)findViewById(R.id.youtubePlay3);

        listener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done Initializing");
                youTubePlayer.loadVideo("LnhGsaTnqUk");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to Initialize");

            }
        };
   /*     listener2=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done Initializing");
                youTubePlayer.loadVideo("v1yErMzMLUE");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to Initialize");

            }
        };
        listener3=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done Initializing");
                youTubePlayer.loadVideo("j5kWAYWoZng");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to Initialize");

            }
        };*/



        play1=(Button)findViewById(R.id.play1);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Initializing YouTube Player");
                youtubeView.initialize(YoutubeConfig.getApiKey(), listener);
                Log.d(TAG, "onClick: Done Initializing");

            }
        });
  /*      play2=(Button)findViewById(R.id.play2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Initializing YouTube Player");
                youtubeView.initialize(YoutubeConfig.getApiKey(), listener2);
                Log.d(TAG, "onClick: Done Initializing");

            }
        });
        play3=(Button)findViewById(R.id.play3);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Initializing YouTube Player");
                youtubeView.initialize(YoutubeConfig.getApiKey(), listener3);
                Log.d(TAG, "onClick: Done Initializing");

            }
        });*/
    }

}
