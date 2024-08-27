package main;

import java.util.Scanner;
/**
 * Esta clase contiene el método main() del programa, que es el punto de entrada de la aplicación.
 * Aquí se inicializa una instancia de la clase Contenedor, y se proporciona un menú para
 * interactuar con el sistema, permitiendo gestionar usuarios y capacitaciones.
 * 
 * @version 1.0 (27-08-2024)
 *  
 * @author Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzales.
 */

public class Principal {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitación");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline

            switch (opcion) {
            case 1:
                Cliente nuevoCliente = crearCliente(scanner);
                contenedor.almacenarCliente(nuevoCliente);
                System.out.println("Cliente almacenado exitosamente.");
                break;

            case 2:
                Profesional nuevoProfesional = crearProfesional(scanner);
                contenedor.almacenarProfesional(nuevoProfesional);
                System.out.println("Profesional almacenado exitosamente.");
                break;

            case 3:
                Administrativo nuevoAdministrativo = crearAdministrativo(scanner);
                contenedor.almacenarAdministrativo(nuevoAdministrativo);
                System.out.println("Administrativo almacenado exitosamente.");
                break;

            case 4:
                Capacitacion nuevaCapacitacion = crearCapacitacion(scanner);
                contenedor.almacenarCapacitacion(nuevaCapacitacion);
                System.out.println("Capacitación almacenada exitosamente.");
                break;

            case 5:
                System.out.print("Ingrese el RUN del usuario a eliminar: ");
                int runEliminar = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                contenedor.eliminarUsuario(runEliminar);
                System.out.println("Usuario eliminado exitosamente.");
                break;

            case 6:
                System.out.println("Listado de Usuarios:");
                contenedor.listarUsuarios();
                break;


            case 7:
                System.out.print("Ingrese el tipo de usuario (Cliente, Profesional, Administrativo): ");
                String tipoUsuario = scanner.nextLine().trim();
                switch (tipoUsuario.toLowerCase()) {
                    case "cliente":
                        System.out.println("Listado de Clientes:");
                        contenedor.listarUsuariosPorTipo(Cliente.class);
                        break;
                    case "profesional":
                        System.out.println("Listado de Profesionales:");
                        contenedor.listarUsuariosPorTipo(Profesional.class);
                        break;
                    case "administrativo":
                        System.out.println("Listado de Administrativos:");
                        contenedor.listarUsuariosPorTipo(Administrativo.class);
                        break;
                    default:
                        System.out.println("Tipo de usuario no reconocido.");
                        break;
                }
                break;

            case 8:
                System.out.println("Listado de Capacitaciones:");
                contenedor.listarCapacitaciones();
                break;

            case 9:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción incorrecta. Por favor, intente nuevamente.");
                break;
        }
    } while (opcion != 9);

    scanner.close();
}
    // Métodos auxiliares para crear instancias de cada tipo
    private static Cliente crearCliente(Scanner scanner) {
    	System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento del cliente (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Ingrese el RUN del cliente: ");
        int run = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        
        System.out.print("Ingrese el RUT del cliente: ");
        int rut = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese los nombres del cliente: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese el teléfono del cliente: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese la AFP del cliente: ");
        String afp = scanner.nextLine();

        System.out.print("Ingrese el sistema de salud (1 para Fonasa, 2 para Isapre): ");
        int sistemaSalud = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese la comuna del cliente: ");
        String comuna = scanner.nextLine();

        System.out.print("Ingrese la edad del cliente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        return new Cliente(nombre, fechaNacimiento, run, rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad);
    }
    private static Profesional crearProfesional(Scanner scanner) {
        System.out.print("Ingrese el nombre del profesional: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento del profesional (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Ingrese el RUN del profesional: ");
        int run = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el título del profesional: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese la fecha de ingreso del profesional (DD/MM/AAAA): ");
        String fechaIngreso = scanner.nextLine();

        return new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);
    }

    private static Administrativo crearAdministrativo(Scanner scanner) {
        System.out.print("Ingrese el nombre del administrativo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento del administrativo (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Ingrese el RUN del administrativo: ");
        int run = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el área del administrativo: ");
        String area = scanner.nextLine();

        System.out.print("Ingrese la experiencia previa del administrativo: ");
        String experienciaPrevia = scanner.nextLine();

        return new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);
    }
    private static Capacitacion crearCapacitacion(Scanner scanner) {
        System.out.print("Ingrese el identificador de la capacitación: ");
        int identificador = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el RUT del cliente: ");
        int rutCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el día de la capacitación (ej: Lunes): ");
        String dia = scanner.nextLine();

        System.out.print("Ingrese la hora de la capacitación (HH:MM): ");
        String hora = scanner.nextLine();

        System.out.print("Ingrese el lugar de la capacitación: ");
        String lugar = scanner.nextLine();

        System.out.print("Ingrese la duración de la capacitación: ");
        String duracion = scanner.nextLine();

        System.out.print("Ingrese la cantidad de asistentes: ");
        int cantidadAsistentes = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        return new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
        
        
    }
    
    public static void mostrarDatosUsuario(Usuario usuario) {
    	usuario.toString();
    }
    
}
