package ru.javarush.maystryuk.island.services;

import ru.javarush.maystryuk.island.models.Island;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LifeCycle {
    private final Island island;

    private final ExecutorService executorService;


    // продумать выращивание травы с каждым тактом
    private final int grass;

    public LifeCycle(Island island, int fixedThreadPool, int grass) {
        this.island = island;
        this.executorService = Executors.newFixedThreadPool(fixedThreadPool, r -> {
            Thread thread = new Thread("island-thread");
            return thread;
        });
        this.grass = grass;
    }

    public void runTuck () throws InterruptedException {
        runReproduce();
        runEat();
        runMove();
        phaseStarve();

    }

    private void runReproduce () throws InterruptedException {
        List<Callable<Void>> tasks = new ArrayList<>();
        for (int i = 0; i < island.getWidth(); i++) {
            for (int j = 0; j < island.getHeight(); j++) {
                int x = j;
//                tasks.add(());
            }
        }
        executorService.invokeAll(tasks);
    }

    private void runEat () {

    }

    private void runMove () {

    }

    private void phaseStarve () {
        // 1. Проверка голода животного
        // 2. Если животное голодное - убираем с текущей клетки
    }

    // Необоходим остановить executorService
}