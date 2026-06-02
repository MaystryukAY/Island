package ru.javarush.maystryuk.island.animals;

import ru.javarush.maystryuk.island.models.AnimalKind;
import ru.javarush.maystryuk.island.models.Herbivore;

public class Rabbit extends Herbivore {
    public Rabbit(int x, int y) {
        super(AnimalKind.RABBIT, x, y);
    }
}