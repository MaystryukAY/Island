package ru.javarush.maystryuk.island.models;

public abstract class Predator extends Animal {

    public Predator(AnimalKind animalKind, int x, int y) {
        super(animalKind, x, y);
    }


    @Override
    public void reproduce() {
    }

    @Override
    public void eat() {

    }

    @Override
    public void move(Animal animal, Island island) {

    }
}