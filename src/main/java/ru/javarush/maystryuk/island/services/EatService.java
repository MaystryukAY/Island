package ru.javarush.maystryuk.island.services;

import ru.javarush.maystryuk.island.animals.TickCounters;

public class EatService {
    EatTable eatTable;

    public void eat() {

        // 1. Проверка животного на сытость (foodKg)
        // 1. Определяем,кто пытается поесть
        // 2. Если травояденое - одно поведение (смотрим, есть ли трава на клетке)
        // 3. Получаем животных всех, если среди них есть еда для хищника - идем в eatTable
        // 4. На это животное мы кидаем рандом - то мы его съедаем
        // 5. Если мы его съедаем --foodKg, если едим ++foodKg

        TickCounters.eatenAnimals++;

    }
}