package com.novaorbis.anirudh.trendz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.splsh);
        Animation obj = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        img.startAnimation(obj);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(MainActivity.this,TrndsActivity.class));
            finish();
        }, 3000);
    }
}
