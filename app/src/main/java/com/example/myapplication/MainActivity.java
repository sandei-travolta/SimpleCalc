package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonadd,buttonsub,buttonmul,buttondiv;
    EditText editTextone,editTexttwo;
    TextView textView;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonadd=findViewById(R.id.btn_add);
        buttonsub=findViewById(R.id.btn_sub);
        buttondiv=findViewById(R.id.btn_div);
        buttonmul=findViewById(R.id.btn_mul);
        editTextone=findViewById(R.id.numberOne);
        editTexttwo=findViewById(R.id.numberTwo);
        textView=findViewById(R.id.answer);

        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
    }
    @SuppressLint("SuspiciousIndentation")
    public int getIntFromTxt(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this,"Enter Number",Toast.LENGTH_LONG).show();
            return 0;
        }else
        return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View v) {
        num1 = getIntFromTxt(editTextone);
        num2 = getIntFromTxt(editTexttwo);

        if (v.getId() == R.id.btn_add) {
            textView.setText("Answer=" + (num1 + num2));
        } else if (v.getId() == R.id.btn_sub) {
            textView.setText("Answer=" + (num1 - num2));
        } else if (v.getId() == R.id.btn_mul) {
            textView.setText("Answer=" + (num1 * num2));
        } else if (v.getId() == R.id.btn_div) {
            textView.setText("Answer=" + (num1 / num2));
        }
    }

}