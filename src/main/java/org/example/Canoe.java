package org.example;

import java.util.ArrayList;

public class Canoe extends Ship{
    int length = 1;
    int width = 1;

    public Canoe(boolean alive, ArrayList<Ship> ships, int numeroBarcosIniciales, int size, CardinalPoints direction, int hits, boolean isSunk, int length, int width) {
        super(alive, ships, numeroBarcosIniciales, size, direction, hits, isSunk);
        this.length = length;
        this.width = width;
    }
}
