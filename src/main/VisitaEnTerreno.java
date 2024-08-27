package main;
/**
 * Esta clase representa una visita en terreno realizada por un profesional a un cliente.
 * Contiene información como el identificador de la visita, el RUT del cliente, el día,
 * la hora, el lugar y los comentarios de la visita.
 * 
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */
public class VisitaEnTerreno {
    private int identificadorVisita;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;
    
 // Constructor sin parámetros
    public VisitaEnTerreno() {}

    // Constructor con todos los parámetros
    public VisitaEnTerreno(int identificadorVisita, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        setIdentificadorVisita(identificadorVisita); // Validación dentro del setter
        setRutCliente(rutCliente); // Validación dentro del setter
        setDia(dia); // Validación dentro del setter
        setHora(hora); // Validación dentro del setter
        setLugar(lugar); // Validación dentro del setter
        setComentarios(comentarios); // Validación dentro del setter
    }

	// Métodos accesores (getters) y mutadores(setters).
	public int getIdentificadorVisita() {
		return identificadorVisita;
	}

    public void setIdentificadorVisita(int identificadorVisita) {
        if (identificadorVisita > 0) {
            this.identificadorVisita = identificadorVisita;
        } else {
            throw new IllegalArgumentException("El identificador de la visita en terreno debe ser un número positivo.");
        }
    }
	public int getRutCliente() {
		return rutCliente;
	}

    public void setRutCliente(int rutCliente) {
        if (rutCliente > 0 && rutCliente < 99999999) {
            this.rutCliente = rutCliente;
        } else {
            throw new IllegalArgumentException("El RUT del cliente debe ser un número menor a 99.999.999.");
        }
    }

	public String getDia() {
		return dia;
	}

    public void setDia(String dia) {
        if (dia.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("El día debe estar en formato DD/MM/AAAA.");
        }
    }

	public String getHora() {
		return hora;
	}

    public void setHora(String hora) {
        if (hora.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora debe estar en formato HH:MM, entre 00:00 y 23:59.");
        }
    }
	public String getLugar() {
		return lugar;
	}

    public void setLugar(String lugar) {
        if (lugar != null && lugar.length() >= 10 && lugar.length() <= 50) {
            this.lugar = lugar;
        } else {
            throw new IllegalArgumentException("El lugar debe tener entre 10 y 50 caracteres.");
        }
    }

	public String getComentarios() {
		return comentarios;
	}

    public void setComentarios(String comentarios) {
        if (comentarios == null || comentarios.length() <= 100) {
            this.comentarios = comentarios;
        } else {
            throw new IllegalArgumentException("Los comentarios deben tener un máximo de 100 caracteres.");
        }
    }
    
    @Override
    public String toString() {
        return "Visita en Terreno {" +
                "Identificador de la Visita=" + identificadorVisita +
                ", RUT Cliente=" + rutCliente +
                ", Día='" + dia + '\'' +
                ", Hora='" + hora + '\'' +
                ", Lugar='" + lugar + '\'' +
                ", Comentarios='" + comentarios + '\'' +
                '}';
    }
}
