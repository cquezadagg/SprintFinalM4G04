# Integrantes: Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzáles.
## Sistema de Gestión de Consultoría
Este proyecto es un sistema de gestión para una empresa de consultoría de riesgos. El sistema permite gestionar diferentes tipos de usuarios (Clientes, Profesionales, Administrativos) y llevar un registro detallado de sus actividades y datos relacionados, como capacitaciones, accidentes, visitas en terreno  y revisiones.
El sistema está desarrollado en Java y está diseñado para facilitar la administración y análisis de datos a través de un menú interactivo en la consola.
## Contexto
En la última década, han aumentado los índices de accidentabilidad, especialmente en las empresas del rubro industrial, minero y construcción.
Para dar cumplimiento a la normativa y mantener ambientes de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría profesional, lo cual representa un costo elevado y fomenta la disminución o la no implementación de medidas necesarias para la seguridad.
Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos laborales y necesita una solución tecnológica que ayude a administrar los procesos que se deben ejecutar en cada una de las empresas que son clientes de la compañía.
Este servicio finalmente pretende ofrecer una solución completa en prevención de riesgos para las empresas a un costo razonable, cumpliendo estrictamente todos los procesos necesarios para dar cumplimiento a la normativa vigente, mejorando los ambientes de trabajo, la productividad, contribuyendo a un ahorro económico.
## Problema
La empresa no posee un sistema de información que le permita administrar toda la cantidad de información que se genera, ni controlar las actividades y el recurso humano.
Existen problemas con la planificación de las visitas, generalmente los profesionales están en terreno por lo que no están disponibles para informarles sus actividades futuras.
No existe registro del profesional que ha estado con mayor actividad ni se sabe dónde está cada uno.
Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el cliente. Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la ejecución de la capacitación, lo que trae consigo multas para la empresa, etc.
## Solucion
Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información para la empresa y sus clientes.
El sistema debe permitir la planificación de actividades y el control de ejecución de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales y los clientes para la respuesta temprana ante incidentes de seguridad.
Además, se requiere que el sistema genere reportes y estadísticas que ayuden a tomar de decisiones y mejorar el rendimiento de la empresa, considerando la carga laboral, y la demanda de clientes y las actividades que cada uno involucra para el cumplimiento de los contratos.
Es imprescindible, mantener comunicación con los profesionales en todo momento, aún en terreno, y darle la posibilidad de realizar todas sus actividades aun no teniendo conectividad (internet), ya que muchas empresas se encuentran en zonas donde no hay conexión de ese tipo.
## Caracteristicas
- Permite gestionar usuarios y sus tres tipos: Cliente, Profesional y Administrativo.
- Permite la gestion de capacitaciones.
- Intuitiva y facil de utilizar.
- Permite reingresar informacion erronea.

El proyecto está compuesto por las siguientes clases:
1. Usuario
Clase abstracta que sirve como base para las clases Cliente, Profesional, y Administrativo.
Atributos:
    Nombre
    Fecha de nacimiento
    RUN
Métodos:
    mostrarEdad()
    analizarUsuario()

2. Cliente (extiende Usuario)
Atributos:
    RUT
    Nombres
    Apellidos
    Teléfono
    AFP
    Sistema de salud (Fonasa o Isapre)
    Dirección
    Comuna
    Edad
Métodos:
    obtenerNombre()
    obtenerSistemaSalud()
    analizarUsuario()

3. Profesional (extiende Usuario)
Atributos:
		Título
		Fecha de ingreso
Métodos:
		analizarUsuario()
	
4. Administrativo (extiende Usuario)
Atributos:
		Área
		Experiencia previa
Métodos:
		analizarUsuario()
	
5. Capacitación
Atributos:
		Identificador
		RUT cliente
		Día
		Hora
		Lugar
		Duración
		Cantidad de asistentes
Métodos:
		mostrarDetalle()
	
6. Accidente
Atributos:
    Identificador del accidente
   RUT Cliente
    Día
    Hora
    Lugar
    Origen
   Consecuencias
		
7. VisitaEnTerreno
Atributos:
   Identificador de la visita
   RUT cliente
   Día
   Hora
   Lugar
   Comentarios
		
8. Revisión
Atributos:
   Identificador de la revisión
   Identificador de la visita en terreno
    Nombre alusivo a la revisión
   Detalle para revisar
    Estado (sin problemas, con observaciones, no aprueba)
		
9. Contenedor
Gestiona listas de usuarios y capacitaciones.
Métodos:
		almacenarCliente()
		almacenarProfesional()
		almacenarAdministrativo()
		almacenarCapacitación()
		eliminarUsuario()
		listarUsuarios()
		listarUsuariosPorTipo()
		listarCapacitaciones()
		
10. Principal

	Clase principal que ejecuta un menú interactivo para realizar las operaciones sobre los usuarios y capacitaciones.
## Instalación
1. Accede al repositorio con este link:
   Puedes encontrar el repositorio [aquí](https://github.com/cquezadagg/SprintFinalM4G04)
3. Clona el repositorio en tu máquina local:
   https://github.com/cquezadagg/SprintFinalM4G04.git
4. Navega hasta el directorio del proyecto.
5. Importa el proyecto dentro del IDE que utilizaras.
## Uso
Para ejecutar este proyecto, necesitarás tener instalado lo siguiente:
- Java Development Kit (JDK) 8 o superior.
- IDE o editor de texto compatible con Java.
- Git (para manejo del repositorio).
  
1. Compilación:
Compila todas las clases utilizando un IDE como IntelliJ IDEA, Eclipse, o desde la línea de comandos con javac.
	
2. Ejecución:
Ejecuta la clase Principal para iniciar el programa. Se mostrará un menú en la consola con las opciones disponibles para interactuar con el sistema.
		
3. Operaciones:
Almacenar Cliente/Profesional/Administrativo: Ingresa los datos requeridos para cada tipo de usuario.
Almacenar Capacitación: Registra una nueva capacitación asociada a un cliente.
Eliminar Usuario: Elimina un usuario de la lista de asesorías basado en su RUN.
Listar Usuarios: Muestra todos los usuarios registrados.
Listar Usuarios por Tipo: Filtra los usuarios por su tipo.
Listar Capacitaciones: Muestra todas las capacitaciones registradas junto con los datos del cliente correspondiente.
Salir: Termina la ejecución del programa.
## Tecnologías Utilizadas
- Java.
