package com.example.ejerciciopractico2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvResultado;
    private EditText etInput1, etInput2;
    private RadioButton rbSuma, rbResta, rbMultiplicacion, rbDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = (TextView) findViewById(R.id.tvResultado);

        etInput1 = (EditText) findViewById(R.id.etInput1);
        etInput2 = (EditText) findViewById(R.id.etInput2);

        rbSuma = (RadioButton) findViewById(R.id.rbSuma);
        rbResta = (RadioButton) findViewById(R.id.rbResta);
        rbMultiplicacion = (RadioButton) findViewById(R.id.rbMultiplicacion);
        rbDivision = (RadioButton) findViewById(R.id.rbDivision);
    }

    public void calcuar(View view){
        String input1 = etInput1.getText().toString();
        String input2 = etInput2.getText().toString();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        float resultado = 0;

        if(rbSuma.isChecked()){
            resultado = num1 + num2;
            tvResultado.setText(String.valueOf(resultado));

        } else if(rbResta.isChecked()){
            resultado = num1 - num2;
            tvResultado.setText(String.valueOf(resultado));

        } else if(rbMultiplicacion.isChecked()){
            resultado = num1 * num2;
            tvResultado.setText(String.valueOf(resultado));

        } else if(rbDivision.isChecked()){
            if(num2 == 0) {
                Toast.makeText(this, "No se puede dividr entre 0", Toast.LENGTH_LONG).show();
                tvResultado.setText("Resultado");
            }
            else {
                resultado = (float) num1 / num2;
                tvResultado.setText(String.valueOf(resultado));
            }
        }
    }
}