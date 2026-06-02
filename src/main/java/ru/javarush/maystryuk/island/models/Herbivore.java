package ru.javarush.maystryuk.island.models;

import ru.javarush.maystryuk.island.services.MoveService;

public abstract class Herbivore extends Animal {
    MoveService moveService = new MoveService();
    public Herbivore(AnimalKind animalKind, int x, int y) {
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
        moveService.move(animal, island);
    }
}