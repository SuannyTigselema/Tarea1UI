package android.studio.tarea1ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnEnviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, actBienvenido.class);
        String txtGenero="";
        RadioButton rbFem = (RadioButton) findViewById(R.id.rbFem);
        if(rbFem.isChecked())
            txtGenero="Femenino";

        RadioButton rbMas = (RadioButton) findViewById(R.id.rbMasc);
        if(rbMas.isChecked())
            txtGenero="Masculino";


        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtFechaN = (EditText)findViewById(R.id.txtFecha);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        //Creamos la informaci�n a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("GENERO", txtGenero);
        b.putString("FECHA", txtFechaN.getText().toString());
        b.putString("TELEFONO", txtTelefono.getText().toString());
        //A�adimos la informaci�n al intent
        intent.putExtras(b);

        //Iniciamos la nueva actividad
        if(validarVacio(txtNombre,txtGenero,txtFechaN,txtTelefono))
            startActivity(intent);
    }
    public boolean validarVacio(EditText nombre,String genero ,EditText fecha, EditText tel) {
        boolean band=true;
        if (nombre.getText().toString().isEmpty())
        {
            nombre.setError("No puede quedar vac�o");
            nombre.requestFocus();
            band=false;
        }
        if (genero=="")
        {
            Toast.makeText(this, "Seleccione un genero", Toast.LENGTH_SHORT).show();
            band=false;
        }
        if (fecha.getText().toString().isEmpty())
        {
            fecha.setError("No puede quedar vac�o");
            nombre.requestFocus();
            band=false;
        }
        if (tel.getText().toString().isEmpty())
        {
            tel.setError("No puede quedar vac�o");
            nombre.requestFocus();
            band=false;
        }
        return band;
    }


}
