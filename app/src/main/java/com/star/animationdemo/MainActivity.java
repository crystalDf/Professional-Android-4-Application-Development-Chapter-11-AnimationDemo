package com.star.animationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scaleButton = (Button) findViewById(R.id.scale_button);

        final TextView textView = (TextView) findViewById(R.id.text_view);

        final Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scaleanim);

        scaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.startAnimation(scaleAnimation);
            }
        });
    }

}
