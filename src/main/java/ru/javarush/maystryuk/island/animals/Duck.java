package ru.javarush.maystryuk.island.animals;

import ru.javarush.maystryuk.island.models.AnimalKind;
import ru.javarush.maystryuk.island.models.Herbivore;

public class Duck extends Herbivore {
    public Duck(int x, int y) {
        super(AnimalKind.DUCK, x, y);
    }

    @Override
    public void eat() {
        // реализация логики для И травоядных И хищников
    }
}