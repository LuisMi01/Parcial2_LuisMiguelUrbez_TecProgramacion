package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Point extends Ship{
    protected int x;
    protected int y;

    public Point(boolean alive, ArrayList<Ship> ships, int numeroBarcosIniciales, int size, CardinalPoints direction, int hits, boolean isSunk, int x, int y) {
        super(alive, ships, numeroBarcosIniciales, size, direction, hits, isSunk);
        this.x = x;
        this.y = y;
    }

    public void get_ship(Point point){
        if (point.getX() == x && point.getY() == y){
            hits++;
            System.out.println("Has acertado");
        }else {
            System.out.println("No has acertado");
        }
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}


