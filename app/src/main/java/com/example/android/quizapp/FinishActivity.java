package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class FinishActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_layout);

        TextView textView = (TextView) findViewById(R.id.score_number);
        textView.setText(" " + MainActivity.score);

        TextView scoreComment = (TextView) findViewById(R.id.score_comment);

        if (MainActivity.score >= 12){
            scoreComment.setText(R.string.comment_excellent);
        }
        else if (MainActivity.score >= 8 && MainActivity.score < 12) {
            scoreComment.setText(R.string.comment_not_bad);
        }
        else {
            scoreComment.setText(R.string.comment_bad);
        }

    }
}
