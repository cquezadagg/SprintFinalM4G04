package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * Esta clase representa un usuario genérico que tiene acceso a la plataforma. 
 * Es la clase base de la cual heredan otros tipos de usuarios como Cliente, Profesional y Administrativo.
 * 
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */

/*
 * 1. Principio de Responsabilidad Unica(S):
 * La clase de "Usuario" cuenta con la unica responsabilidad de
 * gestionar los datos y comportamiento básicos de un usuario.
 * No se ocupa de ninguna otra funcionalidad, como la lógica
 * de negocio relacionada con la "Profesional" o "Administrativo".
 */

/*
 * 3. Principio de Sustitución de Liskov(L):
 * Como las clases "Cliente", "Profesional", y "Administrativo" extienden "Usuario",
 * pueden ser utilizadas en cualquier contexto donde se espere un objeto de
 * tipo "Usuario" o "Asesoria". Esto garantiza que la substitución de instancias
 * de la clase "Usuario" por cualquiera de sus subclases no romperá la funcionalidad del sistema.
 */
public class Usuario {
    private String nombre;
    private String fechaNacimiento;  // Declarado como String
    private int run;

    // Constructor que recibe todos los atributos
    public Usuario(String nombre, String fechaNacimiento, int run) throws IllegalArgumentException {
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setRun(run);
    }

    // Validación y asignación del nombre
    public void setNombre(String nombre) {
        if (nombre == null || nombre.length() < 10 || nombre.length() > 50) {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres.");
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Validación y asignación de la fecha de nacimiento en formato DD/MM/AAAA
    public void setFechaNacimiento(String fechaNacimiento) {
        if (!esFechaValida(fechaNacimiento)) {
            throw new IllegalArgumentException("La fecha de nacimiento debe tener el formato DD/MM/AAAA.");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Validación y asignación del RUN
    public void setRun(int run) {
        if (run <= 0 || run >= 99999999) {
            throw new IllegalArgumentException("El RUN debe ser un número menor a 99.999.999.");
        }
        this.run = run;
    }

    public int getRun() {
        return run;
    }

    // Método auxiliar para validar la fecha en formato DD/MM/AAAA
    private boolean esFechaValida(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false); // Para asegurar que la fecha sea estrictamente válida
        try {
            formatoFecha.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
        		", run=" + run +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                
                '}';
    }
}
