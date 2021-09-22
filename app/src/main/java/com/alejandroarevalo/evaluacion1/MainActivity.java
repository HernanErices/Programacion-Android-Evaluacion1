package com.alejandroarevalo.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre, et_apellido, et_direccion;
    private RadioGroup radioGroup;
    private CheckBox cb_hogar, cb_trabajo, cb_urbano, cb_limite_urbano;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_nombre = (EditText) findViewById(R.id.txt_nombre);
        et_apellido = (EditText) findViewById(R.id.txt_apellidos);
        et_direccion = (EditText) findViewById(R.id.txt_direccion);
        nombre = "";

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        cb_hogar = (CheckBox) findViewById(R.id.cb_hogar);
        cb_trabajo = (CheckBox) findViewById(R.id.cb_trabajo);
        cb_urbano = (CheckBox) findViewById(R.id.cb_urbano);
        cb_limite_urbano = (CheckBox) findViewById(R.id.cb_limite_urbano);
    }
//Profesor no especifico que teniamos que realizar si era solo la
// interfaz grafica o interfaz y funcionamieto de la app pero dejo aqui vinculados los elemento
// con la interfaz grafica y el Toast

    public void ConfirmarPedido (View view){
        nombre = et_nombre.getText().toString();
        Toast.makeText(this, nombre + " , Pedido confirmado", Toast.LENGTH_LONG).show();
    }





    }