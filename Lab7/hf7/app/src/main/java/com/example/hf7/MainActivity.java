package com.example.hf7;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter mAdapter;
    private List<ListItem> listitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.rvid);
        recyclerView.setHasFixedSize(true);
        final GridLayoutManager layout = new GridLayoutManager(MainActivity.this, 1);
        recyclerView.setLayoutManager(layout);
        listitems=ListItem.getListItems();
        mAdapter=new Adapter(MainActivity.this,listitems);
        recyclerView.setAdapter(mAdapter);
    }

}

