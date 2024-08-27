package main;

import java.text.SimpleDateFormat;
import java.util.Locale;
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
public class VisitaTerreno {
    private int identificadorVisita;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    // Constructor con validaciones
    public VisitaTerreno(int identificadorVisita, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        setIdentificadorVisita(identificadorVisita);
        setRutCliente(rutCliente);
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setComentarios(comentarios);
    }

    // Validación y asignación del identificador de la visita en terreno
    public void setIdentificadorVisita(int identificadorVisita) {
        if (identificadorVisita <= 0) {
            throw new IllegalArgumentException("El identificador de la visita en terreno debe ser un número positivo.");
        }
        this.identificadorVisita = identificadorVisita;
    }

    public int getIdentificadorVisita() {
        return identificadorVisita;
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

    // Validación y asignación de los comentarios
    public void setComentarios(String comentarios) {
        if (comentarios != null && comentarios.length() > 100) {
            throw new IllegalArgumentException("Los comentarios no pueden exceder los 100 caracteres.");
        }
        this.comentarios = comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "identificadorVisita=" + identificadorVisita +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
