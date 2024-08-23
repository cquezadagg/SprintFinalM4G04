package main;

public class Revision {
    private int identificadorRevision;
    private int identificadorVisitaTerreno;
    private String nombreRevision;
    private String detalle;
    private int estado;

    // Constructor sin parámetros
    public Revision() {}

    // Constructor con todos los parámetros
    public Revision(int identificadorRevision, int identificadorVisitaTerreno, String nombreRevision, String detalle, int estado) {
        setIdentificadorRevision(identificadorRevision); // Validación dentro del setter
        setIdentificadorVisitaTerreno(identificadorVisitaTerreno); // Validación dentro del setter
        setNombreRevision(nombreRevision); // Validación dentro del setter
        setDetalle(detalle); // Validación dentro del setter
        setEstado(estado); // Validación dentro del setter
    }
    
	// Métodos accesores (getters) y mutadores(setters).
    public int getIdentificadorRevision() {
		return identificadorRevision;
	}

    public void setIdentificadorRevision(int identificadorRevision) {
        if (identificadorRevision > 0) {
            this.identificadorRevision = identificadorRevision;
        } else {
            throw new IllegalArgumentException("El identificador de la revisión debe ser un número positivo.");
        }
    }

    public int getIdentificadorVisitaTerreno() {
        return identificadorVisitaTerreno;
    }

    public void setIdentificadorVisitaTerreno(int identificadorVisitaTerreno) {
        if (identificadorVisitaTerreno > 0) {
            this.identificadorVisitaTerreno = identificadorVisitaTerreno;
        } else {
            throw new IllegalArgumentException("El identificador de la visita en terreno debe ser un número positivo.");
        }
    }

	public String getNombreRevision() {
		return nombreRevision;
	}

    public void setNombreRevision(String nombreRevision) {
        if (nombreRevision != null && nombreRevision.length() >= 10 && nombreRevision.length() <= 50) {
            this.nombreRevision = nombreRevision;
        } else {
            throw new IllegalArgumentException("El nombre de la revisión debe tener entre 10 y 50 caracteres.");
        }
    }
    
	public String getDetalle() {
		return detalle;
	}

    public void setDetalle(String detalle) {
        if (detalle == null || detalle.length() <= 100) {
            this.detalle = detalle;
        } else {
            throw new IllegalArgumentException("El detalle debe tener un máximo de 100 caracteres.");
        }
    }
    
	public int getEstado() {
		return estado;
	}

    public void setEstado(int estado) {
        if (estado >= 1 && estado <= 3) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("El estado debe ser 1 (sin problemas), 2 (con observaciones) o 3 (no aprueba).");
        }
    }
    
    @Override
    public String toString() {
        return "Revisión {" +
                "Identificador de la Revisión=" + identificadorRevision +
                ", Identificador de la Visita en Terreno=" + identificadorVisitaTerreno +
                ", Nombre de la Revisión='" + nombreRevision + '\'' +
                ", Detalle='" + detalle + '\'' +
                ", Estado=" + obtenerEstadoDescripcion() +
                '}';
    }
 // Método para obtener una descripción legible del estado
    private String obtenerEstadoDescripcion() {
        switch (estado) {
            case 1:
                return "Sin problemas";
            case 2:
                return "Con observaciones";
            case 3:
                return "No aprueba";
            default:
                return "Desconocido";
        }
    }
}
