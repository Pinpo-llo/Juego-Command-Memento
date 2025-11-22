/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegocommandymemento;

/**
 *
 * @author DELL
 */
// Comando para mover al personaje 
class ComandoMover implements Comando { 
private Juego juego; 
private int deltaX, deltaY; 
public ComandoMover(Juego juego, int deltaX, int deltaY) { 
this.juego = juego; 
this.deltaX = deltaX; 
this.deltaY = deltaY; 
} 
@Override 
public void ejecutar() { 
juego.mover(deltaX, deltaY); 
} 
@Override 
public void deshacer() { 
juego.mover(-deltaX, -deltaY); // Mueve al personaje de regreso 
} 
}
