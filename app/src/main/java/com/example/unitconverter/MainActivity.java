package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

       private Button button;
       private TextView textView;
       private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        textView = findViewById(R.id.tv);
        editText = findViewById(R.id.eTn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converted", Toast.LENGTH_SHORT).show();
                   String s =    editText.getText().toString();
                   float dl  = Integer.parseInt(s);
                   double tk = 102.17 * dl;


                 textView.setText("Dollar to BDT : " + tk + " Tk");
            }
        });
    }
}