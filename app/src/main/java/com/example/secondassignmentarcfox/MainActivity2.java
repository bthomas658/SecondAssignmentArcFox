package com.example.secondassignmentarcfox;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    TextView mainView2;
    TextView mainNum2;
    Button buttonRdn;
    Random rand = new Random();
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // create references to our GUI elements
        mainView2 = (TextView) (findViewById(R.id.text_random));
        mainNum2 = (TextView) (findViewById(R.id.text_random_num));
        buttonRdn = (Button) findViewById(R.id.butRandom);

        // make the application respond to clicks of the random button
        buttonRdn.setOnClickListener(v3 -> {
            randomNumber = rand.nextInt(99) + 1;
            mainNum2.setText(String.valueOf(randomNumber));
        });
    }
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.addSubtract:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                return true;

            default:
                return true;
        }

    }
}