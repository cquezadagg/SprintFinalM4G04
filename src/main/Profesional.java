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

public class Profesional extends Usuario{
	private String titulo;
	private String fechaIngreso;

	// Constructor sin parámetros
	public Profesional() {}

	// Constructor con todos los parámetros
	   public Profesional(String nombre, String fechaDeNacimiento, int run, String titulo, String fechaIngreso) {
		    super(nombre, fechaDeNacimiento, run);
	        setTitulo(titulo); // Validación dentro del setter
	        setFechaIngreso(fechaIngreso); // Validación dentro del setter
	    }

	// Métodos accesores (getters) y mutadores(setters).
	public String getTitulo() {
		return titulo;
	}

    public void setTitulo(String titulo) {
        if (titulo != null && titulo.length() >= 10 && titulo.length() <= 50) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("El título debe tener entre 10 y 50 caracteres.");
        }
    }

	public String getFechaIngreso() {
		return fechaIngreso;
	}

    public void setFechaIngreso(String fechaIngreso) {
        if (fechaIngreso != null) {
            this.fechaIngreso = fechaIngreso;
        } else {
            throw new IllegalArgumentException("La fecha de ingreso es obligatoria.");
        }
    }
	
	// Sobrescribir el método analizarUsuario
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: " + titulo);
		System.out.println("Fecha de Ingreso: " + fechaIngreso);
 
}

    @Override
    public String toString() {
        return "Profesional {" +
        		"Nombre='" + getNombre() + '\'' +
        		", Fecha de nacimiento='" + getFechaDeNacimiento() + '\'' +
        		", RUN='" + getRun() + '\'' +
                ", Título='" + titulo + '\'' +
                ", Fecha de Ingreso='" + fechaIngreso + '\'' +
                '}';
	}
}