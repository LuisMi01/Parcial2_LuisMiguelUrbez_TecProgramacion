package org.example;

import java.util.ArrayList;

public class User extends Menu{
    protected boolean alive;
    protected ArrayList<Ship> ships = new ArrayList<Ship>();
    int numeroBarcosIniciales;

    public User(boolean alive, ArrayList<Ship> ships, int numeroBarcosIniciales) {
        this.alive = alive;
        this.ships = ships;
        if(numeroBarcosIniciales > 0 && numeroBarcosIniciales < 4){
            this.numeroBarcosIniciales = numeroBarcosIniciales;
        }
    }
    public void attack(Point shot_point, User user){

    }




    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public int getNumeroBarcosIniciales() {
        return numeroBarcosIniciales;
    }

    public void setNumeroBarcosIniciales(int numeroBarcosIniciales) {
        this.numeroBarcosIniciales = numeroBarcosIniciales;
    }
}
