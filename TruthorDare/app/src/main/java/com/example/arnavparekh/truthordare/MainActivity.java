package com.example.arnavparekh.truthordare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView bottle;
    private Random random1 = new Random();
    private int lastDir;
    private boolean spinning;
    private Random random2 = new Random();
    private Random random3 = new Random();
    private Button dareButton;
    private Button truthButton;
    private TextView todTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottle = (ImageView) findViewById(R.id.bottle);
        dareButton = (Button)findViewById(R.id.dareButton);
        truthButton = (Button)findViewById(R.id.truthButton);
        todTextView = (TextView)findViewById(R.id.todTextView);

        truthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                truthClicked();
            }
        });

        dareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dareClicked();
            }
        });
    }

    public void truthClicked(){
        int randomNo1 = random2.nextInt(10) + 1;

        switch (randomNo1){
            case 1:
                todTextView.setText("Truth 1");
                break;
            case 2:
                todTextView.setText("Truth 2");
                break;
            case 3:
                todTextView.setText("Truth 3");
                break;
            case 4:
                todTextView.setText("Truth 4");
                break;
            case 5:
                todTextView.setText("Truth 5");
                break;
            case 6:
                todTextView.setText("Truth 6");
                break;
            case 7:
                todTextView.setText("Truth 7");
                break;
            case 8:
                todTextView.setText("Truth 8");
                break;
            case 9:
                todTextView.setText("Truth 9");
                break;
            case 10:
                todTextView.setText("Truth 10");
                break;

        }
    }

    public void dareClicked(){
        int randomNo2 = random3.nextInt(10) + 1;

        switch (randomNo2){
            case 1:
                todTextView.setText("Dare 1");
                break;
            case 2:
                todTextView.setText("Dare 2");
                break;
            case 3:
                todTextView.setText("Dare 3");
                break;
            case 4:
                todTextView.setText("Dare 4");
                break;
            case 5:
                todTextView.setText("Dare 5");
                break;
            case 6:
                todTextView.setText("Dare 6");
                break;
            case 7:
                todTextView.setText("Dare 7");
                break;
            case 8:
                todTextView.setText("Dare 8");
                break;
            case 9:
                todTextView.setText("Dare 9");
                break;
            case 10:
                todTextView.setText("Dare 10");
                break;

        }
    }

    public void spinBottle(View v){
        todTextView.setText("TRUTH OR DARE?");
        if(!spinning) {
            int newDir = random1.nextInt(1800);
            float pivotx = bottle.getWidth() / 2;
            float pivoty = bottle.getHeight() / 2;

            Animation rotate = new RotateAnimation(lastDir, newDir, pivotx, pivoty);
            rotate.setDuration(5000);
            rotate.setFillAfter(true);
            rotate.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    spinning=true;
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    spinning=false;
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });

            lastDir = newDir;
            bottle.startAnimation(rotate);
        }
    }

}
