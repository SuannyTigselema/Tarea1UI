package android.studio.tarea1ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class actBienvenido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_bienvenido);
        //Localizar los controles TextView
        TextView txtNombre = (TextView)findViewById(R.id.txtNombre);
        TextView txtGenero = (TextView)findViewById(R.id.txtGenero);
        TextView txtFecha = (TextView)findViewById(R.id.txtFechaN);
        TextView txtTelefono = (TextView)findViewById(R.id.txtTelefono);
        //Recuperamos la información pasada en el intentBundle
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        txtNombre.setText(bundle.getString("NOMBRE"));
        txtGenero.setText(bundle.getString("GENERO"));
        txtFecha.setText(bundle.getString("FECHA"));
        txtTelefono.setText(bundle.getString("TELEFONO"));
    }
}
