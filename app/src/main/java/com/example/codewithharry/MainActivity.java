package com.example.codewithharry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] questions = {"Java is a person" , "JAVA IS ONE OF THE BEST PROGRAMMING LANGUAGE" , "jAVA was invented in 1334" , "java was created using phython" , "Java has gradle file " , "java support interfaces" };

    private boolean[] answere = { false , true , false , false , true, true};

    private int score = 0;

    private  int index = 0;

    Button yes;
    Button no;
    TextView textView;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no  = findViewById(R.id.no);
        textView = findViewById(R.id.question);
        textView.setText(questions[index]);
        result = findViewById(R.id.score);

        //click listner for yes
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index <= questions.length-1){
                    if(answere[index] == true){
                        score++;
                    }
                    index++;
                    if(index<= questions.length-1){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Score" + score, Toast.LENGTH_SHORT).show();


                    }
                }

            }
        });

           //click listner for No
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index <= questions.length-1){
                    if(answere[index] == false){
                        score++;
                    }
                    index++;
                    if(index<= questions.length-1){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Score" + score, Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });


    }
}