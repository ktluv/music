package com.example.demo;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class video extends Activity {
    private VideoView videoview;
    private MediaController mMediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        videoview = (VideoView) findViewById(R.id.video);
        mMediaController = new MediaController(this);
        videoview.setMediaController(mMediaController);
        //本地的视频  需要在手机SD卡根目录添加一个 the.mp4 视频
        String path = Environment.getExternalStorageDirectory().getPath()+"/the.mp4" ;
        Uri uri = Uri.parse(path);
        videoview.setVideoURI(uri);
        videoview.start();
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(false);
                mp.start();// 播放
                Toast.makeText(video.this, "开始播放！", Toast.LENGTH_LONG).show();
            }
        });

        videoview.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(video.this, "播放完毕", Toast.LENGTH_SHORT).show();
            }
        });
    }
}