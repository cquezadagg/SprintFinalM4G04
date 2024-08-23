package main;

/*
 * 4. Principio de Segregación de Interfaces(I):
 * Aunque en este caso solo hay una interfaz ("Asesoria"), la interfaz define un único método,
 * analizarUsuario(), que es lo suficientemente específico para ser implementado por
 *  cualquier clase que extienda de "Usuario".
 */

public interface Asesoria {
	void analizarUsuario();
}
