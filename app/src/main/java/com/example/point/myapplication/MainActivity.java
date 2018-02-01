package com.example.point.myapplication;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.genderGroup);
        radioGroup .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity.this, "You select male", Toast.LENGTH_LONG).show();
                        break;
                        case R.id.radioButton2:
                            Toast.makeText(MainActivity.this, "You select female", Toast.LENGTH_LONG).show();
                            break; }
            }
        });

        CheckBox cc1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        cc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You select XML", Toast.LENGTH_LONG).show();
            } }
            );
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You select jAVA", Toast.LENGTH_LONG).show();
            }
        });


        Switch switchbtn= (Switch)findViewById(R.id.switch1);
        switchbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_LONG).show();
                }

        else {
                    Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_LONG).show();
                }
            }

        });

        final Spinner spinner= (Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, spinner.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
            }
            @Override public void onNothingSelected(AdapterView<?> parent) {

            } });


    }
}
