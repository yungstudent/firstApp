package com.example.yung.hangmangame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    private String word = "I";

    private void inWord(String aLetter, ImageView anImage, TextView aText){
        if (!aLetter.equals(word)){
            anImage.setImageResource(R.drawable.hangman8);
            aText.setText(getString(R.string.lose));
        }else{
            aText.setText(getString(R.string.woord) + ": " + word + ". " + getString(R.string.win));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView hangmanImage = (ImageView) findViewById(R.id.hangmanImage);
        final TextView woord = (TextView) findViewById(R.id.woord);

        final Button buttonA = (Button) findViewById(R.id.buttonA);
        final Button buttonE = (Button) findViewById(R.id.buttonE);
        final Button buttonI = (Button) findViewById(R.id.buttonI);
        final Button buttonO = (Button) findViewById(R.id.buttonO);
        final Button buttonU = (Button) findViewById(R.id.buttonU);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inWord(buttonA.getText().toString(), hangmanImage, woord);
            }
        });

        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inWord(buttonE.getText().toString(), hangmanImage, woord);
            }
        });
        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inWord(buttonI.getText().toString(), hangmanImage, woord);
            }
        });
        buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inWord(buttonO.getText().toString(), hangmanImage, woord);
            }
        });
        buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inWord(buttonU.getText().toString(), hangmanImage, woord);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
