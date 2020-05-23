package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numero_uno, numero_dos;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero_uno=findViewById(R.id.txtNumeroUno);
        numero_dos=findViewById(R.id.txtNumeroDos);
        resultado= findViewById(R.id.lblResultado);

    }

    public void calcular(View v) {
        int num_uno, num_dos, suma;
        if (validar()) {
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            suma = num_uno + num_dos;
            resultado.setText("" + suma);
        }

    }

    public void restar(View v){
        int num_uno, num_dos, resta;
        if (validar()) {
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            resta = num_uno - num_dos;
            resultado.setText("" + resta);
        }

    }

    public void multiplicar(View v){
        int num_uno, num_dos, multiplicacion;
        if (validar()) {
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            multiplicacion = num_uno * num_dos;
            resultado.setText("" + multiplicacion);
        }
    }

    public void dividir(View v){
        int num_uno, num_dos, division;
        if (validar()) {
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            division = num_uno / num_dos;
            resultado.setText("" + division);
        }
    }

    public void limpiar(View v){
        numero_uno.setText("");
        numero_dos.setText("");
        resultado.setText("");
        numero_uno.requestFocus();
    }

    public boolean validar() {
        String error_numero_uno, error_numero_dos;
        error_numero_uno= getResources().getString(R.string.error_numero_uno);
        error_numero_dos= getResources().getString(R.string.error_numero_dos);
        if (numero_uno.getText().toString().isEmpty()) {
            numero_uno.setError(error_numero_uno);
            numero_uno.requestFocus();
            return false;
        } else if (numero_dos.getText().toString().isEmpty())
            numero_dos.setError(error_numero_dos);
        numero_dos.requestFocus();
        return false;
    }
    }

