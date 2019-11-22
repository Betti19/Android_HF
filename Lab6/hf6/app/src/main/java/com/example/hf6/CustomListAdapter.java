package com.example.hf6;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

import static com.example.hf6.R.layout.listview_row;

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageArray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;


    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam, String[] cumparArray,String[] vindeArray){

        super(context, R.layout.listview_row, nameArrayParam);
        this.context=context;
        this.imageArray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;

    }


    public View getView(int position, final View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(listview_row, null, true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextViewID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoTextViewID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);


        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageArray[position]);


        return rowView;
    }
}