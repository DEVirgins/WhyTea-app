package com.example.itinder_java.ui.account;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.itinder_java.R;
import com.example.itinder_java.Person;

import java.util.Arrays;

public class AccountFragment extends Fragment {

    private AccountViewModel viewModel;
    private Person acc = new Person(R.drawable.agatha, "Агата", "Москва", "InfoLab", Arrays.asList("design", "python", "PM"));
    //по хорошему можно симпортировать по ID из базы данных

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        viewModel =
                ViewModelProviders.of(this).get(AccountViewModel.class);
        View root = inflater.inflate(R.layout.fragment_account, container, false);
        /*viewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        final ImageView imageView = root.findViewById(R.id.acc_image);
        imageView.setImageResource(acc.getImage());

        final TextView name = root.findViewById(R.id.acc_name);
        name.setText(acc.getName());

        final TextView workPlace = root.findViewById(R.id.acc_work_place);
        workPlace.setText(acc.getWork_place());


        return root;
    }
}