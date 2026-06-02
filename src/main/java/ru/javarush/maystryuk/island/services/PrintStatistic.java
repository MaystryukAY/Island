package ru.javarush.maystryuk.island.services;

import ru.javarush.maystryuk.island.animals.TickCounters;

public class PrintStatistic {
    public static void print () {
        System.out.println("Количество съеденных" + TickCounters.eatenAnimals);
    }
}