package ru.javarush.maystryuk.island.animals;

import ru.javarush.maystryuk.island.models.Animal;
import ru.javarush.maystryuk.island.models.AnimalKind;

public class AnimalFactory {
    private AnimalFactory() {
    }

    public static Animal create(AnimalKind animalKind, int x, int y) {
        switch (animalKind) {
            case WOLF:
                return new Wolf(x, y);
            case RABBIT:
                return new Rabbit(x, y);
            case DUCK:
                return new Duck(x, y);
            default:
                System.out.println("Данный тип животных не добавлен в конфигурацию");
                return null;
        }
    }
}