package com.star.animationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
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

        final AlphaAnimation alphaAnim = new AlphaAnimation(
                0f, 1f
        );

        final ScaleAnimation scaleAnim = new ScaleAnimation(
                0f, 1f, 0f, 1f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
        );
        scaleAnim.setDuration(2000);
//        scaleAnim.setRepeatCount(4);
//        scaleAnim.setRepeatMode(Animation.REVERSE);
        scaleAnim.setFillAfter(true);
        scaleAnim.setInterpolator(new AnticipateOvershootInterpolator());

        final RotateAnimation rotateAnim = new RotateAnimation(
                0, 720,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
        );

        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(3000);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new AnticipateOvershootInterpolator());

        animationSet.addAnimation(alphaAnim);
        animationSet.addAnimation(scaleAnim);
        animationSet.addAnimation(rotateAnim);

        alphaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(alphaAnimation);
            }
        });

        scaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                imageView.startAnimation(scaleAnimation);
                imageView.startAnimation(scaleAnim);
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
//                imageView.startAnimation(setAnimation);
                imageView.startAnimation(animationSet);
            }
        });
    }

}
