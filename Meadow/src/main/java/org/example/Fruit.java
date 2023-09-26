<<<<<<< HEAD
package org.example;

public class Fruit {

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

    public void eat(int fruitPiecesEaten) {

        if (fruitPiecesEaten < this.fruitAmount) {
            this.fruitAmount -= fruitPiecesEaten;
            System.out.println("Ate " + this.fruitAmount + " pieces of fruit.");
        }
        else {
            this.fruitAmount = 0;
            System.out.println("Only ate " + this.fruitAmount + " pieces, and there is none left.");
        }
    }

    public void replenishFruit(int fruitAdded){
        this.fruitAmount += fruitAdded;
    }

    //TODO: add a way to determine if plural, and fruit specific plurality
    @Override
    public String toString() {
        return "There are " + this.fruitAmount + " " + this.fruitType + "s in the meadow.";
    }
}
=======
package org.example;

public class Fruit {

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

    public void eat(int fruitPiecesEaten) {

        if (fruitPiecesEaten < this.fruitAmount) {
            this.fruitAmount -= fruitPiecesEaten;
            System.out.println("Ate " + this.fruitAmount + " pieces of fruit.");
        }
        else {
            this.fruitAmount = 0;
            System.out.println("Only ate " + this.fruitAmount + " pieces, and there is none left.");
        }
    }

    public void replenishFruit(int fruitAdded){
        this.fruitAmount += fruitAdded;
    }

    //TODO: add a way to determine if plural, and fruit specific plurality
    @Override
    public String toString() {
        return "There are " + this.fruitAmount + " " + this.fruitType + "s in the meadow.";
    }
}
>>>>>>> 04a46bb24cd3adbbee705faf43ae08b1601463ed
