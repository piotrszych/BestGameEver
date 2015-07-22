package com.muramura.BestGameEver;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by Piotr on 2015-02-22.
 */
public class WinTheGame extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winwin);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.applause);
        mp.setLooping(false);
        mp.start();
    }

    @Override
    public void onBackPressed()
    {
        setResult(RESULT_OK);
        finish();
        System.exit(0);
    }
}