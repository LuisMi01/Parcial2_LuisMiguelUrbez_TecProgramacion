package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ship {
    Scanner teclado = new Scanner(System.in);

    //Atributos de la clase:
    protected int size;
    protected CardinalPoints direction;
    protected int hits;
    protected boolean isSunk;
    protected int coordenadaX;
    protected int coordenadaY;


    //Métodos de la clase:


    public Ship(int size, CardinalPoints direction, int hits, boolean isSunk, int coordenadaX, int coordenadaY) {
        this.size = size;
        this.direction = direction;
        this.hits = hits;
        this.isSunk = isSunk;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void is_sunk(){
        if (hits == size){
            isSunk = true;
            System.out.println("El barco esta hundido");
        }
    }

    public void get_shot(){
        hits++;
        System.out.println("El barco ha recibido un disparo");
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

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}
