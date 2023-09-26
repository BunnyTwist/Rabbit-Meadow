package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Fruit> fruitList = new ArrayList<>();

        Fruit strawberry = new Fruit("Strawberry", 10);
        Fruit apple = new Fruit("Apple", 5);
        Fruit watermelon = new Fruit("Watermelon", 2);
        Fruit blackberry = new Fruit("Blackberry", 16);
        fruitList.add(strawberry);
        fruitList.add(apple);
        fruitList.add(watermelon);
        fruitList.add(blackberry);

        for(Fruit fruitName : fruitList) {
            System.out.println(fruitName);
        }
    }
}