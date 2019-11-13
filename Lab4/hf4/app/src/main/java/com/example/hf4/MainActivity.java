package com.example.hf4;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

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

    String[] cumparArray={
            "4.6809",
            "4.2350",
            "5.4440",
            "2.9072",
            "3.2054",
            "4.2851",
            "0.6259",
            "1.3968"
    };
    String[] vindeArray={
            "4.8330",
            "4.4020",
            "5.6490",
            "3.0144",
            "3.3235",
            "4.4431",
            "0.6490",
            "1.4483"
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

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, infoArray, imageArray, cumparArray,vindeArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);



    }
}
