/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegocommandymemento;

/**
 *
 * @author DELL
 */
// Comando para atacar 
class ComandoAtacar implements Comando { 
private Juego juego; 
private int vidaAnterior; 
public ComandoAtacar(Juego juego) { 
this.juego = juego; 
} 
@Override 
public void ejecutar() { 
vidaAnterior = juego.getVida(); // Guarda la vida antes de atacar 
juego.atacar(); 
} 
@Override 
public void deshacer() { 
juego.restaurar(new EstadoJuego(juego.getX(), juego.getY(), vidaAnterior)); // Restaura la vida 
} 
}