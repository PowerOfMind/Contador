package com.jjbarriga.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button suma;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();

    }

    public void instancias(){
        suma = this.findViewById(R.id.suma);
        resultado = this.findViewById(R.id.resultado);
    }

    public void acciones(){
        suma.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.suma:
                // resultado++;
                /*Toast.makeText(getApplicationContext(),"Pulsado boton1", Toast.LENGTH_SHORT).show();
                etiqueta.setText("boton1 pulsado");*/
                break;
        }
    }
}
