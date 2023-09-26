package org.example;

public class Grass implements Edible{

    private int patchesOfGrass;

    //Getter
    public int getPatchesOfGrass() {
        return this.patchesOfGrass;
    }

    //Constructor
    public Grass (int patchesOfGrass) {
        this.patchesOfGrass = patchesOfGrass;
    }

    public void eat(int piecesEaten) {
        if (piecesEaten <= this.patchesOfGrass) {
            System.out.println("Ate " + piecesEaten + " patches of grass.");
            this.patchesOfGrass -= piecesEaten;
        }
        else {
            System.out.println("ate all the grass!! There were " + this.patchesOfGrass + " that you ate.");
            this.patchesOfGrass = 0;
        }
    }
    public void replenish(int piecesAdded) {
        this.patchesOfGrass += piecesAdded;
    }
}
