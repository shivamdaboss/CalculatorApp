package com.example.shivamthelordalmighty.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    
    Button bZero;
    Button bOne;
    Button bTwo;
    Button bThree;
    Button bFour;
    Button bFive;
    Button bSix;
    Button bSeven;
    Button bEight;
    Button bNine;
    Button bDot;
    Button bEquals;
    Button bPlus;
    Button bSubtract;
    ImageButton bDivide;
    ImageButton bMultiply;
    ImageButton bDelete;

    boolean answer;
    boolean error;


    TextView screen;

    HorizontalScrollView scv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        answer = false;
        setContentView(R.layout.activity_main);
        bZero = findViewById(R.id.bZero);
        bOne = findViewById(R.id.bOne);
        bTwo = findViewById(R.id.bTwo);
        bThree = findViewById(R.id.bThree);
        bFour = findViewById(R.id.bFour);
        bFive = findViewById(R.id.bFive);
        bSix = findViewById(R.id.bSix);
        bSeven = findViewById(R.id.bSeven);
        bEight = findViewById(R.id.bEight);
        bNine = findViewById(R.id.bNine);
        bDot = findViewById(R.id.bDot);
        bEquals = findViewById(R.id.bEquals);
        bPlus = findViewById(R.id.bAdd);
        bSubtract = findViewById(R.id.bSubtract);
        bDivide = findViewById(R.id.bDivide);
        bDelete = findViewById(R.id.bDelete);
        bMultiply = findViewById(R.id.bMulti);
        screen = findViewById(R.id.screen);

        bZero.setOnClickListener(this);
        bOne.setOnClickListener(this);
        bTwo.setOnClickListener(this);
        bThree.setOnClickListener(this);
        bFour.setOnClickListener(this);
        bFive.setOnClickListener(this);
        bSix.setOnClickListener(this);
        bSeven.setOnClickListener(this);
        bEight.setOnClickListener(this);
        bNine.setOnClickListener(this);
        bMultiply.setOnClickListener(this);
        bDivide.setOnClickListener(this);
        bSubtract.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bDot.setOnClickListener(this);
        bDelete.setOnClickListener(this);

        screen.setSelected(true);

        scv = findViewById(R.id.yeet);
        error = false;

        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method(splitter((String) screen.getText()));
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bZero:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "0");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bOne:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "1");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bTwo:
                if(answer){
                    screen.setText("");
                    answer = false;
                }

                screen.setText(screen.getText() + "2");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bThree:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "3");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bFour:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "4");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bFive:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "5");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bSix:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "6");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bSeven:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "7");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bEight:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "8");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bNine:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + "9");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bMulti:
                if(answer){
                    if(error){
                        error = false;
                        screen.setText("");
                    }
                    answer = false;
                }
                screen.setText(screen.getText() + " * ");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bDivide:
                if(answer){
                    if(error){
                        error = false;
                        screen.setText("");
                    }
                    answer = false;
                }
                screen.setText(screen.getText() + " / ");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bAdd:
                if(answer){
                    if(error){
                        error = false;
                        screen.setText("");
                    }
                    answer = false;
                }
                screen.setText(screen.getText() + " + ");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bSubtract:
                if(answer){
                    if(error){
                        error = false;
                        screen.setText("");
                    }
                    answer = false;
                }
                screen.setText(screen.getText() + " - ");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bDelete:
                if(answer){
                    if(error){
                        error = false;
                        screen.setText("");
                    }
                    screen.setText("");
                    answer = false;
                }
               if(screen.getText().length() > 1) {
                    screen.setText(screen.getText().subSequence(0, screen.getText().length() - 1));
                }
                else{
                   screen.setText("");
               }
                scv.fullScroll(View.FOCUS_RIGHT);
                break;
            case R.id.bDot:
                if(answer){
                    screen.setText("");
                    answer = false;
                }
                screen.setText(screen.getText() + ".");
                scv.fullScroll(View.FOCUS_RIGHT);
                break;

        }
    }

    public ArrayList<String> splitter(String x){
       ArrayList<String> a = new ArrayList<String>(Arrays.asList(x.split(" ")));
        return a;
    }

    public void method(ArrayList<String> x) {
        //errors in formatting
        if(x.get(x.size() - 1).equals("*") || x.get(x.size() - 1).equals("-") || x.get(x.size() - 1).equals("+") || x.get(x.size() - 1).equals("/")){
            screen.setText("error");
            answer = true;
            error = true;
            return;
        }

        for( int i = 0; i < x.size(); i++ ) {
            if( x.get( i ).equals( "*" ) ) {
                try {
                    Double temp = Double.parseDouble(x.get(i - 1)) * Double.parseDouble( x.get( i + 1 ) );
                    x.set(i, temp.toString());
                    x.remove(i - 1);
                    x.remove(i);
                    answer = true;
                    i = 0;
                } catch (NumberFormatException e) {
                    screen.setText("error");
                    answer = true;
                    error = true;
                    return;
                }
            }
            else if(x.get(i).equals("/")){
                try{

                    Double numb = Double.parseDouble(x.get(i+1));
                    if(numb == 0.0){
                        screen.setText("error");
                        answer = true;
                        error = true;
                        return;
                    }
                    Double temp = Double.parseDouble(x.get(i - 1)) / Double.parseDouble(x.get(i+1));
                    x.set(i, temp.toString());
                    x.remove(i-1);
                    x.remove(i);
                    answer = true;
                    i = 0;
                }
                catch(NumberFormatException e){
                    screen.setText("error");
                    answer = true;
                    error = true;
                    return;
                }
            }
        }

        for(int i = 1; i < x.size(); i++){
            if(x.get(i).equals("+")) {
                try {
                    Double temp = Double.parseDouble(x.get(i - 1)) + Double.parseDouble(x.get(i + 1));
                    x.set(i, temp.toString());
                    x.remove(i - 1);
                    x.remove(i);
                    answer = true;
                    i = 0;
                } catch (NumberFormatException e) {
                    screen.setText("error");
                    error = true;
                    answer = true;
                    return;
                }
            }
            else if(x.get(i).equals("-")){
                try{
                    Double temp = Double.parseDouble(x.get(i - 1)) - Double.parseDouble(x.get(i+1));
                    x.set(i, temp.toString());
                    x.remove(i-1);
                    x.remove(i);
                    answer = true;
                    i = 0;

                }
                catch(NumberFormatException e){
                    screen.setText("error");
                    answer = true;
                    error = true;
                    return;
                }
            }
        }

        screen.setText((String)x.get(0));

    }
}


