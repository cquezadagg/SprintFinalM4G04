package main;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * Esta clase representa un accidente reportado en la empresa. 
 * Contiene información relevante como el identificador del accidente,
 * el RUT del cliente involucrado, el día, la hora, el lugar, el origen
 * y las consecuencias del accidente.
 * 
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */

public class Accidente {
    private int identificadorAccidente;
    private int rutCliente;
    private String dia;
    private LocalTime hora;
    private String lugar;
    private String origen;
    private String consecuencias;
    
 // Constructor sin parámetros
    public Accidente() {}

    // Constructor con todos los parámetros
    public Accidente(int identificadorAccidente, int rutCliente, String dia, LocalTime hora, String lugar, String origen, String consecuencias) {
        this.identificadorAccidente = identificadorAccidente;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        setLugar(lugar); // Validación dentro del setter
        setOrigen(origen); // Validación dentro del setter
        setConsecuencias(consecuencias); // Validación dentro del setter
    }

	// Métodos accesores (getters) y mutadores(setters).
	public int getIdentificadorAccidente() {
		return identificadorAccidente;
	}

	public void setIdentificadorAccidente(int identificadorAccidente) {
		this.identificadorAccidente = identificadorAccidente;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
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

	public String getOrigen() {
		return origen;
	}

	   public void setOrigen(String origen) {
	        if (origen != null && origen.length() <= 100) {
	            this.origen = origen;
	        } else {
	            throw new IllegalArgumentException("El origen debe tener un máximo de 100 caracteres.");
	        }
	    }

	public String getConsecuencias() {
		return consecuencias;
	}

    public void setConsecuencias(String consecuencias) {
        if (consecuencias != null && consecuencias.length() <= 100) {
            this.consecuencias = consecuencias;
        } else {
            throw new IllegalArgumentException("Las consecuencias deben tener un máximo de 100 caracteres.");
        }
    }
    
    // Método para formatear la hora como string.
    public String obtenerHoraFormateada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return hora.format(formatter);
    }

    // Método toString para mostrar la información del accidente
    @Override
    public String toString() {
        return "Accidente {" +
                "Identificador=" + identificadorAccidente +
                ", RUT Cliente=" + rutCliente +
                ", Día=" + dia +
                ", Hora=" + obtenerHoraFormateada() +
                ", Lugar='" + lugar + '\'' +
                ", Origen='" + origen + '\'' +
                ", Consecuencias='" + consecuencias + '\'' +
                '}';
	}
}
    
    