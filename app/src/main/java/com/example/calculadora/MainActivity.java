package com.example.calculadora;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {

     private double resultado = 0.0;
     private String mostrarResultado;
     private String mostrarOperacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonNumero0 = findViewById(R.id.botonNumero0);
        Button botonNumero1 = findViewById(R.id.botonNumero1);
        Button botonNumero2 = findViewById(R.id.botonNumero2);
        Button botonNumero3 = findViewById(R.id.botonNumero3);
        Button botonNumero4 = findViewById(R.id.botonNumero4);
        Button botonNumero5 = findViewById(R.id.botonNumero5);
        Button botonNumero6 = findViewById(R.id.botonNumero6);
        Button botonNumero7 = findViewById(R.id.botonNumero7);
        Button botonNumero8 = findViewById(R.id.botonNumero8);
        Button botonNumero9 = findViewById(R.id.botonNumero9);
        Button botonPunto = findViewById(R.id.botonPunto);
        Button botonSumar = findViewById(R.id.botonSumar);
        Button botonRestar = findViewById(R.id.botonRestar);
        Button botonDividir = findViewById(R.id.botonDividir);
        Button botonMultiplicar = findViewById(R.id.botonMultiplicar);
        Button botonCalcular = findViewById(R.id.botonCalcular);
        Button botonBorrar = findViewById(R.id.botonBorrar);
        Button botonMostrar = findViewById(R.id.botonMostrar);
        Button botonGuardar = findViewById(R.id.botonGuardar);
        final TextView operacion = findViewById(R.id.operacion);



        botonNumero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                   operacion.setText("0");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "0");
                }
            }
        });


        botonNumero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("1");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "1");
                }
            }
        });


        botonNumero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("2");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "2");
                }
            }
        });


        botonNumero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("3");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "3");
                }
            }
        });


        botonNumero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("4");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "4");
                }
            }
        });


        botonNumero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("5");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "5");
                }
            }
        });


        botonNumero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("6");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "6");
                }
            }
        });


        botonNumero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("7");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "7");
                }
            }
        });

        botonNumero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("8");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "8");
                }
            }
        });

        botonNumero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("9");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + "9");
                }
            }
        });

        botonPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                if (resultado != 0){
                    operacion.setText("0.");
                    resultado=0;
                }else{
                    operacion.setText(operacionAnterior + ".");
                }
            }
        });

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoOperacion = operacion.getText().toString().trim();
                if (textoOperacion.isEmpty()) {
                    operacion.setText("No se puede establecer el operador");
                }else {
                    Object operacionAnterior = operacion.getText();
                    operacion.setText(operacionAnterior + "+");
                    resultado=0;
                }
            }
            });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object operacionAnterior = operacion.getText();
                operacion.setText(operacionAnterior + "-");
                resultado=0;
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoOperacion = operacion.getText().toString().trim();
                if (textoOperacion.isEmpty()) {
                    operacion.setText("No se puede establecer el operador");
                }else {
                    Object operacionAnterior = operacion.getText();
                    operacion.setText(operacionAnterior + "*");
                    resultado=0;
                }
            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoOperacion = operacion.getText().toString().trim();
                if (textoOperacion.isEmpty()) {
                    operacion.setText("No se puede establecer el operador");
                }else {
                    Object operacionAnterior = operacion.getText();
                    operacion.setText(operacionAnterior + "/");
                    resultado=0;
                }
            }
        });

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoOperacion = operacion.getText().toString();

                double resultadoOperacion = 0;
                try {
                    Expression expr = new ExpressionBuilder(textoOperacion).build();
                    resultadoOperacion = expr.evaluate();
                    operacion.setText(Double.toString(resultadoOperacion));

                } catch (ArithmeticException | IllegalArgumentException e) {
                    e.printStackTrace();
                    operacion.setText("Error en la expresión matemática");
                }
                resultado = resultadoOperacion;
                mostrarOperacion = textoOperacion;
                mostrarResultado = String.valueOf(resultado);


            }
        });

        botonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            operacion.setText("");
            resultado = 0;
            }
        });

        botonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("resultados", Context.MODE_PRIVATE);

                // Recuperar el valor almacenado en SharedPreferences
                String resultadoGuardado = sharedPreferences.getString("resultado", "");

                // Verificar si hay un resultado guardado
                if (!resultadoGuardado.isEmpty()) {
                    // Mostrar el resultado guardado, por ejemplo, en un TextView
                    TextView textViewResultado = findViewById(R.id.operacion);
                    textViewResultado.setText("Resultado guardado: " + resultadoGuardado);
                } else {
                    // Mostrar un mensaje si no hay resultado guardado
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("No hay resultados guardados");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.show();
                }
            }
        });

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("resultados", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                RadioGroup radioGroup = findViewById(R.id.guardar);
                RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());

                if (radioButton != null && radioButton.getText().equals("Sí")) {
                    editor.putString("resultado", String.valueOf(resultado)); // Guardar el valor como String
                    editor.apply();
                } else {
                    // Muestra un mensaje de alerta si no se puede guardar
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("No se pueden guardar los cambios");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.show();
                }
            }
        });

        }
    }
