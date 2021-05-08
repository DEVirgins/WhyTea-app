package com.example.itinder_java.ui;

public class ItemModel {
    private int image;
    private String name, age;

    public ItemModel() {
    }

    public ItemModel(int image, String name, String age) {
        this.image = image;
        this.name = name;
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
