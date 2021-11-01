package com.example.caltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ed1;
    private Button btnClear,btnDiv,btnMul,btnMin,btnPlus,btnEqual,
            btn0,btn1,btn2,btn3,btn4,
            btn5,btn6,btn7,btn8,btn9;
    private String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);

        btnClear = findViewById(R.id.btnClear);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnMin = findViewById(R.id.btnMin);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqual = findViewById(R.id.btnEqual);

        btnClear.setOnClickListener(calEvt);
        btnDiv.setOnClickListener(calEvt);
        btnMul.setOnClickListener(calEvt);
        btnMin.setOnClickListener(calEvt);
        btnPlus.setOnClickListener(calEvt);
        btnEqual.setOnClickListener(calEvt);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btn0.setOnClickListener(numberEvt);
        btn1.setOnClickListener(numberEvt);
        btn2.setOnClickListener(numberEvt);
        btn3.setOnClickListener(numberEvt);
        btn4.setOnClickListener(numberEvt);
        btn5.setOnClickListener(numberEvt);
        btn6.setOnClickListener(numberEvt);
        btn7.setOnClickListener(numberEvt);
        btn8.setOnClickListener(numberEvt);
        btn9.setOnClickListener(numberEvt);

    }
    View.OnClickListener numberEvt = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn0 :
                    text = ed1.getText().toString()+"0";
                    ed1.setText(text);
                    break;
                case R.id.btn1 :
                    text = ed1.getText().toString()+"1";
                    ed1.setText(text);
                    break;
                case R.id.btn2 :
                    text = ed1.getText().toString()+"2";
                    ed1.setText(text);
                    break;
                case R.id.btn3 :
                    text = ed1.getText().toString()+"3";
                    ed1.setText(text);
                    break;
                case R.id.btn4 :
                    text = ed1.getText().toString()+"4";
                    ed1.setText(text);
                    break;
                case R.id.btn5 :
                    text = ed1.getText().toString()+"5";
                    ed1.setText(text);
                    break;
                case R.id.btn6 :
                    text = ed1.getText().toString()+"6";
                    ed1.setText(text);
                    break;
                case R.id.btn7 :
                    text = ed1.getText().toString()+"7";
                    ed1.setText(text);
                    break;
                case R.id.btn8 :
                    text = ed1.getText().toString()+"8";
                    ed1.setText(text);
                    break;
                case R.id.btn9 :
                    text = ed1.getText().toString()+"9";
                    ed1.setText(text);
                    break;


            }
        }
    };
    View.OnClickListener calEvt = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btnDiv:
                    text = ed1.getText().toString()+"/";
                    ed1.setText(text);
                    break;
                case R.id.btnMul :
                    text = ed1.getText().toString()+"*";
                    ed1.setText(text);
                    break;
                case R.id.btnMin :
                    text = ed1.getText().toString()+"-";
                    ed1.setText(text);
                    break;
                case R.id.btnPlus :
                    text = ed1.getText().toString()+"+";
                    ed1.setText(text);
                    break;
                case R.id.btnEqual  :
                    text = ed1.getText().toString()+"=";
                    ed1.setText(text);
                    break;
                case R.id.btnClear:
                    ed1.setText("");
                    break;

            }
        }
    };
}