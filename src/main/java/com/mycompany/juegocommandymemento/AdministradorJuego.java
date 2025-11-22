/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegocommandymemento;

/**
 *
 * @author DELL
 */
// Clase que administra los comandos (Command) y guarda/restaura estados del juego (Memento)
import java.util.Stack; 
class AdministradorJuego { 
private Stack<Comando> historialComandos = new Stack<>(); 
private Stack<EstadoJuego> historialEstados = new Stack<>(); 
private Juego juego; 
public AdministradorJuego(Juego juego) { 
this.juego = juego; 
} 
public void ejecutarComando(Comando comando) { 
historialEstados.push(juego.guardar()); // Guarda el estado antes de ejecutar 
comando.ejecutar(); 
historialComandos.push(comando); 
}

public void deshacer() {
    if (!historialComandos.isEmpty()) {
        Comando ultimoComando = historialComandos.pop();
        ultimoComando.deshacer();
        System.out.println("Se ha deshecho el último comando.");
    } else {
        System.out.println("No hay comandos para deshacer.");
    }
}

public void guardarEstado() { 
historialEstados.push(juego.guardar()); 
System.out.println("Estado del juego guardado."); 
} 
public void restaurarUltimoEstado() { 
if (!historialEstados.isEmpty()) { 
juego.restaurar(historialEstados.pop()); 
} else { 
System.out.println("No hay estados guardados para restaurar."); 
} 
} 
} 
