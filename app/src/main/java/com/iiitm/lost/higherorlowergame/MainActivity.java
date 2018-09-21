package com.iiitm.lost.higherorlowergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void checkGuess (View view){

        EditText text = findViewById(R.id.editText);

        Log.i("Number",text.toString());

        Double input = Double.parseDouble(text.getText().toString());

        if(input < randomNumber) {

            Toast.makeText(MainActivity.this,"Higher",Toast.LENGTH_SHORT).show(); }

        else if (input > randomNumber) {

            Toast.makeText(MainActivity.this,"Lower",Toast.LENGTH_SHORT).show();  }

        else {

            Toast.makeText(MainActivity.this, "You Guessed It Right !!", Toast.LENGTH_SHORT).show();

            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;

            Toast.makeText(MainActivity.this,"Try Again!!!",Toast.LENGTH_SHORT).show();


        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;

    }
}
