package com.example.nived_gravityball;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView blue,red,violet,orange,green,yellow;
    Button b;
    int n,h,z;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n= 0;

        blue   = findViewById(R.id.blue);
        red    = findViewById(R.id.red);
        violet = findViewById(R.id.violet);
        orange = findViewById(R.id.orange);
        green  = findViewById(R.id.green);
        yellow = findViewById(R.id.yellow);
        b      = findViewById(R.id.button);
        l      = findViewById(R.id.l);

        l.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (n % 2 == 0) {

                            if(z==1) {

                                Random random = new Random();
                                h = random.nextInt(6);
                                if (h == 1)
                                    doSomeAnimationyellow();
                                if (h == 2)
                                    doSomeAnimationgreen();
                                if (h == 3)
                                    doSomeAnimationorange();
                                if (h == 4)
                                    doSomeAnimationred();
                                if (h == 5)
                                    doSomeAnimationviolet();
                            }
                            if(z==2) {

                                Random random = new Random();
                                h = random.nextInt(6);
                                if (h == 1)
                                    doSomeAnimationyellow();
                                if (h == 2)
                                    doSomeAnimationgreen();
                                if (h == 3)
                                    doSomeAnimationorange();
                                if (h == 4)
                                    doSomeAnimationblue();
                                if (h == 5)
                                    doSomeAnimationviolet();
                            }
                            if(z==3) {

                                Random random = new Random();
                                h = random.nextInt(6);
                                if (h == 1)
                                    doSomeAnimationyellow();
                                if (h == 2)
                                    doSomeAnimationgreen();
                                if (h == 3)
                                    doSomeAnimationorange();
                                if (h == 4)
                                    doSomeAnimationred();
                                if (h == 5)
                                    doSomeAnimationblue();
                            }
                            if(z==4) {

                                Random random = new Random();
                                h = random.nextInt(6);
                                if (h == 1)
                                    doSomeAnimationblue();
                                if (h == 2)
                                    doSomeAnimationgreen();
                                if (h == 3)
                                    doSomeAnimationorange();
                                if (h == 4)
                                    doSomeAnimationred();
                                if (h == 5)
                                    doSomeAnimationviolet();
                            }
                            if(z==5) {

                                Random random = new Random();
                                h = random.nextInt(6);
                                if (h == 1)
                                    doSomeAnimationyellow();
                                if (h == 2)
                                    doSomeAnimationgreen();
                                if (h == 3)
                                    doSomeAnimationblue();
                                if (h == 4)
                                    doSomeAnimationred();
                                if (h == 5)
                                    doSomeAnimationviolet();
                            }
                            if(z==6) {

                                Random random = new Random();
                                h = random.nextInt(6);
                                if (h == 1)
                                    doSomeAnimationyellow();
                                if (h == 2)
                                    doSomeAnimationblue();
                                if (h == 3)
                                    doSomeAnimationorange();
                                if (h == 4)
                                    doSomeAnimationred();
                                if (h == 5)
                                    doSomeAnimationviolet();
                            }

                        } else {

                            if(z==1) {

                                if (h == 1)
                                    doanotheroneyellow();
                                if (h == 2)
                                    doanotheronegreen();
                                if (h == 3)
                                    doanotheroneorange();
                                if (h == 4)
                                    doanotheronered();
                                if (h == 5)
                                    doanotheroneviolet();

                            }
                            if(z==2) {

                                if (h == 1)
                                    doanotheroneyellow();
                                if (h == 2)
                                    doanotheronegreen();
                                if (h == 3)
                                    doanotheroneorange();
                                if (h == 4)
                                    doanotheroneblue();
                                if (h == 5)
                                    doanotheroneviolet();

                            }
                            if(z==3) {

                                if (h == 1)
                                    doanotheroneyellow();
                                if (h == 2)
                                    doanotheronegreen();
                                if (h == 3)
                                    doanotheroneorange();
                                if (h == 4)
                                    doanotheronered();
                                if (h == 5)
                                    doanotheroneblue();

                            }
                            if(z==4) {

                                if (h == 1)
                                    doanotheroneblue();
                                if (h == 2)
                                    doanotheronegreen();
                                if (h == 3)
                                    doanotheroneorange();
                                if (h == 4)
                                    doanotheronered();
                                if (h == 5)
                                    doanotheroneviolet();

                            }
                            if(z==5) {

                                if (h == 1)
                                    doanotheroneyellow();
                                if (h == 2)
                                    doanotheronegreen();
                                if (h == 3)
                                    doanotheroneblue();
                                if (h == 4)
                                    doanotheronered();
                                if (h == 5)
                                    doanotheroneviolet();

                            }
                            if(z==6) {

                                if (h == 1)
                                    doanotheroneyellow();
                                if (h == 2)
                                    doanotheroneblue();
                                if (h == 3)
                                    doanotheroneorange();
                                if (h == 4)
                                    doanotheronered();
                                if (h == 5)
                                    doanotheroneviolet();

                            }
                        }

                    }
                }
        );

        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Random random = new Random();
                        z=random.nextInt(7);

                        if(z==1) {
                            blue.setVisibility(View.GONE);
                            red.setVisibility(View.VISIBLE);
                            violet.setVisibility(View.VISIBLE);
                            orange.setVisibility(View.VISIBLE);
                            yellow.setVisibility(View.VISIBLE);
                            green.setVisibility(View.VISIBLE);
                        }
                        else if(z==2) {
                            red.setVisibility(View.GONE);
                            blue.setVisibility(View.VISIBLE);
                            violet.setVisibility(View.VISIBLE);
                            orange.setVisibility(View.VISIBLE);
                            yellow.setVisibility(View.VISIBLE);
                            green.setVisibility(View.VISIBLE);
                        }
                        else if(z==3) {
                            violet.setVisibility(View.GONE);
                            blue.setVisibility(View.VISIBLE);
                            red.setVisibility(View.VISIBLE);
                            orange.setVisibility(View.VISIBLE);
                            yellow.setVisibility(View.VISIBLE);
                            green.setVisibility(View.VISIBLE);
                        }
                        else if(z==4) {
                            yellow.setVisibility(View.GONE);
                            blue.setVisibility(View.VISIBLE);
                            red.setVisibility(View.VISIBLE);
                            violet.setVisibility(View.VISIBLE);
                            orange.setVisibility(View.VISIBLE);
                            green.setVisibility(View.VISIBLE);
                        }
                        else if(z==5) {
                            orange.setVisibility(View.GONE);
                            blue.setVisibility(View.VISIBLE);
                            red.setVisibility(View.VISIBLE);
                            violet.setVisibility(View.VISIBLE);
                            yellow.setVisibility(View.VISIBLE);
                            green.setVisibility(View.VISIBLE);
                        }
                        else if(z==6) {
                            green.setVisibility(View.GONE);
                            blue.setVisibility(View.VISIBLE);
                            red.setVisibility(View.VISIBLE);
                            violet.setVisibility(View.VISIBLE);
                            orange.setVisibility(View.VISIBLE);
                            yellow.setVisibility(View.VISIBLE);
                        }


                    }
                }
        );
    }
    public void doSomeAnimationblue() {

        blue = findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(blue,"translationY",l.getHeight());
        animation1.setDuration(1500);
        animation1.start();
        n++;

    }
    public void doanotheroneblue() {

        blue= findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(blue,"translationY",0);
        animation1.setDuration(1500);
        animation1.start();
        n++;
    }
    public void doSomeAnimationred() {

        blue = findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(red,"translationY",l.getHeight());
        animation1.setDuration(1500);
        animation1.start();
        n++;

    }
    public void doanotheronered() {

        blue= findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(red,"translationY",0);
        animation1.setDuration(1500);
        animation1.start();
        n++;
    }
    public void doSomeAnimationgreen() {

        blue = findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(green,"translationY",l.getHeight());
        animation1.setDuration(1500);
        animation1.start();
        n++;

    }
    public void doanotheronegreen() {

        blue= findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(green,"translationY",0);
        animation1.setDuration(1500);
        animation1.start();
        n++;
    }
    public void doSomeAnimationyellow() {

        blue = findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(yellow,"translationY",l.getHeight());
        animation1.setDuration(1500);
        animation1.start();
        n++;

    }
    public void doanotheroneyellow() {

        blue= findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(yellow,"translationY",0);
        animation1.setDuration(1500);
        animation1.start();
        n++;
    }
    public void doSomeAnimationviolet() {

        blue = findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(violet,"translationY",l.getHeight());
        animation1.setDuration(1500);
        animation1.start();
        n++;

    }
    public void doanotheroneviolet() {

        blue= findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(violet,"translationY",0);
        animation1.setDuration(1500);
        animation1.start();
        n++;
    }
    public void doSomeAnimationorange() {

        blue = findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(orange,"translationY",l.getHeight());
        animation1.setDuration(1500);
        animation1.start();
        n++;

    }
    public void doanotheroneorange() {

        blue= findViewById(R.id.blue);

        ObjectAnimator animation1 = ObjectAnimator.ofFloat(orange,"translationY",0);
        animation1.setDuration(1500);
        animation1.start();
        n++;
    }

}
