package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends Menu{
    protected boolean alive;
    protected ArrayList<Ship> ships = new ArrayList<Ship>();
    int numeroBarcosIniciales;
    Scanner teclado = new Scanner(System.in);

    int capacidad = 10;
    public int [][] tablero = new int[capacidad][capacidad];

    public void mostrarTablero(){
        for (int[] ints : tablero) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public User(boolean alive, ArrayList<Ship> ships, int numeroBarcosIniciales) {
        this.alive = alive;
        this.ships = ships;
        if(numeroBarcosIniciales > 0 && numeroBarcosIniciales < 4){
            this.numeroBarcosIniciales = numeroBarcosIniciales;
        }
    }



    public void attack(Point shot_point, User user){
        System.out.println("Vas a lanzar un ataque");
        System.out.println("Introduce la coordenada X");
        int x = teclado.nextInt();
        System.out.println("Introduce la coordenada Y");
        int y = teclado.nextInt();



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
