package com.example.madhu.simplemath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String TAG = MainActivity.class.getSimpleName();

    private int a,b,c,d ,sum,mul,sub;
    private EditText firstNumber,secondNumber,thirdNumber,fourthNumber;
    private TextView lblResult;
    private Button btnAdd,btnMul,btnSub;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);
        thirdNumber = (EditText) findViewById(R.id.thirdNumber);
        fourthNumber = (EditText) findViewById(R.id.fourthNumber);
        lblResult = (TextView) findViewById(R.id.result);
        btnAdd = (Button)findViewById(R.id.btn_sum);
        btnMul = (Button)findViewById(R.id.btn_mul);
        btnSub = (Button)findViewById(R.id.btn_sub);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
    }

     private void doMath(int operation){
         a = Integer.parseInt(firstNumber.getText().toString());
         b = Integer.parseInt(secondNumber.getText().toString());
         c = Integer.parseInt(thirdNumber.getText().toString());
         d = Integer.parseInt(fourthNumber.getText().toString());

         int ans;

         switch (operation){
             case 1: // sum
                 ans = a + b + c + d;
                 break;

             case 2: // mul
                 ans = a * b * c * d;
                 break;

             case 3: //sub
                 ans = a - b - c - d;
                 break;

             default:
                 ans = 0;
         }

         lblResult.setText("" + ans);
    }

    @Override
    public void onClick(View v) {
        Log.e(TAG, "onClick");

        switch (v.getId()){
            case R.id.btn_sum:
                doMath(1);
                break;

            case R.id.btn_mul:
                doMath(2);
                break;

            case R.id.btn_sub:
                doMath(3);
                break;
        }
    }
}
