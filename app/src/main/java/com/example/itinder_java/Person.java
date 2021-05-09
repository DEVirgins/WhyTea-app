package com.example.itinder_java;

import java.util.List;

public class Person {
    private int image;
    private String name, age, city, work_place;

    private String email;
    private List<String> skills;

    public Person() {
    }

    public Person(int image, String name, String city, String work_place, List<String> skills) {
        this.image = image;
        this.name = name;
        this.city = city;
        this.work_place = work_place;
        this.skills = skills;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getWork_place() {
        return work_place;
    }

    public List<String> getSkills() {
        return skills;
    }
}
