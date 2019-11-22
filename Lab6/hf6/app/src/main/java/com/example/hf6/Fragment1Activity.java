package com.example.hf6;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class Fragment1Activity extends Fragment {

    protected static final String FRAG2 = "2";

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Context c = getActivity().getApplicationContext();
        View vw = inflater.inflate(R.layout.fragment1,container,false);

         CustomListAdapter valami = new CustomListAdapter(this,getResources(),this,nameArray,infoArray,imageArray);
         ListView listView = (ListView) vw.findViewById(R.id.frlsv);
         listView.setAdapter(valami);

         final FragmentManager fragmentManager=getFragmentManager();
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
             @Override
             public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                 if (fragmentManager.findFragmentByTag(FRAG2) != null) {
                     TextView selectedOpt = (TextView) getActivity().findViewById(R.id.selectedopt);
                     selectedOpt.setText("You have selected " + ((TextView) v).getText().toString());
                 } else {
                     Intent intent = new Intent(getActivity().getApplicationContext(), ShowItemActivity.class);
                     intent.putExtra("item", ((TextView) v).getText().toString());
                     startActivity(intent);
                 }
             }
             });
            return vw;
    }

}
