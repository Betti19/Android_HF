package com.example.hf4;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.TimeoutException;

import static android.widget.AdapterView.*;


public class CustomListAdapter<listview, listviewid> extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageArray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;
    private final String[] cumparArray;
    private final String[] vindeArray;

    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam, String[] cumparArray,String[] vindeArray){

        super(context, R.layout.listview_row, nameArrayParam);
        this.context=context;
        this.imageArray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
        this.cumparArray=cumparArray;
        this.vindeArray=vindeArray;

    }

    public View getView(int position, final View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextViewID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoTextViewID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);
        final TextView cumparid = (TextView) rowView.findViewById(R.id.cumparid);
        final TextView vindeid = (TextView) rowView.findViewById(R.id.vindeid);
        final TextView textView2 = (TextView) rowView.findViewById(R.id.textView2);
        final TextView textView3 = (TextView) rowView.findViewById(R.id.textView3);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageArray[position]);
        cumparid.setText(cumparArray[position]);
        vindeid.setText(vindeArray[position]);


        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cumparid.getVisibility()==View.INVISIBLE && vindeid.getVisibility()==View.INVISIBLE && textView2.getVisibility()==View.INVISIBLE && textView3.getVisibility()==View.INVISIBLE) {
                    cumparid.setVisibility(View.VISIBLE);
                    vindeid.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                }
                else{
                    cumparid.setVisibility(View.INVISIBLE);
                    vindeid.setVisibility(View.INVISIBLE);
                    textView2.setVisibility(View.INVISIBLE);
                    textView3.setVisibility(View.INVISIBLE);
                }
            }
        });

        return rowView;

    }



}
