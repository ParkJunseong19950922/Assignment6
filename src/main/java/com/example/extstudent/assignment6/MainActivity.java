package com.example.extstudent.assignment6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private String calc;
    private String ans;
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewCalc = (TextView)findViewById(R.id.textViewCalc);
        calc = textViewCalc.getText().toString();

        final TextView textViewAns = (TextView)findViewById(R.id.textViewAns);
        ans = textViewAns.getText().toString();

        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button)findViewById(R.id.buttonMinus);
        Button buttonMult = (Button)findViewById(R.id.buttonMult);
        Button buttonDiv = (Button)findViewById(R.id.buttonDiv);

        Button buttonAns = (Button)findViewById(R.id.buttonAns);
        Button buttonCE = (Button)findViewById(R.id.buttonCE);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"0");
                calc = calc + "0";
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"1");
                calc = calc + "1";
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"2");
                calc = calc + "2";
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"3");
                calc = calc + "3";
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"4");
                calc = calc + "4";
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"5");
                calc = calc + "5";
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"6");
                calc = calc + "6";
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"7");
                calc = calc + "7";
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"8");
                calc = calc + "8";
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"9");
                calc = calc + "9";
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"+");
                calc = calc + "+";
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"-");
                calc = calc + "-";
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"x");
                calc = calc + "x";
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCalc.setText(calc +"/");
                calc = calc + "/";
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calc.length() == 0){
                    textViewCalc.setText("");
                } else {
                    calc = calc.substring(0,calc.length()-1);
                    textViewCalc.setText(calc);
                }
            }
        });

        buttonAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int add = calc.indexOf("+");
                int sub = calc.indexOf("-");
                int mult = calc.indexOf("x");
                int div = calc.indexOf("/");

                int[] ints = {add,sub,mult,div};
                //Arrays.sort(ints);

                ArrayList<Integer> op =  new ArrayList<Integer>();
                ArrayList<String> symbol = new ArrayList<String>();
                ArrayList<String> sum = new ArrayList<String>();

                for(int s : ints) {
                    if(s != -1) {
                        op.add(s);
                        symbol.add(calc.substring(s));
                    }
                }

                if (calc.substring(0,1).equals("+") || calc.substring(0,1).equals("-") || calc.substring(0,1).equals("x") || calc.substring(0,1).equals("/") ||
                        calc.substring(calc.length()-1).equals("+") || calc.substring(calc.length()-1).equals("-") || calc.substring(calc.length()-1).equals("x") ||
                        calc.substring(calc.length()-1).equals("/")) {
                    textViewAns.setText("Error");
                } else if (op.size() == 0){
                    textViewAns.setText(calc);
                } else {
                    sum.add(calc.substring(0,op.get(0)));
                    for (int i=0;i<op.size();i++){
                        if (i + 1 == op.size()){
                            sum.add(calc.substring(op.get(i)+1));
                        } else {
                            sum.add(calc.substring(op.get(i)+1,op.get(i+1)));
                        }
                    }

                    for (int j=0;j<op.size();j++){

                    }
                }

            }
        });
    }

    public int addition(){
        return 0;
    }
}
