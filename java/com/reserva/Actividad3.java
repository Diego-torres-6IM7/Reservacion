package com.reserva;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Actividad3 extends Activity {

    TextView muestraDatos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad3);

        muestraDatos = (TextView) findViewById(R.id.h);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        muestraDatos.setText(recibe.getString("h"));

    }




    public void irinicio(View l) {
        Intent envia3 = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia3);
    }

}
