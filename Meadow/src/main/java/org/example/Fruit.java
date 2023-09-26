package org.example;

public class Fruit implements Edible {

    private String fruitType; //Apples, Strawberries, Watermelon, Blackberry
    private int fruitAmount;

    //Getters

    public String getFruitType() {
        return this.fruitType;
    }
    public int getFruitAmount() {
        return this.fruitAmount;
    }

    //Constructor
    public Fruit(String fruitType, int fruitAmount) {
        this.fruitType = fruitType;
        this.fruitAmount = fruitAmount;
    }

    @Override
    public void eat(int piecesEaten) {
        if (piecesEaten < this.fruitAmount) {
            this.fruitAmount -= piecesEaten;
            System.out.println("Ate " + piecesEaten + " pieces of fruit.");
        }
        else {
            System.out.println("Only ate " + this.fruitAmount + " pieces, and there is none left.");
            this.fruitAmount = 0;
        }
    }
    @Override
    public void replenish(int piecesAdded){
        this.fruitAmount += piecesAdded;
    }

    //TODO: add a way to determine if plural, and fruit specific plurality
    @Override
    public String toString() {
        return "There are " + this.fruitAmount + " " + this.fruitType + "s in the meadow.";
    }
}
