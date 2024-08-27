package main;
/**
 * Esta clase hereda de Usuario y representa a un administrativo que trabaja en la empresa.
 * Además de los atributos heredados, contiene información específica sobre el área de trabajo
 * y la experiencia previa del administrativo.
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
public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    // Constructor con validaciones
    public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        setArea(area);
        setExperienciaPrevia(experienciaPrevia);
    }

    // Validación y asignación del área
    public void setArea(String area) {
        if (area == null || area.length() < 5 || area.length() > 20) {
            throw new IllegalArgumentException("El área debe tener entre 5 y 20 caracteres.");
        }
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    // Validación y asignación de la experiencia previa
    public void setExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia != null && experienciaPrevia.length() > 100) {
            throw new IllegalArgumentException("La experiencia previa no puede exceder los 100 caracteres.");
        }
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", fechaNacimiento='" + getFechaNacimiento() + '\'' +
                ", run=" + getRun() +
                '}';
    }
}
