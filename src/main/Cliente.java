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
public class Cliente extends Usuario {
    private int rut;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud; // 1 para Fonasa, 2 para Isapre
    private String direccion;
    private String comuna;
    private int edad;

    // Constructor con validaciones
    public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        setRut(rut);
        setNombre(nombres);  // Validación realizada en la clase padre
        setApellidos(apellidos);
        setTelefono(telefono);
        setAfp(afp);
        setSistemaSalud(sistemaSalud);
        setDireccion(direccion);
        setComuna(comuna);
        setEdad(edad);
    }

    // Validación y asignación del RUT
    public void setRut(int rut) {
        if (rut <= 0 || rut >= 99999999) {
            throw new IllegalArgumentException("El RUT debe ser un número menor a 99.999.999.");
        }
        this.rut = rut;
    }

    public int getRut() {
        return rut;
    }

    // Validación y asignación de los apellidos
    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.length() < 5 || apellidos.length() > 30) {
            throw new IllegalArgumentException("Los apellidos deben tener entre 5 y 30 caracteres.");
        }
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    // Validación y asignación del teléfono
    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono es obligatorio.");
        }
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    // Validación y asignación del AFP
    public void setAfp(String afp) {
        if (afp == null || afp.length() < 4 || afp.length() > 30) {
            throw new IllegalArgumentException("El AFP debe tener entre 4 y 30 caracteres.");
        }
        this.afp = afp;
    }

    public String getAfp() {
        return afp;
    }

    // Validación y asignación del sistema de salud
    public void setSistemaSalud(int sistemaSalud) {
        if (sistemaSalud != 1 && sistemaSalud != 2) {
            throw new IllegalArgumentException("El sistema de salud debe ser 1 (Fonasa) o 2 (Isapre).");
        }
        this.sistemaSalud = sistemaSalud;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    // Validación y asignación de la dirección
    public void setDireccion(String direccion) {
        if (direccion != null && direccion.length() > 70) {
            throw new IllegalArgumentException("La dirección no puede tener más de 70 caracteres.");
        }
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    // Validación y asignación de la comuna
    public void setComuna(String comuna) {
        if (comuna != null && comuna.length() > 50) {
            throw new IllegalArgumentException("La comuna no puede tener más de 50 caracteres.");
        }
        this.comuna = comuna;
    }

    public String getComuna() {
        return comuna;
    }

    // Validación y asignación de la edad
    public void setEdad(int edad) {
        if (edad < 0 || edad >= 150) {
            throw new IllegalArgumentException("La edad debe ser un número mayor o igual a 0 y menor a 150.");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                ", nombre='" + getNombre() + '\'' +
                ", fechaNacimiento='" + getFechaNacimiento() + '\'' +
                ", run=" + getRun() +
                '}';
    }
}
