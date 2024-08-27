package main;
/**
 * Esta clase representa una revisión realizada en el contexto de una visita en terreno.
 * Contiene detalles como el identificador de la revisión, el identificador de la visita en terreno asociada,
 * el nombre alusivo a la revisión, el detalle a revisar y el estado de la revisión.
 * 
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */
public class Revision {
    private int identificadorRevision;
    private int identificadorVisitaTerreno;
    private String nombreAlusivo;
    private String detalleParaRevisar;
    private int estado;

    // Constructor con validaciones
    public Revision(int identificadorRevision, int identificadorVisitaTerreno, String nombreAlusivo, String detalleParaRevisar, int estado) {
        setIdentificadorRevision(identificadorRevision);
        setIdentificadorVisitaTerreno(identificadorVisitaTerreno);
        setNombreAlusivo(nombreAlusivo);
        setDetalleParaRevisar(detalleParaRevisar);
        setEstado(estado);
    }

    // Validación y asignación del identificador de la revisión
    public void setIdentificadorRevision(int identificadorRevision) {
        if (identificadorRevision <= 0) {
            throw new IllegalArgumentException("El identificador de la revisión debe ser un número positivo.");
        }
        this.identificadorRevision = identificadorRevision;
    }

    public int getIdentificadorRevision() {
        return identificadorRevision;
    }

    // Validación y asignación del identificador de la visita en terreno
    public void setIdentificadorVisitaTerreno(int identificadorVisitaTerreno) {
        if (identificadorVisitaTerreno <= 0) {
            throw new IllegalArgumentException("El identificador de la visita en terreno debe ser un número positivo.");
        }
        this.identificadorVisitaTerreno = identificadorVisitaTerreno;
    }

    public int getIdentificadorVisitaTerreno() {
        return identificadorVisitaTerreno;
    }

    // Validación y asignación del nombre alusivo a la revisión
    public void setNombreAlusivo(String nombreAlusivo) {
        if (nombreAlusivo == null || nombreAlusivo.length() < 10 || nombreAlusivo.length() > 50) {
            throw new IllegalArgumentException("El nombre alusivo a la revisión debe tener entre 10 y 50 caracteres.");
        }
        this.nombreAlusivo = nombreAlusivo;
    }

    public String getNombreAlusivo() {
        return nombreAlusivo;
    }

    // Validación y asignación del detalle para revisar
    public void setDetalleParaRevisar(String detalleParaRevisar) {
        if (detalleParaRevisar != null && detalleParaRevisar.length() > 100) {
            throw new IllegalArgumentException("El detalle para revisar no puede exceder los 100 caracteres.");
        }
        this.detalleParaRevisar = detalleParaRevisar;
    }

    public String getDetalleParaRevisar() {
        return detalleParaRevisar;
    }

    // Validación y asignación del estado
    public void setEstado(int estado) {
        if (estado < 1 || estado > 3) {
            throw new IllegalArgumentException("El estado debe ser 1 (sin problemas), 2 (con observaciones) o 3 (no aprueba).");
        }
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        String estadoTexto;
        switch (estado) {
            case 1:
                estadoTexto = "Sin problemas";
                break;
            case 2:
                estadoTexto = "Con observaciones";
                break;
            case 3:
                estadoTexto = "No aprueba";
                break;
            default:
                estadoTexto = "Desconocido";
        }
        return "Revision{" +
                "identificadorRevision=" + identificadorRevision +
                ", identificadorVisitaTerreno=" + identificadorVisitaTerreno +
                ", nombreAlusivo='" + nombreAlusivo + '\'' +
                ", detalleParaRevisar='" + detalleParaRevisar + '\'' +
                ", estado=" + estadoTexto +
                '}';
    }
}
