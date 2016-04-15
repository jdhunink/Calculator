package org.somecompany.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    public TextView top_text;
    public  double currentTopValue;
    public double firstValue;
    public double secondValue;
    public double finalValue;
    public Character operator;

    public void clickedZero(View view) {
        currentTopValue = (currentTopValue * 10.0) + 0.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedOne(View view) {
        currentTopValue = (currentTopValue * 10.0) + 1.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedTwo(View view) {
        currentTopValue = (currentTopValue * 10.0) + 2.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedThree(View view) {
        currentTopValue = (currentTopValue * 10.0) + 3.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedFour(View view) {
        currentTopValue = (currentTopValue * 10.0) + 4.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedFive(View view) {
        currentTopValue = (currentTopValue * 10.0) + 5.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedSix(View view) {
        currentTopValue = (currentTopValue * 10.0) + 6.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedSeven(View view) {
        currentTopValue = (currentTopValue * 10.0) + 7.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedEight(View view) {
        currentTopValue = (currentTopValue * 10.0) + 8.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void clickedNine(View view) {
        currentTopValue = (currentTopValue * 10.0) + 9.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void Add(View view) {
        firstValue = (currentTopValue);
        currentTopValue = 0.0;
        operator = '+';
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void Subtract(View view) {
        firstValue = (currentTopValue);
        currentTopValue = 0.0;
        operator = '-';
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void Multiply(View view) {
        firstValue = (currentTopValue);
        currentTopValue = 0.0;
        operator = '*';
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void Divide(View view) {
        firstValue = (currentTopValue);
        currentTopValue = 0.0;
        operator = '/';
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);
    }

    public void Equals(View view) {
        secondValue = (currentTopValue);

        if(operator == '+') {
            finalValue = firstValue + secondValue;
            TextView top_text = (TextView) findViewById(R.id.top_text);
            top_text.setText("" + finalValue);
        }

        if (operator == '-') {
            finalValue = firstValue - secondValue;
            TextView top_text = (TextView) findViewById(R.id.top_text);
            top_text.setText("" + finalValue);
        }

        if (operator == '*') {
            finalValue = firstValue * secondValue;
            TextView top_text = (TextView) findViewById(R.id.top_text);
            top_text.setText("" + finalValue);
        }

        if (operator == '/') {
            finalValue = firstValue / secondValue;
            TextView top_text = (TextView) findViewById(R.id.top_text);
            top_text.setText("" + finalValue);
        }

        firstValue = finalValue;
        secondValue = 0.0;
    }

    public void Clear(View view) {
        currentTopValue = 0.0;
        firstValue = 0.0;
        secondValue = 0.0;
        TextView top_text = (TextView) findViewById(R.id.top_text);
        top_text.setText("" + currentTopValue);

    }
}

