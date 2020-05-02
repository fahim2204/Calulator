package com.fahim.calculator;


import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText TextBox;
    ArrayList<Integer> operand = new ArrayList<>();
    boolean IsDot = true;
    boolean IsOperator = true;
    String currOperator = "";
    String num1=null;
    String num2=null;
    String op=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextBox = findViewById(R.id.TextBox);
        TextBox.requestFocus();

        Button btnOne = findViewById(R.id.btnOne);
        Button btnTwo = findViewById(R.id.btnTwo);
        Button btnThree = findViewById(R.id.btnThree);
        Button btnFour = findViewById(R.id.btnFour);
        Button btnFive = findViewById(R.id.btnFive);
        Button btnSix = findViewById(R.id.btnSix);
        Button btnSeven = findViewById(R.id.btnSeven);
        Button btnEight = findViewById(R.id.btnEight);
        Button btnNine = findViewById(R.id.btnNine);
        Button btnZero = findViewById(R.id.btnZero);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnBrac = findViewById(R.id.btnBrac);
        Button btnPercent = findViewById(R.id.btnPercent);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnEqual = findViewById(R.id.btnEqual);
        Button btnDot = findViewById(R.id.btnDot);
        Button btnPlusMinus = findViewById(R.id.btnPlusMinus);


        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnBrac.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnPlusMinus.setOnClickListener(this);


        TextBox.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

                if(TextBox.length()>14)
                    TextBox.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
                if(TextBox.length()>19)
                    TextBox.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);

            }
        });

    }

public boolean IsNumber(char ch)
{
    if(ch == 0 || ch == 1 || ch == 2 || ch == 3 || ch == 4 || ch == 5 || ch == 6 || ch == 7 || ch == 8 || ch == 9)
        return true;
    else
        return false;
}


    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnOne:
                TextBox.append("1");
                IsOperator = true;
                break;
            case R.id.btnTwo:
                TextBox.append("2");
                IsOperator = true;
                break;
            case R.id.btnThree:
                TextBox.append("3");
                IsOperator = true;
                break;
            case R.id.btnFour:
                TextBox.append("4");
                IsOperator = true;
                break;
            case R.id.btnFive:
                TextBox.append("5");
                IsOperator = true;
                break;
            case R.id.btnSix:
                TextBox.append("6");
                IsOperator = true;
                break;
            case R.id.btnSeven:
                TextBox.append("7");
                IsOperator = true;
                break;
            case R.id.btnEight:
                TextBox.append("8");
                IsOperator = true;
                break;
            case R.id.btnNine:
                TextBox.append("9");
                IsOperator = true;
                break;
            case R.id.btnZero:
                if(TextBox.length()==0)
                    Toast.makeText(getApplicationContext(),"Invalid Format", Toast.LENGTH_SHORT).show();
                else
                    {
                      TextBox.append("0");
                      IsOperator = true;
                     }
                break;
            case R.id.btnPlus:
                if(IsOperator)
                {
                    TextBox.append("+");
                    currOperator = "+";
                    IsOperator = false;
                }
                else if(!IsOperator && currOperator!="+")
                {
                    TextBox.setText(TextBox.getText().toString().substring(0, TextBox.length() - 1)+"+");
                    TextBox.setSelection(TextBox.length());
                }
                else
                    Toast.makeText(getApplicationContext(),"Invalid Format", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnMinus:
                if(IsOperator)
                {
                    TextBox.append("-");
                    currOperator = "-";
                    IsOperator = false;
                }
                else if(!IsOperator && currOperator!="-")
                {
                    TextBox.setText(TextBox.getText().toString().substring(0, TextBox.length() - 1)+"-");
                    TextBox.setSelection(TextBox.length());
                }
                else
                    Toast.makeText(getApplicationContext(),"Invalid Format", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnMul:
                if(IsOperator)
                {
                    TextBox.append("×");
                    currOperator = "×";
                    IsOperator = false;
                }
                else if(!IsOperator && currOperator!="×")
                {
                    TextBox.setText(TextBox.getText().toString().substring(0, TextBox.length() - 1)+"×");
                    IsOperator = true;
                    TextBox.setSelection(TextBox.length());
                }
                else
                    Toast.makeText(getApplicationContext(),"Invalid Format", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnDiv:
                if(IsOperator)
                {
                    TextBox.append("÷");
                    currOperator = "÷";
                    IsOperator = false;
                }
                else if(!IsOperator && currOperator!="÷")
                {
                    TextBox.setText(TextBox.getText().toString().substring(0, TextBox.length() - 1)+"÷");
                    IsOperator = true;
                    TextBox.setSelection(TextBox.length());
                }
                else
                    Toast.makeText(getApplicationContext(),"Invalid Format", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnDot:
                if(IsDot)
                {
                    TextBox.append(".");
                    IsDot = false;
                }
                else
                    Toast.makeText(getApplicationContext(),"Invalid Format", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBrac:
                TextBox.append("(");
                break;
            case R.id.btnPercent:
                if(IsOperator)
                {
                    TextBox.append("%");
                    currOperator = "%";
                    IsOperator = false;
                }
                else
                    Toast.makeText(getApplicationContext(),"Invalid Format", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPlusMinus:
                TextBox.append("-+");
                break;
            case R.id.btnClear:
                TextBox.setText("");
                break;
            case R.id.btnEqual:
                for(int i=0;i<TextBox.length();i++)
                    {

                    }
                break;
        }
    }
}
