package dmorales.sumador;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class Sumar extends ActionBarActivity {

    TextView tv_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);

        Bundle b = this.getIntent().getExtras();
        if (b!=null){
            int num1 = b.getInt("num1");
            int num2 = b.getInt("num2");
            int suma = num1 + num2;
            tv_resultado = (TextView) findViewById(R.id.ET_Resultado);
            tv_resultado.setText(String.valueOf(suma));

        }
    }

    public void VolverOnClick(View v){
       // super.onBackPressed();
        finish();
    }
}
