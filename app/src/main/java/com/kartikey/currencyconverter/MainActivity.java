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

//        rupee = findViewById(R.id.editTextNumber);
//        String indianRupee = rupee.getText().toString().trim();

    }

    public void ConvertIntoDollar(View view){
        EditText editText = findViewById(R.id.editTextNumber);

        int rupees = Integer.parseInt(editText.getText().toString().trim());
        double result = rupees / 73.38 ;
        TextView Text = findViewById(R.id.result);
        Text.setText("Rs. " + rupees +" is equal to "+ String.format("%.2f",result)+" dollars");
        Text.setVisibility(View.VISIBLE);

    }
}