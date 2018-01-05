package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Answer_1_Activity extends AppCompatActivity implements OnClickHandler{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_1_layout);

        TextView numberOfPage = (TextView) findViewById(R.id.page_number);
        numberOfPage.setText("1 of 7");
    }

    @Override
    public void onClickNextButton (View v){
        RadioButton radioButton = (RadioButton) findViewById(R.id.malevich);
        if (radioButton.isChecked()){
            MainActivity.score += 2;
        }

        Intent intent = new Intent(this, Answer_2_Activity.class);
        startActivity(intent);
    }

    @Override
    public void onClickHintButton(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.hint);
        builder.setMessage(R.string.hint_1);
        AlertDialog dialog = builder.create();
        dialog.show();
        MainActivity.score --;
    }

    @Override
    public void onClickHelpButton(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.help);
        builder.setMessage(R.string.help_description);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onClickExitButton(View v) {
        super.onBackPressed();
    }


}
