package com.mali.studio;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.media.MediaPlayer;

public class MainActivity extends Activity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        Button pad = new Button(this);
        pad.setText("▶ PLAY SAMPLE");

        pad.setOnClickListener(v -> {
            if (player != null) player.release();
            player = MediaPlayer.create(this, android.R.raw.notification);
            player.start();
        });

        layout.addView(pad);
        setContentView(layout);
    }
}
