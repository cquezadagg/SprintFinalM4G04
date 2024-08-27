package main;

import java.util.ArrayList;
import java.util.List;
/**
 * Esta clase actúa como un contenedor para almacenar y gestionar listas
 * de usuarios (Asesoria) y capacitaciones (Capacitacion). Proporciona métodos
 * para agregar, eliminar y listar usuarios y capacitaciones, así como para
 * realizar búsquedas y filtrados específicos.
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */
public class Contenedor {
    private List<Usuario> usuarios;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        usuarios = new ArrayList<>();
        capacitaciones = new ArrayList<>();
    }

    public void almacenarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(int run) {
        usuarios.removeIf(usuario -> usuario.getRun() == run);
    }

    // Método modificado para listar solo los datos del usuario: RUN, Nombre, y Fecha de Nacimiento
    public void listarUsuarios() {
        System.out.println("Lista de usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println("RUN: " + usuario.getRun());
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Fecha de Nacimiento: " + usuario.getFechaNacimiento());
            System.out.println("----------------------------");
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion);
        }
    }

    public void listarUsuariosPorTipo(Class<?> tipo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getClass() == tipo) {
                System.out.println(usuario);
            }
        }
    }
}
