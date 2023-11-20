package infoii.dpr20.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button boton1;
    private Button boton2;

    private TextView texto;
    private int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.boton);
        boton2 = (Button) findViewById(R.id.pulsador);
        texto = (TextView) findViewById(R.id.text_cont);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            contador++;
            texto.setText("CONTADOR= "+contador);
            }


        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
                texto.setText("CONTADOR= "+contador);
            }


        });
    }

}
