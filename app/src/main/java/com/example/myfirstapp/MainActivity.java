package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
    TextView tvInfo;
    EditText etInput;
    Button bControl,btnEnd;

    int guess;
    boolean gameFinished;

    @Override
    protected void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = findViewById(R.id.textView);
        etInput = findViewById(R.id.editText3);
        bControl = findViewById(R.id.button);
        btnEnd = findViewById(R.id.button_end);
        guess = (int)(Math.random()*100);
        gameFinished = false;

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {finish();}
        });
    }

    public void onClick(View v) {
        if (!gameFinished) {
            String inputText = etInput.getText().toString().trim(); // Trim to remove leading/trailing whitespace
            if (!inputText.isEmpty()) {
                try {
                    int inp = Integer.parseInt(inputText);
                    if (inp > 0 && inp <= 100) {
                        if (inp > guess) tvInfo.setText(getResources().getString(R.string.ahead));
                        else if (inp < guess) tvInfo.setText(getResources().getString(R.string.behind));
                        else {
                            tvInfo.setText(getResources().getString(R.string.hit));
                            bControl.setText(getResources().getString(R.string.play_more));
                            gameFinished = true;
                        }
                    }
                    else {
                        tvInfo.setText(getResources().getString(R.string.try_to_guess));
                        Toast.makeText(this, getResources().getString(R.string.error), Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    tvInfo.setText(getResources().getString(R.string.try_to_guess));
                    Toast.makeText(this, getResources().getString(R.string.error), Toast.LENGTH_SHORT).show();
                }
            }
            else {Toast.makeText(this, getResources().getString(R.string.error), Toast.LENGTH_SHORT).show();}
        }
        else {
            guess = (int) (Math.random() * 100);
            bControl.setText(getResources().getString(R.string.input_value));
            tvInfo.setText(getResources().getString(R.string.try_to_guess));
            gameFinished = false;
        }
        etInput.setText("");
    }

}
