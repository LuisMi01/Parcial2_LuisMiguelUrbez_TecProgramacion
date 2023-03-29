package org.example;

public class Point extends Ship{
    protected int x;
    protected int y;

    public Point(int size, CardinalPoints direction, int hits, int xInicio, int yInicio, int xFinal, int yFinal, boolean isSunk, int x, int y) {
        super(size, direction, hits, xInicio, yInicio, xFinal, yFinal, isSunk);
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
