package com.example.secondassignmentarcfox;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView mainNum;
    Button buttonAdd;
    Button buttonSub;
    int counter;


    @Override //this is here to tell the compiler we are actually overriding a method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a reference to our buttons and text field
        mainNum = (TextView)(findViewById(R.id.text_total_num));
        buttonAdd = (Button)findViewById(R.id.butAdd);
        buttonSub = (Button)findViewById(R.id.butSub);


        //handling the add button listener
        buttonAdd.setOnClickListener(v1 -> {
            counter++;
            mainNum.setText(String.valueOf(counter));
        });

        //handle the subtract button listener
        buttonSub.setOnClickListener(v2 -> {
            counter--;
            mainNum.setText(String.valueOf(counter));
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.random:
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                return true;

            default:
                return true;
        }
    }
}
