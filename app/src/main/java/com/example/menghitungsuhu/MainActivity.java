package com.example.menghitungsuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button convert;
    private EditText txt_celcius, txt_kelvin, txt_fahrenheit, txt_reamur;
    private int rumus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert = (Button) findViewById(R.id.btn_convert);
        txt_celcius = (EditText) findViewById(R.id.txt_celcius);
        txt_kelvin = (EditText) findViewById(R.id.txt_kelvin);
        txt_fahrenheit = (EditText) findViewById(R.id.txt_fahrenheit);
        txt_reamur = (EditText) findViewById(R.id.txt_reamur);

        convert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                txt_reamur.setText(reamur().toString());
                txt_fahrenheit.setText(fahrenheit().toString());
                txt_kelvin.setText(kelvin().toString());
            }
        });

    }

    public Double reamur(){
        String celcius = txt_celcius.getText().toString();
        Double getCelcius = Double.parseDouble(celcius);
        Double hasil = getCelcius * 4 / 5;
        return hasil;
    }

    public Double fahrenheit(){
        String celcius = txt_celcius.getText().toString();
        Double getCelcius = Double.parseDouble(celcius);
        Double hasil = getCelcius * 9 / 5 + 32;
        return hasil;

    }

    public Double kelvin(){
        String celcius = txt_celcius.getText().toString();
        Double getCelcius = Double.parseDouble(celcius);
        Double hasil = getCelcius + 273;
        return hasil;
    }
}
