package com.example.servicecours;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyServiceMediaPlayer extends Service {
    MediaPlayer MP;
    public MyServiceMediaPlayer() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        MP=MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        MP.setLooping(true);
        MP.start();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        MP.stop();
        super.onDestroy();
    }
}
