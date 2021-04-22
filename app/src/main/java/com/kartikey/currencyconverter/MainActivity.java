package com.kartikey.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public void hoverOnEdit(View view){
//        EditText editText1 = (EditText) findViewById(R.id.editmode);
//        editText1.setText("");
//
//    }
    public void ConvertIntoDollar(View view){
        EditText editText = (EditText) findViewById(R.id.editmode);
//        editText.setText("");

        int rupees = Integer.parseInt(editText.getText().toString());
        double result = rupees / 73.38 ;
        TextView Text = (TextView) findViewById(R.id.result);
        Text.setText("Rs. " + rupees +" is equal to "+ result+" dollars");

//        Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }
}