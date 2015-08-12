package com.star.animationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alphaButton = (Button) findViewById(R.id.alpha_button);
        Button scaleButton = (Button) findViewById(R.id.scale_button);
        Button transButton = (Button) findViewById(R.id.trans_button);
        Button rotateButton = (Button) findViewById(R.id.rotate_button);

        Button setButton = (Button) findViewById(R.id.set_button);

        final ImageView imageView = (ImageView) findViewById(R.id.image);

        final Animation alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alphaanim);
        final Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scaleanim);
        final Animation transAnimation = AnimationUtils.loadAnimation(this, R.anim.transanim);
        final Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotateanim);

        final Animation setAnimation = AnimationUtils.loadAnimation(this, R.anim.setanim);

        alphaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(alphaAnimation);
            }
        });

        scaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(scaleAnimation);
            }
        });

        transButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(transAnimation);
            }
        });

        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(rotateAnimation);
            }
        });

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(setAnimation);
            }
        });
    }

}
