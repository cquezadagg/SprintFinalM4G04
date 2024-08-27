package main;
/**
 * Esta clase hereda de Usuario y representa a un profesional que trabaja en la empresa. 
 * Además de los atributos heredados, contiene información específica sobre el profesional,
 * como su título y fecha de ingreso.
 * 
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */

/*
 * 2. Principio Abierto/Cerrado(O):
 * Las clases "Administrativo", "Profesional" y "Cliente" cumplen este principio,
 * ya que están abiertas para la extensión, permitiendo agregar nuevos comportamientos
 * específicos para cada tipo de usuario, pero están cerradas para modificaciones que 
 * afecten a la clase "Usuario" base.
 */

public class Profesional extends Usuario {
    private String titulo;
    private String fechaIngreso;

    // Constructor con validaciones
    public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        setTitulo(titulo);
        setFechaIngreso(fechaIngreso);
    }

    // Validación y asignación del título
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.length() < 10 || titulo.length() > 50) {
            throw new IllegalArgumentException("El título debe tener entre 10 y 50 caracteres.");
        }
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Validación y asignación de la fecha de ingreso
    public void setFechaIngreso(String fechaIngreso) {
        if (fechaIngreso == null || !fechaIngreso.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new IllegalArgumentException("La fecha de ingreso debe estar en el formato DD/MM/AAAA.");
        }
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", fechaNacimiento='" + getFechaNacimiento() + '\'' +
                ", run=" + getRun() +
                '}';
    }
}
