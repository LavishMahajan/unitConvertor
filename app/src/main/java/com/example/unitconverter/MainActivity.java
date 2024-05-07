package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button myBtn;
    EditText myEditText;
    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myEditText = findViewById(R.id.et);
        myBtn = findViewById(R.id.button);
        myTextView = findViewById(R.id.myText);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = myEditText.getText().toString();
                double value = Double.parseDouble(inputText);

                double cm = makeConversion(value);
                //Now to display the info, we gonna use the setText() function using myTextView Object

                myTextView.setText("" + cm);
            }
        });
    }

    public double makeConversion(double value){
        return value * 2.54;
    }
}