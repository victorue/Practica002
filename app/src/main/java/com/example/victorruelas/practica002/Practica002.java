package com.example.victorruelas.practica002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Practica002 extends AppCompatActivity {

    EditText num1;
    EditText num2;

    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica002);

        num1= (EditText)findViewById(R.id.txtnum1);
        num2= (EditText) findViewById(R.id.txtnum2);
        res=(TextView) findViewById(R.id.textView2);


    }

    public void suma (View v){
        //float numero1 = Float.parseFloat(num1.getText().toString());
        float n1 = Float.parseFloat(num1.getText().toString());
        //float numero2 = Float.parseFloat(num2.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
       //float resultado = numero1 + numero2;
        res.setText(""+(n1+n2));

    }

       public void resta (View v){

        float numero1=Float.parseFloat(num1.getText().toString());
        float numero2=Float.parseFloat(num2.getText().toString());

        float resultado=numero1-numero2;
           res.setText(""+(numero1-numero2));

    }


    public void multiplicacion (View v){

        float numero1=Float.parseFloat(num1.getText().toString());
        float numero2=Float.parseFloat(num2.getText().toString());

        float resultado=numero1*numero2;
        res.setText(""+(numero1 * numero2));

    }


    public void division (View v){

        float numero1=Float.parseFloat(num1.getText().toString());
        float numero2=Float.parseFloat(num2.getText().toString());

        float resultado=numero1/numero2;
        res.setText(""+(numero1/numero2));

    }

}
