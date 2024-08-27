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
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    // Constructor sin parámetros que inicializa las listas
    public Contenedor() {
        this.asesorias = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }
	
    // Método para almacenar un usuario
    public void almacenarUsuario(Usuario usuario) {
        asesorias.add(usuario);
    }
    
    // Método para almacenar un cliente
    public void almacenarCliente(Cliente cliente) {
        asesorias.add(cliente);
    }

    // Método para almacenar un profesional
    public void almacenarProfesional(Profesional profesional) {
        asesorias.add(profesional);
    }

    // Método para almacenar un administrativo
    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorias.add(administrativo);
    }

    // Método para almacenar una capacitación
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    // Método para eliminar un usuario por su RUN
    public void eliminarUsuario(int run) {
        asesorias.removeIf(asesoria -> {
            if (asesoria instanceof Usuario) {
                return ((Usuario) asesoria).getRun() == run;
            }
            return false;
        });
    }
    
    // Método para listar todos los usuarios
    public void listarUsuarios() {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                System.out.println(asesoria.toString());
            }
        }
    }

    // Método para listar usuarios por tipo
    public void listarUsuariosPorTipo(Class<?> tipo) {
        for (Asesoria asesoria : asesorias) {
            if (tipo.isInstance(asesoria)) {
                System.out.println(asesoria.toString());
            }
        }
    }

    // Método para listar todas las capacitaciones junto con los datos del cliente asociado
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion.toString());
            for (Asesoria asesoria : asesorias) {
                if (asesoria instanceof Cliente && ((Cliente) asesoria).getRut() == capacitacion.getRutCliente()) {
                    System.out.println("Cliente asociado: " + ((Cliente) asesoria).toString());
                }
            }
        }
    }
}