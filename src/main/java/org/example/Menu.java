package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    User jugador1 = new User(true, 3, 1, 1);

    User jugador2 = new User(true, 3, 1, 1);
    public void menu(){
        System.out.println("BIENVENIDO AL JUEGO BATTLESHIP");
        Scanner teclado = new Scanner(System.in);
        System.out.println("""
                Ambos jugadores van a empezar con 3 barcos,
                 cada uno posicionara un tipo de barco en la casilla y direccion que elija
                """);
        System.out.println("Elijan el tamaño del tablero");
        int capacidad = teclado.nextInt();
        jugador1.setFilas(capacidad);
        jugador1.setColumnas(capacidad);
        jugador2.setFilas(capacidad);
        jugador2.setColumnas(capacidad);

        jugador1.crearTablero();
        jugador2.crearTablero();

        System.out.println("Configuracion para el primer jugador:");
        selectorBarcos();

        System.out.println("Configuracion para el segundo jugador:");
        selectorBarcos();

        jugador1.mostrarTablero();
        jugador2.mostrarTablero();
    }


    public void selectorBarcos(){
        System.out.println("Elija el tipo de barco que quiere colocar");
        boolean terminar = false;
        do {
            int opcion;
            System.out.println("1. Portaaviones (5 casillas)");
            System.out.println("2. Fragata (3 casillas)");
            System.out.println("3. Canoa (1 casillas)");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Has elegido el portaaviones");
                        System.out.println("Introduce la coordenada X");
                        int x = teclado.nextInt();
                        System.out.println("Introduce la coordenada Y");
                        int y = teclado.nextInt();
                        System.out.println("Introduce la direccion en la que quieres colocar el barco (SOUTH, NORTH, EAST, WEST)");
                        CardinalPoints direccionP = CardinalPoints.valueOf(teclado.next().toUpperCase());
                        System.out.println("El barco esta en la posicion: " + x + " " + y + " " + direccionP);
                    }
                    case 2 -> {
                        System.out.println("Has elegido el fragata");
                        System.out.println("Introduce la coordenada X");
                        int x1 = teclado.nextInt();
                        System.out.println("Introduce la coordenada Y");
                        int y1 = teclado.nextInt();
                        System.out.println("Introduce la direccion en la que quieres colocar el barco (SOUTH, NORTH, EAST, WEST)");
                        CardinalPoints direccionF = CardinalPoints.valueOf(teclado.next().toUpperCase());
                        System.out.println("El barco esta en la posicion: " + x1 + " " + y1 + " " + direccionF);
                    }
                    case 3 -> {
                        System.out.println("Has elegido el canoa");
                        System.out.println("Introduce la coordenada X");
                        int x2 = teclado.nextInt();
                        System.out.println("Introduce la coordenada Y");
                        int y2 = teclado.nextInt();
                        System.out.println("Introduce la direccion en la que quieres colocar el barco (SOUTH, NORTH, EAST, WEST)");
                        CardinalPoints direccionC = CardinalPoints.valueOf(teclado.next().toUpperCase());
                        System.out.println("El barco esta en la posicion: " + x2 + " " + y2 + " " + direccionC);
                    }
                    case 4 -> terminar = true;
                    default -> System.out.println("Debe ingresar un numero entre el 1 y 7");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Debes ingresar un numero.");
                teclado.next();
            }

        }while (!terminar);

    }
}
