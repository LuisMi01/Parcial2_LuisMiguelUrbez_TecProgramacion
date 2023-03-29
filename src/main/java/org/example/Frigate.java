package org.example;

import java.util.ArrayList;

public class Frigate extends Ship {

    int length = 3;
    int width = 1;

    public Frigate(boolean alive, ArrayList<Ship> ships, int numeroBarcosIniciales, int size, CardinalPoints direction, int hits, boolean isSunk, int length, int width) {
        super(alive, ships, numeroBarcosIniciales, size, direction, hits, isSunk);
        this.length = length;
        this.width = width;
    }
}
