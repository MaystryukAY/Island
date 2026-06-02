package ru.javarush.maystryuk.island.models;

public class Island {
    private final int width;

    private final int height;

    private final Cell[][] cells;

    public Island(int width, int height, Cell[][] cells) {
        this.width = width;
        this.height = height;
        this.cells = new Cell[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                cells[width][height] = new Cell(i, j);
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }


    public synchronized boolean relocate(Animal animal, int x, int y) {
        // 1. Проверяем, находимся ли мы внтури нашего острова. От текущей позиции
        // 2. Проверка на количество видов данного животного на клетке. Вызов tryAdd
        // 3. Удалить животное со старой клетки (В случае успеха передвижения)

        return true;
    }

}