/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegocommandymemento;

/**
 *
 * @author DELL
 */
// Memento que guarda el estado del juego
public class EstadoJuego {
    private final int x, y; // Posición del personaje 
private final int vida; // Puntos de vida 
public EstadoJuego(int x, int y, int vida) { 
this.x = x; 
this.y = y; 
this.vida = vida; 
} 
public int getX() { return x; } 
public int getY() { return y; } 
public int getVida() { return vida; } 
}

