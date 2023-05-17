package com.example.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ImageView footballField;
    private ImageView ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        footballField = findViewById(R.id.football_field);

        
        ball = new ImageView(this);
        ball.setImageResource(R.drawable.ball);
        ball.setLayoutParams(new ViewGroup.LayoutParams(150, 150));
        footballField.addView(ball);

        
        TranslateAnimation animation = new TranslateAnimation(
                TranslateAnimation.ABSOLUTE, 0,
                TranslateAnimation.ABSOLUTE, 1000,
                TranslateAnimation.ABSOLUTE, 0,
                TranslateAnimation.ABSOLUTE, 500);
        animation.setDuration(2000);
        animation.setRepeatCount(ValueAnimator.INFINITE);
        animation.setRepeatMode(ValueAnimator.REVERSE);
        ball.startAnimation(animation);
    }
}