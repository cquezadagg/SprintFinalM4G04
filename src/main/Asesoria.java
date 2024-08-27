package main;
/**
 * La interface Asesoria contiene el metodo analizarUsuario(), el cual ayuda a desplegar
 * datos en las clases Profesional, Administrativo y Cliente.
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */

/*
 * 4. Principio de Segregación de Interfaces(I):
 * Aunque en este caso solo hay una interfaz ("Asesoria"), la interfaz define un único método,
 * analizarUsuario(), que es lo suficientemente específico para ser implementado por
 *  cualquier clase que extienda de "Usuario".
 */
public interface Asesoria {
    void analizarUsuario();
}
