package main;

public class Capacitacion {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    // Constructor sin parámetros
    public Capacitacion() {}

    // Constructor con todos los atributos
    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
        setIdentificador(identificador); // Validación dentro del setter
        setRutCliente(rutCliente); // Validación dentro del setter
        setDia(dia); // Validación dentro del setter
        setHora(hora); // Validación dentro del setter
        setLugar(lugar); // Validación dentro del setter
        setDuracion(duracion); // Validación dentro del setter
        setCantidadAsistentes(cantidadAsistentes); // Validación dentro del setter
    }
    
    // Métodos accesores (getters) y mutadores(setters).
    public int getIdentificador() {
		return identificador;
	}

    public void setIdentificador(int identificador) {
        if (identificador > 0) {
            this.identificador = identificador;
        } else {
            throw new IllegalArgumentException("El identificador debe ser un número positivo.");
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
        String[] diasPermitidos = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        boolean esDiaValido = false;
        for (String d : diasPermitidos) {
            if (d.equalsIgnoreCase(dia)) {
                esDiaValido = true;
                break;
            }
        }
        if (esDiaValido) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("El día debe ser un valor entre 'lunes' y 'domingo'.");
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

	public String getDuracion() {
		return duracion;
	}

    public void setDuracion(String duracion) {
        if (duracion == null || duracion.length() <= 70) {
            this.duracion = duracion;
        } else {
            throw new IllegalArgumentException("La duración debe tener un máximo de 70 caracteres.");
        }
    }

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

    public void setCantidadAsistentes(int cantidadAsistentes) {
        if (cantidadAsistentes > 0 && cantidadAsistentes < 1000) {
            this.cantidadAsistentes = cantidadAsistentes;
        } else {
            throw new IllegalArgumentException("La cantidad de asistentes debe ser un número entero menor que 1000.");
        }
    }

	// Método adicional
    public String mostrarDetalle() {
        return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion + " minutos";
    }
	
	// Método toString
    @Override
    public String toString() {
        return "Capacitacion{" +
                "Identificador=" + identificador +
                ", RUT Cliente=" + rutCliente +
                ", Día='" + dia + '\'' +
                ", Hora='" + hora + '\'' +
                ", Lugar='" + lugar + '\'' +
                ", Duración=" + duracion +
                " minutos, Cantidad de Asistentes=" + cantidadAsistentes +
                '}';
    }
}