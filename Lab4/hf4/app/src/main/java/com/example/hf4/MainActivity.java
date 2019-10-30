package com.example.hf4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"EUR","USD","GBP","AUD",
            "CAD","CHF","DKK","HUF" };

    String[] infoArray = {
            "Euro",
            "Dollar american",
            "Lira sterlina",
            "Dolar australian",
            "Dolar canadian",
            "Franc elvetian",
            "Corona daneza",
            "Forint maghiar"
    };

    Integer[] imageArray= {R.drawable.eur,
            R.drawable.usd,
            R.drawable.gbp,
            R.drawable.aud,
            R.drawable.cad,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.huf
    };
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);

    }



}
