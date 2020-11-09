package com.example.prtica03;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String MainMenu [] = new String [] {"Minha casa na cidade natal", "Minha casa em Viçosa", "Meu departamento", "Fechar aplicação"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MainMenu);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        Intent it = new Intent(getBaseContext(),SegundaActivity.class);
        String aux = l.getItemAtPosition(position).toString();

        switch(position){
            case 0:
                Toast.makeText(getBaseContext(), aux, Toast.LENGTH_SHORT).show();
                it.putExtra("latitude", -21.9811);
                it.putExtra("longitude", -42.3682);
                startActivity(it);
                break;
            case 1:
                Toast.makeText(getBaseContext(), aux, Toast.LENGTH_SHORT).show();
                it.putExtra("latitude", -20.752946);
                it.putExtra("longitude", -42.879097);
                startActivity(it);
                break;
            case 2:
                Toast.makeText(getBaseContext(), aux, Toast.LENGTH_SHORT).show();
                it.putExtra("latitude", -20.7676);
                it.putExtra("longitude", -42.8588);
                startActivity(it);
                break;
            case 3:
                finish();
        }
    }
}