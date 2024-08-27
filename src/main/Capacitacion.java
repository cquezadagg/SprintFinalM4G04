package main;
/**
 * Esta clase representa una capacitación organizada por la empresa para los clientes.
 * Contiene detalles como el identificador de la capacitación, el RUT del cliente, el día,
 * la hora, el lugar, la duración, y la cantidad de asistentes.
 * 
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */
public class Capacitacion {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    // Constructor con validaciones
    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
        setIdentificador(identificador);
        setRutCliente(rutCliente);
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setDuracion(duracion);
        setCantidadAsistentes(cantidadAsistentes);
    }

    // Validación y asignación del identificador
    public void setIdentificador(int identificador) {
        if (identificador <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un número positivo.");
        }
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
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
        String[] diasPermitidos = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        boolean valido = false;
        for (String d : diasPermitidos) {
            if (d.equalsIgnoreCase(dia)) {
                valido = true;
                break;
            }
        }
        if (!valido) {
            throw new IllegalArgumentException("El día debe ser uno de los siguientes: lunes, martes, miércoles, jueves, viernes, sábado, domingo.");
        }
        this.dia = dia;
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

    // Validación y asignación de la duración
    public void setDuracion(String duracion) {
        if (duracion != null && duracion.length() > 70) {
            throw new IllegalArgumentException("La duración no puede exceder los 70 caracteres.");
        }
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    // Validación y asignación de la cantidad de asistentes
    public void setCantidadAsistentes(int cantidadAsistentes) {
        if (cantidadAsistentes <= 0 || cantidadAsistentes >= 1000) {
            throw new IllegalArgumentException("La cantidad de asistentes debe ser un número entero mayor a 0 y menor a 1000.");
        }
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    // Método para mostrar detalles de la capacitación
    public String mostrarDetalle() {
        return String.format("La capacitación será en %s a las %s del día %s, y durará %s minutos.", lugar, hora, dia, duracion);
    }

    @Override
    public String toString() {
        return "Capacitación{" +
                "identificador=" + identificador +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
}
