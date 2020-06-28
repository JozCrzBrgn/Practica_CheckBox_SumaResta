package com.example.practica_checkbox_sumaresta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed1, ed2;
    private CheckBox cb1, cb2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relación de valores entre la parte gráfica y la parte lógica
        ed1 = (EditText)findViewById(R.id.txt_num1);
        ed2 = (EditText)findViewById(R.id.txt_num2);
        cb1 = (CheckBox)findViewById(R.id.cb_suma);
        cb2 = (CheckBox)findViewById(R.id.cb_resta);
        tv1 = (TextView)findViewById(R.id.tv_resultado);
    }

    // Método para realizar operaciones al dar click al botón
    public void SumaResta(View view){
        //Nos traemos el texto de la parte gráfica (llegan en formato String)
        String strNum1 = ed1.getText().toString();
        String strNum2 = ed2.getText().toString();

        //Pasamos los valores a enteros para poder hacer operaciones
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        // Variable de acumulación
        String resultado = "";

        //Hacemos los cálculos
        if(cb1.isChecked() == true && cb2.isChecked() == true){
            int suma = num1 + num2;
            int resta = num1 - num2;
            resultado = " La suma es: " + suma + " / " + " La resta es: " + resta;
            tv1.setText(resultado);
        }
        if(cb1.isChecked() == true && cb2.isChecked() == false){
            int suma = num1 + num2;
            resultado = " La suma es: " + suma;
            tv1.setText(resultado);
        }
        if(cb1.isChecked() == false && cb2.isChecked() == true){
            int resta = num1 - num2;
            resultado = " La resta es: " + resta;
            tv1.setText(resultado);
        }
        if(cb1.isChecked() == false && cb2.isChecked() == false){
            Toast.makeText(this,"Seleccione la opción de sumar o restar",Toast.LENGTH_SHORT).show();
        }


    }



}