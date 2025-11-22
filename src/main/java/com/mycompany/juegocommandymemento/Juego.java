/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegocommandymemento;

/**
 *
 * @author DELL
 */
// Juego (Originador) que crea y restaura el Memento 
class Juego { 
private int x = 0, y = 0; // Posición inicial 
private int vida = 100;   // Vida inicial 
public void mover(int deltaX, int deltaY) { 
x += deltaX; 
y += deltaY; 
System.out.println("El personaje se ha movido a (" + x + ", " + y + ")"); 
} 
public void atacar() { 
vida -= 10; // Simulación de pérdida de vida al atacar 
System.out.println("El personaje ha atacado. Vida restante: " + vida); 
} 
public EstadoJuego guardar() { 
return new EstadoJuego(x, y, vida); 
} 
public void restaurar(EstadoJuego estado) { 
this.x = estado.getX(); 
this.y = estado.getY(); 
this.vida = estado.getVida(); 
System.out.println("El juego se ha restaurado al estado (" + x + ", " + y + ") con vida:" + vida); 
} 
public int getX() { return x; } 
public int getY() { return y; } 
public int getVida() { return vida; } 
}
