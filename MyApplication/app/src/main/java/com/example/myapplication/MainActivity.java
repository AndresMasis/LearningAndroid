package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etFisica, etMatematicas, etQuimica;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFisica = (EditText) findViewById(R.id.fisicaInput);
        etMatematicas = (EditText) findViewById(R.id.matematicasInput);
        etQuimica = (EditText) findViewById(R.id.quimicaInput);

        tv1 = (TextView) findViewById(R.id.StatusText);
    }

    public void promedio(View view){
        String valorFisica = etFisica.getText().toString();
        String valorMatematicas = etMatematicas.getText().toString();
        String valorQuimica = etQuimica.getText().toString();

        int notaFisica = Integer.parseInt(valorFisica);
        int notaMatematicas = Integer.parseInt(valorMatematicas);
        int notaQuimica = Integer.parseInt(valorQuimica);

        float promedio = (float) (notaFisica+notaQuimica+notaMatematicas)/3;

        String status = "aprobado";
        if(promedio < 7) status = "reprobado";

        tv1.setText("El estado del estudiante es " + status + " con nota de " + Float.toString(promedio));

    }
}