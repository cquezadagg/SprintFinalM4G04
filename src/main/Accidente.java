package main;

import java.text.SimpleDateFormat;
import java.util.Locale;
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
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    // Constructor con validaciones
    public Accidente(int identificadorAccidente, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        setIdentificadorAccidente(identificadorAccidente);
        setRutCliente(rutCliente);
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setOrigen(origen);
        setConsecuencias(consecuencias);
    }

    // Validación y asignación del identificador del accidente
    public void setIdentificadorAccidente(int identificadorAccidente) {
        if (identificadorAccidente <= 0) {
            throw new IllegalArgumentException("El identificador del accidente debe ser un número positivo.");
        }
        this.identificadorAccidente = identificadorAccidente;
    }

    public int getIdentificadorAccidente() {
        return identificadorAccidente;
    }

    // Validación y asignación del RUT del cliente
    public void setRutCliente(int rutCliente) {
        if (rutCliente <= 0 || rutCliente > 99999999) {
            throw new IllegalArgumentException("El RUT del cliente debe ser un número positivo menor a 99.999.999.");
        }
        this.rutCliente = rutCliente;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    // Validación y asignación del día
    public void setDia(String dia) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            sdf.setLenient(false);
            sdf.parse(dia); // Intenta parsear la fecha
            this.dia = dia;
        } catch (Exception e) {
            throw new IllegalArgumentException("El día debe estar en el formato DD/MM/AAAA.");
        }
    }

    public String getDia() {
        return dia;
    }

    // Validación y asignación de la hora
    public void setHora(String hora) {
        if (hora == null || !hora.matches("(?:[01]\\d|2[0-3]):[0-5]\\d")) {
            throw new IllegalArgumentException("La hora debe estar en el formato HH:MM y debe ser una hora válida.");
        }
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    // Validación y asignación del lugar
    public void setLugar(String lugar) {
        if (lugar == null || lugar.length() < 10 || lugar.length() > 50) {
            throw new IllegalArgumentException("El lugar debe tener entre 10 y 50 caracteres.");
        }
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    // Validación y asignación del origen
    public void setOrigen(String origen) {
        if (origen != null && origen.length() > 100) {
            throw new IllegalArgumentException("El origen no puede exceder los 100 caracteres.");
        }
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    // Validación y asignación de las consecuencias
    public void setConsecuencias(String consecuencias) {
        if (consecuencias != null && consecuencias.length() > 100) {
            throw new IllegalArgumentException("Las consecuencias no pueden exceder los 100 caracteres.");
        }
        this.consecuencias = consecuencias;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "identificadorAccidente=" + identificadorAccidente +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
