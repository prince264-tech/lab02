package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    TextView txt1;
    EditText edt1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1= (TextView) findViewById (R.id.txt1);
        edt1= (EditText) findViewById (R.id.edt1);
    }
    public void sayHello( View v){
    txt1.setText("hello"+ edt1.getText().toString());
    }
}