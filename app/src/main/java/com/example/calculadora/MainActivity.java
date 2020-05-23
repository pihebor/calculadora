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
        try {
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            suma = num_uno + num_dos;
            resultado.setText("" + suma);
        } catch (Exception e) {
            numero_uno.setError("Revise que se halla digitado el primer numero");
            numero_dos.setError("Revise que se halla digitado el segundo numero");
        }
    }

    public void restar(View v){
        int num_uno, num_dos, resta;
        try {
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            resta = num_uno - num_dos;
            resultado.setText("" + resta);
        } catch (Exception e) {
            numero_uno.setError("Revise que se halla digitado el primer numero");
            numero_dos.setError("Revise que se halla digitado el segundo numero");
        }
    }

    public void multiplicar(View v){
        int num_uno, num_dos, multiplicacion;
        try {
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            multiplicacion = num_uno * num_dos;
            resultado.setText("" + multiplicacion);
        } catch (Exception e) {
            numero_uno.setError("Revise que se halla digitado el primer numero");
            numero_dos.setError("Revise que se halla digitado el segundo numero");
        }
    }

    public void dividir(View v){
        int num_uno, num_dos, division;
        try {
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());

            division = num_uno / num_dos;
            resultado.setText("" + division);
        } catch (Exception e) {
            numero_uno.setError("Revise que se halla digitado el primer numero");
            numero_dos.setError("Revise que se halla digitado el segundo numero");
        }
    }

    public void limpiar(View v){
        numero_uno.setText("");
        numero_dos.setText("");
        resultado.setText("");
        numero_uno.requestFocus();
    }

}
