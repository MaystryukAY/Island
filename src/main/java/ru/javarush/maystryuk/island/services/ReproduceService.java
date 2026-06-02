package ru.javarush.maystryuk.island.services;

import ru.javarush.maystryuk.island.animals.TickCounters;
import ru.javarush.maystryuk.island.models.Animal;
import ru.javarush.maystryuk.island.models.Cell;

public class ReproduceService {
    public void reproduce (Animal animal, Cell cell) {
        // 1. Посмотреть сколько животных в клетке
        // 2. И если их больше 2-х - можем разможниться
        // можно кинуть рандом > 50 - размонажаемся
        // 3. AnimalsFactory.create

        TickCounters.bornAnimals++;
    }
}