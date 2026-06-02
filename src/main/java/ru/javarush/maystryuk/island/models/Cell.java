package ru.javarush.maystryuk.island.models;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    int x;
    int y;
    int grass = 5;
    List<Animal> animals = new ArrayList<>();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getGrass() {
        return grass;
    }

    // продумать для многопоточки, что лучше возвращать
    public List<Animal> getAnimals() {
        return animals;
    }

    public boolean tryAdd (Animal animal) {
        if (isFullForKind(animal)) {
            return false;
        }

        animals.add(animal);
        animal.setPosition(x, y);
        return true;
    }

    private boolean isFullForKind (Animal animal) {
        int howMany = 0;

        for (Animal animalForIt : animals) {
            if (animalForIt.getAnimalKind() == animal.getAnimalKind()) {
                howMany++;
            }
        }

        return howMany > animal.getAnimalKind().maxAnimals;
    }
}