package main;

/*
 * 2. Principio Abierto/Cerrado(O):
 * Las clases "Administrativo", "Profesional" y "Cliente" cumplen este principio,
 * ya que están abiertas para la extensión, permitiendo agregar nuevos comportamientos
 * específicos para cada tipo de usuario, pero están cerradas para modificaciones que 
 * afecten a la clase "Usuario" base.
 */

public class Administrativo extends Usuario{
    private String area;
    private String experienciaPrevia;

    // Constructor sin parámetros
    public Administrativo() {}

    // Constructor con todos los parámetros
    public Administrativo(String nombre, String fechaDeNacimiento, int run, String area, String experienciaPrevia) {
    	super(nombre, fechaDeNacimiento, run);
        setArea(area); // Validación dentro del setter
        setExperienciaPrevia(experienciaPrevia); // Validación dentro del setter
    }

	// Métodos accesores (getters) y mutadores(setters).
	public String getArea() {
		return area;
	}

    public void setArea(String area) {
        if (area != null && area.length() >= 5 && area.length() <= 20) {
            this.area = area;
        } else {
            throw new IllegalArgumentException("El área debe tener entre 5 y 20 caracteres.");
        }
    }

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

    public void setExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia == null || experienciaPrevia.length() <= 100) {
            this.experienciaPrevia = experienciaPrevia;
        } else {
            throw new IllegalArgumentException("La experiencia previa debe tener un máximo de 100 caracteres.");
        }
    }
	
	// Sobrescribir el método analizarUsuario
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia Previa: " + experienciaPrevia);
	}

	@Override
    public String toString() {
        return "Administrativo {" +
                "Área='" + area + '\'' +
                ", Experiencia Previa='" + experienciaPrevia + '\'' +
                '}';
	}
}
