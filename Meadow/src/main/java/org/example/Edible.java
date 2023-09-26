package org.example;

public interface Edible {

    //Parameters are generic since both grass and fruit can be eaten
    public void eat(int piecesEaten);
    public void replenish(int piecesAdded);
}
