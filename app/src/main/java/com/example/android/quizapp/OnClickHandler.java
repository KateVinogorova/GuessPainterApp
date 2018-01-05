package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by qwerrty on 26.12.2017.
 */

interface OnClickHandler {

    /**
     * This method called when Next button is clicked
     *
     * @param v
     */
    void onClickNextButton(View v);

    /**
     * This method called when Hint button is clicked
     *
     * @param v
     */
    void onClickHintButton(View v);

    /**
     * This method calls when HELP button is clicked
     *
     * @param v
     */
    void onClickHelpButton(View v);

    /**
     * This method calls when EXIT button is clicked
     *
     * @param v
     */
    void onClickExitButton(View v);

}
