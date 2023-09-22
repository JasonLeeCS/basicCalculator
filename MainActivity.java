package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText num1EditText;
    EditText num2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        textView = findViewById(R.id.textView2);
        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);

    }

    // Function to add two numbers inputted by the user and take the user to a new screen to show the answer
    public void addFunction(View view) {
        int x = Integer.parseInt(num1EditText.getText().toString());
        int y = Integer.parseInt(num2EditText.getText().toString());
        int answer = x + y;
        goToActivity(Integer.toString(answer));
    }

    // Function to subtract two numbers inputted by the user and take the user to a new screen to show the answer
    public void subtractFunction(View view) {
        int x = Integer.parseInt(num1EditText.getText().toString());
        int y = Integer.parseInt(num2EditText.getText().toString());
        int answer = x - y;
        goToActivity(Integer.toString(answer));
    }

    // Function to multiply two numbers inputted by the user and take the user to a new screen to show the answer
    public void multiplyFunction(View view) {
        int x = Integer.parseInt(num1EditText.getText().toString());
        int y = Integer.parseInt(num2EditText.getText().toString());
        int answer = x * y;
        goToActivity(Integer.toString(answer));
    }

    // Function to divide two numbers inputted by the user and take the user to a new screen to show the answer
    public void divisionFunction(View view) {
        int x = Integer.parseInt(num1EditText.getText().toString());
        int y = Integer.parseInt(num2EditText.getText().toString());

        if (y == 0) {
            // Handle division by zero
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
//Test
            // Shake animation
            View rootLayout = findViewById(R.id.rootLayout);
            Animation shakeAnimation = new TranslateAnimation(0, 10, 0, 0);
            shakeAnimation.setDuration(100);
            shakeAnimation.setInterpolator(new CycleInterpolator(5));
            rootLayout.startAnimation(shakeAnimation);
        } else {
            int answer = x / y;
            goToActivity(Integer.toString(answer));
        }
    }

    // Function to go to a new screen to show the answer
    public void goToActivity(String s) {
        Intent intent = new Intent(this, answerScreen.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

}