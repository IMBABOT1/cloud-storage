package com.imbabot.cloud_storage.client;

import java.io.Serializable;

public class Cat implements Serializable {

    private String name;
    public int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
       return String.format("Cat [%s %d]", name, age);
    }
}
