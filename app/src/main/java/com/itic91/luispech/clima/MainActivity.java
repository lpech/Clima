package com.itic91.luispech.clima;
// http://www.dcubica.com/didactica/?p=905

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

//Variables de la clase



public class MainActivity extends ActionBarActivity {

    private ArrayList<SecundaryMain> Items;
    private Adapter Adapter;
    private ListView listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se vincula el objeto ListView con el objeto del archivo XML
        listItems=(ListView)findViewById(R.id.listItems);
        //Se llama al metodo loadItems()
        loadItems();
    }

    //Metodo cargar Items
    private void loadItems(){
        Items=new ArrayList<SecundaryMain>(); //Creamos un objeto ArrayList de tipo SecundaryMain
        //Se agrega elementos al ArrayList
        Items.add(new SecundaryMain("Cancún", "25°C-28°C", this.getResources().getIdentifier("","drawable",this.getPackageName())));
        Items.add(new SecundaryMain("Cozumel", "33°C-35°C", this.getResources().getIdentifier("","drawable",this.getPackageName())));
        Items.add(new SecundaryMain("Chetumal", "16°C-19°C", this.getResources().getIdentifier("","drawable",this.getPackageName())));
        //Se crea un nuevo Adapter y se le pasa el ArrayList
        Adapter=new Adapter(this, Items);
        //Se desplega los elementos en el ListView
        listItems.setAdapter(Adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
