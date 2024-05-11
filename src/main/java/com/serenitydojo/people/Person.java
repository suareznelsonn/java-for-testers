package com.serenitydojo.people;

public class Person {
    public enum Gender {MALE, FEMALE}

    String name;
    Gender gender;

    int age;
    String favouriteColor;

    public Person(String name, Gender gender, int age, String favouriteColor) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.favouriteColor = favouriteColor;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    @Override
    public String toString (){
        return name;
    }
}
