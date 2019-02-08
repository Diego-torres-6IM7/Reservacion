package com.reserva;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends Activity {

	String nombre = "", fecha = "", hora = "", thabitacion = "", dalberca = "", h = "hola";
	int personas = 0;
	int niños = 0;
	int habitacion = 0;
	int alberca = 0;
	TextView muestraDatos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actividad2);

		muestraDatos = (TextView) findViewById(R.id.muestraDatos);

		Bundle recibe = new Bundle();
		recibe = this.getIntent().getExtras();

		nombre = recibe.getString("nombre");
		personas = recibe.getInt("personas");
		niños = recibe.getInt("niños");
		habitacion = recibe.getInt("habitacion");
		fecha = recibe.getString("fecha");
		hora = recibe.getString("hora");

		if(habitacion==1){
			thabitacion = "Junior";
		}else{
			if(habitacion==2){
				thabitacion = "Suit";
			}else{
				thabitacion = "Suit Presidencial";
			}
		}

		if (alberca == 1){
			dalberca = "Si";
		}else{
			dalberca = "No";
		}

		muestraDatos.setText("Reservacion a nombre de:\n" + nombre + "\n" + personas
				+ " personas\n"+niños+" niños\nTipo de Habitación:"+thabitacion+"\nAlberca:"+dalberca+"\nFecha: " + fecha + "\nHora: " + hora + "\n");

	}

	public void extra(View j) {
		Intent envia2 = new Intent(this, Actividad3.class);
		Bundle datos = new Bundle();
		datos.putString("h",h);
		envia2.putExtras(datos);
		finish();
		startActivity(envia2);
	}

}
