package ru.javarush.maystryuk.island.models;

public abstract class Animal {

    private final AnimalKind animalKind;

    private int x;
    private int y;

    // текущее насыщение
    private double foodKg;


    public AnimalKind getAnimalKind() {
        return animalKind;
    }

    protected Animal(AnimalKind animalKind, int x, int y) {
        this.animalKind = animalKind;
        this.x = x;
        this.y = y;
        this.foodKg = animalKind.foodForFull;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getFoodKg() {
        return foodKg;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void reproduce();
    public abstract void eat();
    public abstract void move(Animal animal, Island island);

    // можете сделать свою реализацию
    public void hungerTick () {

    }

    public boolean isDead () {
        return foodKg <= 0;
    }

}