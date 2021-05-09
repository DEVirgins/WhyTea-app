package com.example.itinder_java.ui.notifications;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.itinder_java.R;
import com.example.itinder_java.Person;
import com.example.itinder_java.ui.NotificationsAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotificationsFragment extends Fragment {
    public List<Person> items = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        RecyclerView list = (RecyclerView) root.findViewById(R.id.list);
        setData();
        NotificationsAdapter adapter = new NotificationsAdapter(getContext(), items);
        list.setAdapter(adapter);
        return root;
    }
    private void setData(){
        items.add(new Person(R.drawable.fahri, "Фахри", "Санкт-Петербург", "InfoLab",Arrays.asList("frontend", "react")));
        items.add(new Person(R.drawable.irina, "Ирина", "Санкт-Петербург", "InfoLab", Arrays.asList("design", "ML")));
        items.add(new Person(R.drawable.matvei, "Матвей","Санкт-Петербург", "InfoLab", Arrays.asList("frontend", "backend")));

    }

}