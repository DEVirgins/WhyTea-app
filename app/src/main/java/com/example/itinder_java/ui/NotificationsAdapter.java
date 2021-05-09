package com.example.itinder_java.ui;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itinder_java.Person;
import com.example.itinder_java.R;

import java.util.List;

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Person> items;

    public NotificationsAdapter(Context context, List<Person> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public NotificationsAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int type) {
        View v = inflater.inflate(R.layout.notification_pair, parent, false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(NotificationsAdapter.ViewHolder holder, int position){

        position = 2 * position;
        if(position < items.size()){
            Person item = items.get(position);
            holder.imageView.first.setImageResource(item.getImage());
            holder.nameView.first.setText(item.getName());
            holder.cityView.first.setText(item.getCity());
            position++;
            if (position < items.size()) {
                item = items.get(position);
                holder.imageView.second.setImageResource(item.getImage());
                holder.nameView.second.setText(item.getName());
                holder.cityView.second.setText(item.getCity());
                //onBindViewHolder(holder, position+1);
            }
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final Pair<ImageView, ImageView> imageView;
        final Pair<TextView, TextView> nameView;
        public Pair<TextView, TextView> cityView;

        ViewHolder(View v) {
            super(v);
            v.setPadding(7, 7, 7, 7);
            imageView = Pair.create((ImageView) v.findViewById(R.id.image1), (ImageView) v.findViewById(R.id.image2));
            nameView = Pair.create((TextView) v.findViewById(R.id.name1), (TextView) v.findViewById(R.id.name2));
            cityView = Pair.create((TextView) v.findViewById(R.id.city1), (TextView) v.findViewById(R.id.city2));
        }
    }
}
