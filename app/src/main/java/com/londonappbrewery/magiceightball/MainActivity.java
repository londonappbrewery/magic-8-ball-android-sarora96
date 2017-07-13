package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ask = (Button) findViewById(R.id.button_ask);

        final ImageView ball = (ImageView) findViewById(R.id.ball);

        final int[] allBall = {R.drawable.ball1,
                                R.drawable.ball2,
                                R.drawable.ball3,
                                R.drawable.ball4,
                                R.drawable.ball5
        };

        ask.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Random random = new Random();
                int num = random.nextInt(5);
                ball.setImageResource(allBall[num]);
            }
        });
    }
}
