package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements OnClickHandler {

    static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClickNextButton(View v) {
        Intent intent = new Intent(this, Answer_1_Activity.class);
        startActivity(intent);
    }

    @Override
    public void onClickHintButton(View v) {

    }

    @Override
    public void onClickHelpButton(View v) {

    }

    @Override
    public void onClickExitButton(View v) {

    }

}
