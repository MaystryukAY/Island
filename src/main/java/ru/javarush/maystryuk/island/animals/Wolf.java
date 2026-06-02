package ru.javarush.maystryuk.island.animals;

import ru.javarush.maystryuk.island.models.AnimalKind;
import ru.javarush.maystryuk.island.models.Predator;

public class Wolf extends Predator {
    public Wolf(int x, int y) {
        super(AnimalKind.WOLF, x, y);
    }
}