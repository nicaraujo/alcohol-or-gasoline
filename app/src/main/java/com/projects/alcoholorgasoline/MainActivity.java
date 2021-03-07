package com.projects.alcoholorgasoline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText txt1;
    private TextInputEditText txt2;
    private TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.text1);
        txt2 = findViewById(R.id.text2);
        txt3 = findViewById(R.id.textView6);
    }

    public void price(View view) {
        String x = txt1.getText().toString();
        String y = txt2.getText().toString();
        if (validation(x, y)) {
            txt3.setText((Double.parseDouble(x) / Double.parseDouble(y) >= 0.7 ? "Melhor utilizar Gasolina" : "Melhor utilizar Álcool"));
        }
        else {
            txt3.setText("Preencha os campos primeiro!");
        }
    }
    public boolean validation(String a, String b) {
        boolean xyz = true;
        if (a.equals("") || a == null) {
            xyz = false;
        }
        else if (b.equals("") || b == null) {
            xyz = false;
        }
        return xyz;
    }

}