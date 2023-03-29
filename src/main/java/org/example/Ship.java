package org.example;

import java.util.Scanner;

public class Ship extends User{
    Scanner teclado = new Scanner(System.in);

    //Atributos de la clase:
    protected int size;
    protected CardinalPoints direction;
    protected int hits;
    protected int xInicio;
    protected int yInicio;
    protected int xFinal;
    protected int yFinal;
    protected boolean isSunk;

    //Métodos de la clase:
    public Ship(int size, CardinalPoints direction, int hits, int xInicio, int yInicio, int xFinal, int yFinal, boolean isSunk) {
        this.size = size;
        this.direction = direction;
        this.hits = hits;
        this.xInicio = xInicio;
        this.yInicio = yInicio;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
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

    public int getxInicio() {
        return xInicio;
    }

    public void setxInicio(int xInicio) {
        this.xInicio = xInicio;
    }

    public int getyInicio() {
        return yInicio;
    }

    public void setyInicio(int yInicio) {
        this.yInicio = yInicio;
    }

    public int getxFinal() {
        return xFinal;
    }

    public void setxFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public int getyFinal() {
        return yFinal;
    }

    public void setyFinal(int yFinal) {
        this.yFinal = yFinal;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        isSunk = sunk;
    }
}
