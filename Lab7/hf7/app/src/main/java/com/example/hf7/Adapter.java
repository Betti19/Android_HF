package com.example.hf7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.VH> {
    private Activity mContext;
    private List<ListItem> mListItems;

    public Adapter(Activity context, List<ListItem> listaelemek) {
        mContext=context;
        if(listaelemek == null) {
            throw  new IllegalArgumentException("listaelemek must not be null");
        }
        mListItems=listaelemek;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listaelem,parent,false);
        return new VH(itemView,mContext);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        ListItem listItem = mListItems.get(position);
        holder.rootView.setTag(listItem);
        holder.tvName.setText(listItem.getName());
        holder.tvInfo.setText(listItem.getInfo());
        holder.imageView.setImageResource(listItem.getImage());


    }

    @Override
    public int getItemCount() {
        return mListItems.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        final View rootView;
        final ImageView imageView;
        final TextView tvName;
        final TextView tvInfo;

        public VH(View itemView, final Context context) {
            super(itemView);
            rootView = itemView;
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvInfo = (TextView) itemView.findViewById(R.id.tvInfo);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final ListItem listItem = (ListItem) v.getTag();
                }
            });
        }
    }
}
