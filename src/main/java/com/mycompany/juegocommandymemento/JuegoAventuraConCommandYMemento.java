/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegocommandymemento;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JuegoAventuraConCommandYMemento { 
public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
        Juego juego = new Juego();
        AdministradorJuego admin = new AdministradorJuego(juego);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mover personaje");
            System.out.println("2. Atacar");
            System.out.println("3. Guardar estado");
            System.out.println("4. Restaurar estado");
            System.out.println("5. Deshacer última acción");
            System.out.println("6. Mostrar estado actual");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Mover en X (positivo derecha, negativo izquierda): ");
                    int dx = sc.nextInt();
                    System.out.print("Mover en Y (positivo arriba, negativo abajo): ");
                    int dy = sc.nextInt();
                    admin.ejecutarComando(new ComandoMover(juego, dx, dy));
                    break;

                case 2:
                    admin.ejecutarComando(new ComandoAtacar(juego));
                    break;

                case 3:
                    admin.guardarEstado();
                    break;

                case 4:
                    admin.restaurarUltimoEstado();
                    break;

                case 5:
                    admin.deshacer();
                    break;

                case 6:
                    System.out.println("Posición del personaje: (" + juego.getX() + ", " + juego.getY() + "),con " + juego.getVida()+ " de Vida: " );
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Gracias por jugar.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}

 
