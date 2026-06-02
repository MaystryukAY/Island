package ru.javarush.maystryuk.island.services;

import ru.javarush.maystryuk.island.animals.TickCounters;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimulationEngine {
    LifeCycle lifeCycle;

    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(r -> {
        Thread thread = new Thread(r, "Поток запуска симуляции");
        return thread;
    });

    public void start () {
        System.out.println("Поток запущен");

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            try {
                TickCounters.reset();
                lifeCycle.runTuck();
                PrintStatistic.print();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 0, 0L, TimeUnit.MILLISECONDS);
    }

    public void stop() {

    }

}