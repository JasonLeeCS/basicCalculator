package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class answerScreen extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_screen);

        // Show the answer on the screen
        textView = findViewById(R.id.textView5);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView.setText("Answer: " + str);

    }

    // Function to go back to the main screen
    public void goBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}