package com.example.itinder_java.ui.notifications;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.itinder_java.R;
import com.example.itinder_java.ui.Person;
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
        items.add(new Person(R.drawable.photo1, "Агата1", "Moscow", "Lucsoft", Arrays.asList("desin", "python", "PM")));
        items.add(new Person(R.drawable.photo1, "Агата2", "Moscow", "Lucsoft",Arrays.asList("desin", "python", "PM")));
        items.add(new Person(R.drawable.photo1, "Агата3", "Moscow", "Lucsoft", Arrays.asList("desin", "python", "PM")));
        items.add(new Person(R.drawable.photo1, "Агата4","Moscow", "Lucsoft", Arrays.asList("desin", "python", "PM")));
        items.add(new Person(R.drawable.photo1, "Агата5", "Moscow", "Lucsoft",Arrays.asList("desin", "python", "PM")));
        items.add(new Person(R.drawable.photo1, "Агата6", "Moscow", "Lucsoft",Arrays.asList("desin", "python", "PM")));
        items.add(new Person(R.drawable.photo1, "Агата7", "Moscow", "Lucsoft", Arrays.asList("desin", "python", "PM")));

    }

}