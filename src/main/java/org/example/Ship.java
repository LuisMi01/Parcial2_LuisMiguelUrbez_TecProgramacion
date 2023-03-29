package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ship extends User{
    Scanner teclado = new Scanner(System.in);

    //Atributos de la clase:
    protected int size;
    protected CardinalPoints direction;
    protected int hits;
    protected boolean isSunk;

    //Métodos de la clase:


    public Ship(boolean alive, ArrayList<Ship> ships, int numeroBarcosIniciales, int size, CardinalPoints direction, int hits, boolean isSunk) {
        super(alive, ships, numeroBarcosIniciales);
        this.size = size;
        this.direction = direction;
        this.hits = hits;
        this.isSunk = isSunk;
    }
    

    public void is_sunk(){
        if (hits == size){
            isSunk = true;
            System.out.println("El barco esta hundido");
        }
    }

    public void get_shot(){

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CardinalPoints getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoints direction) {
        this.direction = direction;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        isSunk = sunk;
    }
}
