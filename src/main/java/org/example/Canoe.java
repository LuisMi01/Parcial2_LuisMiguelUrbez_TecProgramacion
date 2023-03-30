package org.example;

import java.util.ArrayList;

public class Canoe extends Ship{
    int length = 1;
    int width = 1;

    public Canoe(int size, CardinalPoints direction, int hits, boolean isSunk, int coordenadaX, int coordenadaY, int length, int width) {
        super(size, direction, hits, isSunk, coordenadaX, coordenadaY);
        this.length = length;
        this.width = width;
    }
}
