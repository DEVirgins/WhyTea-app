package com.example.itinder_java;

import java.util.List;

import androidx.recyclerview.widget.DiffUtil;

import com.example.itinder_java.ui.ItemModel;

public class CardStackCallback extends DiffUtil.Callback {

    private List<ItemModel> old, stack;

    public CardStackCallback(List<ItemModel> old, List<ItemModel> stack) {
        this.old = old;
        this.stack = stack;
    }

    @Override
    public int getOldListSize() {
        return old.size();
    }

    @Override
    public int getNewListSize() {
        return stack.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return old.get(oldItemPosition).getImage() == stack.get(newItemPosition).getImage();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return old.get(oldItemPosition) == stack.get(newItemPosition);
    }
}