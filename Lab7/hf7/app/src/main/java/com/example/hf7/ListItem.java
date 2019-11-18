package com.example.hf7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListItem implements Serializable {
    private String mName;
    private int mImage;
    private String mInfo;

    public ListItem(String name, int image, String info) {
        this.mName = name;
        this.mImage = image;
        this.mInfo = info;
    }

    public String getName() {
        return mName;
    }

    public int getImage(){
        return mImage;
    }

    public String getInfo() {
        return mInfo;
    }

    public static List<ListItem> getListItems() {
        List<ListItem> listaelemek = new ArrayList<>();
        listaelemek.add(new ListItem("Octopus",R.drawable.octopus,"8 tentacled monster"));
        listaelemek.add(new ListItem("Pig",R.drawable.disznyo,"Delicious in rolls"));
        listaelemek.add(new ListItem("Sheep",R.drawable.sheep,"Great for jumpers"));
        listaelemek.add(new ListItem("Rabbit",R.drawable.rabbit,"Nice in a stew"));
        listaelemek.add(new ListItem("Spider",R.drawable.horse,"Scary"));
        listaelemek.add(new ListItem("Sheep",R.drawable.octopus3,"Great for jumpers"));
        listaelemek.add(new ListItem("Sheep",R.drawable.sheep,"Great for jumpers"));
        listaelemek.add(new ListItem("Sheep",R.drawable.sheep,"Great for jumpers"));
        listaelemek.add(new ListItem("Sheep",R.drawable.sheep,"Great for jumpers"));
        listaelemek.add(new ListItem("Sheep",R.drawable.sheep,"Great for jumpers"));


        return listaelemek;
    }

}
