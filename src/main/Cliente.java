package main;
/**
 * Esta clase hereda de Usuario y representa a un cliente de la empresa.
 * Además de los atributos heredados, contiene información específica sobre el cliente,
 * como el RUT, nombres, apellidos, teléfono, AFP, sistema de salud, dirección, comuna y edad.
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

public class Cliente extends Usuario{
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
    
    // este es el constructor sin parámetros
    public Cliente() {
    }

    public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
    	setRut(rut); // Validación dentro del setter
        setNombres(nombres); // Validación dentro del setter
        setApellidos(apellidos); // Validación dentro del setter
        setTelefono(telefono); // Validación dentro del setter
        setAfp(afp); // Validación dentro del setter
        setSistemaSalud(sistemaSalud); // Validación dentro del setter
        setDireccion(direccion); // Validación dentro del setter
        setComuna(comuna); // Validación dentro del setter
        setEdad(edad); // Validación dentro del setter
    }

 // Métodos accesores (getters) y mutadores(setters).
    public int getRut() {
		return rut;
	}

    public void setRut(int rut) {
        if (rut > 0 && rut < 99999999) {
            this.rut = rut;
        } else {
            throw new IllegalArgumentException("El RUT debe ser un número menor a 99.999.999.");
        }
    }

	public String getNombres() {
		return nombres;
	}

    public void setNombres(String nombres) {
        if (nombres != null && nombres.length() >= 5 && nombres.length() <= 30) {
            this.nombres = nombres;
        } else {
            throw new IllegalArgumentException("Los nombres deben tener entre 5 y 30 caracteres.");
        }
    }


	public String getApellidos() {
		return apellidos;
	}

    public void setApellidos(String apellidos) {
        if (apellidos != null && apellidos.length() >= 5 && apellidos.length() <= 30) {
            this.apellidos = apellidos;
        } else {
            throw new IllegalArgumentException("Los apellidos deben tener entre 5 y 30 caracteres.");
        }
    }

	public String getTelefono() {
		return telefono;
	}

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.isEmpty()) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El teléfono es obligatorio.");
        }
    }

	public String getAfp() {
		return afp;
	}

    public void setAfp(String afp) {
        if (afp != null && afp.length() >= 4 && afp.length() <= 30) {
            this.afp = afp;
        } else {
            throw new IllegalArgumentException("La AFP debe tener entre 4 y 30 caracteres.");
        }
    }

	public int getSistemaSalud() {
		return sistemaSalud;
	}

    public void setSistemaSalud(int sistemaSalud) {
        if (sistemaSalud == 1 || sistemaSalud == 2) {
            this.sistemaSalud = sistemaSalud;
        } else {
            throw new IllegalArgumentException("El sistema de salud debe ser 1 (Fonasa) o 2 (Isapre).");
        }
    }

	public String getDireccion() {
		return direccion;
	}

    public void setDireccion(String direccion) {
        if (direccion != null && direccion.length() <= 70) {
            this.direccion = direccion;
        } else {
            throw new IllegalArgumentException("La dirección debe tener un máximo de 70 caracteres.");
        }
    }

	public String getComuna() {
		return comuna;
	}

    public void setComuna(String comuna) {
        if (comuna != null && comuna.length() <= 50) {
            this.comuna = comuna;
        } else {
            throw new IllegalArgumentException("La comuna debe tener un máximo de 50 caracteres.");
        }
    }
	public int getEdad() {
		return edad;
	}

    public void setEdad(int edad) {
        if (edad >= 0 && edad < 150) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser un número entre 0 y 149.");
        }
    }
	//Metodos adicionales
    public String obtenerNombre() {
        return nombres + " " + apellidos;
    }

    public String obtenerSistemaSalud() {
        return sistemaSalud == 1 ? "Fonasa" : "Isapre";
    }
	
    
 // Sobrescribir el método analizarUsuario
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
	}

	@Override
    public String toString() {
        return "Cliente{" +
        		"Nombre='" + getNombre() + '\'' +
        		", Fecha de nacimiento='" + getFechaDeNacimiento() + '\'' +
        		", RUN='" + getRun() + '\'' +
                ", RUT='" + rut +
                ", Nombres='" + nombres + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", Teléfono='" + telefono + '\'' +
                ", AFP='" + afp + '\'' +
                ", Sistema de Salud=" + sistemaSalud +
                ", Dirección='" + direccion + '\'' +
                ", Comuna='" + comuna + '\'' +
                ", Edad=" + edad +
                '}';
    }
}