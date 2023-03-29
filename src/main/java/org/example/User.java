package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    protected boolean alive;
    protected ArrayList<Ship> Barcos = new ArrayList<Ship>();
    int numeroBarcosIniciales;
    Scanner teclado = new Scanner(System.in);

    int filas, columnas;
    public int [][] tablero = new int[filas][columnas];

    public void crearTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 0;
            }
        }
    }
    public void mostrarTablero(){
        for (int[] ints : tablero) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public User(boolean alive, int numeroBarcosIniciales, int filas, int columnas) {
        this.alive = alive;
        this.numeroBarcosIniciales = numeroBarcosIniciales;
        this.filas = filas;
        this.columnas = columnas;
    }

    public void attack(Point shot_point, User user) {
        System.out.println("Vas a lanzar un ataque");
        System.out.println("Introduce la coordenada X");
        int x = teclado.nextInt();
        if (x > columnas || x < 0) {
            System.out.println("Introduce una coordenada X valida");
            attack(shot_point, user);
        }
        System.out.println("Introduce la coordenada Y");
        int y = teclado.nextInt();
        if (y > filas || y < 0) {
            System.out.println("Introduce una coordenada Y valida");
            attack(shot_point, user);
        }
        shot_point.setX(x);
        shot_point.setY(y);

        for (int i = filas; i < tablero.length; i++) {
            for (columnas = 0; columnas < tablero.length; columnas++) {
                if (tablero[i][columnas] == 1 ) {
                    System.out.println("Tocado");
                } else {
                    System.out.println("Has fallado");
                }
            }
        }

    }




    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }





    public int getNumeroBarcosIniciales() {
        return numeroBarcosIniciales;
    }

    public void setNumeroBarcosIniciales(int numeroBarcosIniciales) {
        this.numeroBarcosIniciales = numeroBarcosIniciales;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
}
