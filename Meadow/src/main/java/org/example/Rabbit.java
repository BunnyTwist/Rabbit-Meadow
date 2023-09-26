package org.example;

public class Rabbit {

    private String name;
    private int age;
    private String breed;
    private String favoriteFruit;

    //Getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getBreed() {
        return this.breed;
    }
    public String getFavoriteFruit() {
        return this.favoriteFruit;
    }

    //Constructor
    public Rabbit (String name, int age, String breed, String favoriteFruit) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.favoriteFruit = favoriteFruit;
    }

    //TODO add methods, create subclass rabbits
}
