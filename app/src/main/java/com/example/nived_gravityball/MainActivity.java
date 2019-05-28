package com.example.nived_gravityball;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView i;
    int n;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n= 0;

        i = findViewById(R.id.ball);
        l = findViewById(R.id.l);



        l.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (n % 2 == 0) {
                            doSomeAnimation();

                        } else {
                            doanotherone();

                        }
                    }
                }
        );
    }

    public void doSomeAnimation() {

        i = findViewById(R.id.ball);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(i,"translationY",l.getHeight());
        animation1.setDuration(1500);
        animation1.start();
        n++;

    }
    public void doanotherone() {

        i= findViewById(R.id.ball);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(i,"translationY",0);
        animation1.setDuration(1500);
        animation1.start();
        n++;
    }

}
