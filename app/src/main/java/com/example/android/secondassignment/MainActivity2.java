package com.example.android.secondassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends ActionBarActivity {

    TextView mainView2;
    TextView mainNum2;
    Button buttonRdn;
    Random rand = new Random();
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Make the random button work

        mainView2 = (TextView) (findViewById(R.id.text_random));
        mainNum2 = (TextView) (findViewById(R.id.text_random_num));
        buttonRdn = (Button) findViewById(R.id.butRandom);

        buttonRdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                randomNumber = rand.nextInt(99 - 0) + 0;
                mainNum2.setText(String.valueOf(randomNumber));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        // if (id == R.id.action_settings) {
        // return true;
        //}

        switch (id){
            case R.id.addSubtract:
                Intent intent = new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(intent);
                return true;

            default:
                return true;
        }

        //return super.onOptionsItemSelected(item);
    }
}
