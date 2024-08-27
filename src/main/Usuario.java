package main;
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


public class Usuario implements Asesoria{

	private String nombre;
	private String fechaDeNacimiento;
	private int run;
	
	
	// Constructor sin parametros.
	public Usuario() {
		
	}
	
	// Constructor con parametros.
	public Usuario(String nombre, String fechaDeNacimiento, int run) {
	       setNombre(nombre); // Validación dentro del setter
	       setFechaDeNacimiento(fechaDeNacimiento); // Validación dentro del setter
	       setRun(run); // Validación dentro del setter
	}

	
	// Métodos accesores (getters) y mutadores(setters).
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
        if (nombre != null && nombre.length() >= 10 && nombre.length() <= 50) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres.");
        }
    }

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
        if (fechaDeNacimiento != null) {
            this.fechaDeNacimiento = fechaDeNacimiento;
        } else {
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria.");
        }
    }

	public int getRun() {
		return run;
	}

    public void setRun(int run) {
        if (run > 0 && run < 99999999) {
            this.run = run;
        } else {
            throw new IllegalArgumentException("El RUN debe ser un número menor a 99.999.999.");
        }
    }

	// Método adicional
    public String mostrarEdad() {
        // Supongamos que la fecha de nacimiento se proporciona en el formato "dd-mm-yyyy"
        int yearOfBirth = Integer.parseInt(fechaDeNacimiento.split("-")[2]);
        int currentYear = java.time.Year.now().getValue();
        int edad = currentYear - yearOfBirth;
        return "El usuario tiene " + edad + " años";
    }
    
    
    // Implementación del método de la interfaz Asesoria
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Nombre de usuario: " + nombre + " y RUT del usuario:" + run);
	}

	@Override
	   public String toString() {
        return "Usuario {" +
                "Nombre='" + nombre + '\'' +
                ", Fecha de Nacimiento='" + fechaDeNacimiento + '\'' +
                ", RUN='" + run + '\'' +
                '}';
	}
	
}
