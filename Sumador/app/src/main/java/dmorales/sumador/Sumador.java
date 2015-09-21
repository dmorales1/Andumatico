package dmorales.sumador;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Sumador extends ActionBarActivity {

    EditText ET_num1, ET_num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumador);

        /*Se hace referencia a las cajas de texto correspondientes en las vistas */
        ET_num1 = (EditText) findViewById(R.id.ET_num1);
        ET_num2 = (EditText) findViewById(R.id.ET_num2);

    }

    public void sumarOnClick(View v) throws NumberFormatException {
        try{
            if (ET_num1.getText()!= null && ET_num2.getText()!=null){
                int num1;
                num1 = Integer.valueOf(ET_num1.getText().toString());
                int num2;
                num2 = Integer.valueOf(ET_num2.getText().toString());
                Intent i = new Intent(this, Sumar.class);
                i.putExtra("num1", num1);
                i.putExtra("num2", num2);
                startActivity(i);
            } else {
                Toast.makeText(this,"Debe ingresar números en ambas cajas de texto",Toast.LENGTH_LONG).show();
            }
        }catch (Exception ex){
            Toast.makeText(this,"Debe ingresar números en ambas cajas de texto",Toast.LENGTH_LONG).show();
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sumador, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this,"Creado por David Morales",Toast.LENGTH_LONG).show();
        }
        if (id == R.id.action_limpiar){
            ET_num1.setText("");
            ET_num2.setText("");
        }
        if (id == R.id.action_salir){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
