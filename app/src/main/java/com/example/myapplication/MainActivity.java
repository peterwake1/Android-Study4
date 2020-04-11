package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.os.Bundle;


import android.widget.Button;

import android.widget.TextView;

import android.widget.EditText;

import android.widget.Toast;

import android.widget.RadioGroup;

import android.widget.RadioButton;

import android.widget.CheckBox;



public  class MainActivity extends AppCompatActivity {

    private  EditText input_text;
    private Button button_calculate;
    private RadioButton radioButton_male;
    private RadioButton radioButton_female;
    private TextView textView_result;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       input_text=findViewById(R.id.input_text);
       button_calculate=findViewById(R.id.button2);
       radioButton_male=findViewById(R.id.radioButton2);
       radioButton_female=findViewById(R.id.radioButton);
       textView_result=findViewById(R.id.textInputEditText);
       radioGroup=findViewById(R.id.radioGroup);

       button_calculate.setOnClickListener(new buttonListener());
      // radioGroup.setOnCheckedChangeListener(new radioGroupListener());
    }

    class buttonListener implements Button.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            double height=Double.parseDouble(input_text.getText().toString());
            StringBuffer sb=new StringBuffer();
            if(radioButton_male.isChecked())
            {
                double result=(height-80)*0.7;
                sb.append((int)result);
            }
            else if(radioButton_female.isChecked())
            {
                double result=(height-70)*0.6;
                sb.append((int)result);
            }
            textView_result.setText(sb.toString());
        }

    }




}





