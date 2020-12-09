package com.company;

public class Grandmother {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Grandmother(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "age=" + age +
                        ", name='" + name + '\'';
    }
}
