package main;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
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
        int option;

        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Almacenar cliente");
            System.out.println("2. Almacenar profesional");
            System.out.println("3. Almacenar administrativo");
            System.out.println("4. Almacenar capacitación");
            System.out.println("5. Eliminar usuario");
            System.out.println("6. Listar usuarios");
            System.out.println("7. Listar usuarios por tipo");
            System.out.println("8. Listar capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    // Almacenar cliente
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
                    String fechaNacimiento = scanner.nextLine();

                    System.out.print("RUN (número): ");
                    int run = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("RUT: ");
                    int rut = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("Nombres: ");
                    String nombres = scanner.nextLine();

                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    System.out.print("AFP: ");
                    String afp = scanner.nextLine();

                    System.out.print("Sistema de salud (1 para Fonasa, 2 para Isapre): ");
                    int sistemaSalud = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();

                    System.out.print("Comuna: ");
                    String comuna = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Cliente cliente = new Cliente(nombre, fechaNacimiento, run, rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad);
                    contenedor.almacenarUsuario(cliente);
                    break;

                case 2:
                    // Almacenar profesional
                    System.out.print("Nombre: ");
                    String nombreProf = scanner.nextLine();

                    System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
                    String fechaNacimientoProf = scanner.nextLine();

                    System.out.print("RUN (número): ");
                    int runProf = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Fecha de ingreso (DD/MM/AAAA): ");
                    String fechaIngreso = scanner.nextLine();

                    Profesional profesional = new Profesional(nombreProf, fechaNacimientoProf, runProf, titulo, fechaIngreso);
                    contenedor.almacenarUsuario(profesional);
                    break;

                case 3:
                    // Almacenar administrativo
                    System.out.print("Nombre: ");
                    String nombreAdmin = scanner.nextLine();

                    System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
                    String fechaNacimientoAdmin = scanner.nextLine();

                    System.out.print("RUN (número): ");
                    int runAdmin = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("Área: ");
                    String area = scanner.nextLine();

                    System.out.print("Experiencia previa: ");
                    String experienciaPrevia = scanner.nextLine();

                    Administrativo administrativo = new Administrativo(nombreAdmin, fechaNacimientoAdmin, runAdmin, area, experienciaPrevia);
                    contenedor.almacenarUsuario(administrativo);
                    break;

                case 4:
                    // Almacenar capacitación
                    System.out.print("Identificador: ");
                    int identificador = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("RUT Cliente: ");
                    int rutCliente = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("Día (lunes a domingo): ");
                    String dia = scanner.nextLine();

                    System.out.print("Hora (HH:MM): ");
                    String hora = scanner.nextLine();

                    System.out.print("Lugar: ");
                    String lugar = scanner.nextLine();

                    System.out.print("Duración: ");
                    String duracion = scanner.nextLine();

                    System.out.print("Cantidad de asistentes: ");
                    int cantidadAsistentes = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Capacitacion capacitacion = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
                    contenedor.almacenarCapacitacion(capacitacion);
                    break;

                case 5:
                    // Eliminar usuario
                    System.out.print("RUN del usuario a eliminar: ");
                    int runEliminar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    contenedor.eliminarUsuario(runEliminar);
                    break;

                case 6:
                    // Listar usuarios
                    contenedor.listarUsuarios();
                    break;

                case 7:
                    // Listar usuarios por tipo
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
                    // Listar capacitaciones
                    contenedor.listarCapacitaciones();
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (option != 9);

        scanner.close();
    }
}
