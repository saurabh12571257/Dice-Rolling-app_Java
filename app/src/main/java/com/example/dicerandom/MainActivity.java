package com.example.dicerandom;

import static com.daimajia.androidanimations.library.YoYo.with;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView one = findViewById(R.id.oned);
        ImageView two = findViewById(R.id.twod);

        final int[] images = {R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6};


        Button dice;

        dice = findViewById(R.id.Rollbtn);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rndobj = new Random();

                int myrndobj = rndobj.nextInt(6);
                int myrndob = rndobj.nextInt(6);

                YoYo.with(Techniques.Tada)
                        .duration(600)
                        .repeat(0)
                        .playOn(findViewById(R.id.oned));
                YoYo.with(Techniques.Shake)
                        .duration(500)
                        .repeat(0)
                        .playOn(findViewById(R.id.oned));
                YoYo.with(Techniques.Tada)
                        .duration(600)
                        .repeat(0)
                        .playOn(findViewById(R.id.twod));
                YoYo.with(Techniques.Shake)
                        .duration(500)
                        .repeat(0)
                        .playOn(findViewById(R.id.twod));

                one.setImageResource(images[myrndobj]);
                two.setImageResource(images[myrndob]);


            }
        });

    }
}