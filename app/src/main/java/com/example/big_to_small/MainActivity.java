package com.example.big_to_small;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.big_to_small.R;

public class MainActivity extends AppCompatActivity {
    View fab1,fab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab1=findViewById(R.id.android);
        Object a;
        a = AnimationUtils.loadAnimation(MainActivity.this, R.anim.myanim);
        fab1.startAnimation((Animation) a);
        fab2=findViewById(R.id.train);
        Object b;
        b= AnimationUtils.loadAnimation(MainActivity.this, R.anim.myanim2);
        fab2.startAnimation((Animation) b);
    }
}