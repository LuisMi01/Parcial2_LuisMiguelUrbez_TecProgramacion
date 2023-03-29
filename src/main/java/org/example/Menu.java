package org.example;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Ship barco1 = new Ship();

    public void menu(){
        System.out.println("BIENVENIDO AL JUEGO BATTLESHIP");
        Scanner teclado = new Scanner(System.in);
        System.out.println("""
                Ambos jugadores van a empezar con 3 barcos,
                 cada uno posicionara un tipo de barco en la casilla y direccion que elija
                """);
        System.out.println("Configuracion para el primer jugador:");
        System.out.println("Nombre para el primer jugador:");
        String nombre1 = teclado.nextLine();
        System.out.println();
    }
}
