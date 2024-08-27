## Integrantes: Rodrigo Rojas, Jorge Montoya, Ana Andrade, Carlos Quezada y Rodrigo Gonzáles.
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

El proyecto está compuesto por las siguientes interfaz y clases:

1. Clase Principal
	Clase principal que ejecuta un menú interactivo para realizar las operaciones sobre los usuarios y capacitaciones. contiene el método main()
	Aquí se inicializa una instancia de la clase Contenedor, y se proporciona un menú para interactuar con el sistema, permitiendo gestionar usuarios 
	y capacitaciones. Muestra menu principal.	
	Métodos auxiliares para crear instancias de cada tipo: crearCliente(); crearProfesional(); crearAdministrativo(); crearCapacitacion(); 
	metodo void mostrarDatosUsuario()

2. Interfaz Asesoria
	La interface Asesoria contiene el metodo analizarUsuario(), el cual ayuda a desplegar todas la info con respecto al usuario.
	la cual cumple con el servicio de Segregación de Interfaces, que define un único método, que es lo suficientemente específico para ser implementado 
	por cualquier clase que extienda de "Usuario".

3. Clase Usuario
	Se define una clase llamada "Usuario" que representa un usuario genérico, que implementa una interfaz llamada "Asesoria"
	
    Atributos:
        Nombre
        Fecha de nacimiento
        Run		
    Métodos:
	Método constructor con y sin parametros 
   	Métodos accesores (getters) y mutadores(setters) de cada atributo.
   	Método auxiliar para validar formato de fecha         
	Implementación del método de la interfaz Asesoria: analizarUsuario()		
	override del metodo toString
	
4. Clase Cliente (extiende Usuario)
	Esta clase hereda de Usuario y representa a un cliente de la empresa.

	Atributos:
		Nombre
		Fecha de nacimiento
		run
		rut
		nombres
		apellidos
		telefono
		afp
		sistemaSalud
		direccion
		comuna
		edad	
	Métodos:
		Métodos accesores (getters) y mutadores(setters)
		Métodos: obtenerNombre(); obtenerSistemaSalud()
		override del métodos: toString y analizarUsuario()
	
5. Clase Profesional (extiende Usuario)
	Esta clase hereda de Usuario y representa a un profesional que trabaja en la empresa.
	
	Atributos:
		Nombre
		Fecha de nacimiento
		run
		titulo
		fecha de ingreso

	Métodos:		
		Métodos Constructor con y sin parámetros
		Métodos accesores (getters) y mutadores(setters) 
		override del metodo toString y analizarUsuario()
	
6. Clase Administrativo (extiende Usuario)
	Esta clase hereda de Usuario y representa a un administrativo que trabaja en la empresa.
	
	Atributos:
		Nombre
		Fecha de nacimiento
		run
		area
		Experiencia previa	
	Métodos:
		Métodos Constructor con y sin parámetros
		Métodos getters y setter		
		override del metodo toString y analizarUsuario()
		
7. Clase Capacitación
	Esta clase representa una capacitación organizada por la empresa para los clientes.

	Atributos:
		Identificador
		RUT cliente
		Día
		Hora
		Lugar
		Duración
		Cantidad de asistentes
	
	Métodos:
		Métodos Constructor con y sin parámetros
		Métodos getters y setters
		Método mostrarDetalle()
		override del método toString
		
8. Clase Accidente
	Esta clase representa un accidente reportado en la empresa.
	
    Atributos:
        Identificador del accidente
        RUT Cliente
        Día
        Hora
        Lugar
        Origen
        Consecuencias		
   Métodos:	
	Métodos Constructor con y sin parámetros
	Métodos accesores (getters) y mutadores(setters)
	Método para formatear la hora obtenerHoraFormateada()
	override del método toString

9. Clase VisitaEnTerreno
	Esta clase representa una visita en terreno realizada por un profesional a un cliente.

    Atributos:
        Identificador de la visita
        RUT cliente
        Día
        Hora
        Lugar
        Comentarios
		
    Métodos:	
	Métodos Constructor con y sin parámetros
	Métodos accesores (getters) y mutadores(setters)
	override del método toString

10. Clase Revisión
	Esta clase representa una revisión realizada en el contexto de una visita en terreno.
	
    Atributos:
        Identificador de la revisión
        Identificador de la visita en terreno
        Nombre revisión
        Detalle
        Estado (sin problemas, con observaciones, no aprueba)		
    Métodos:	
	Métodos Constructor con y sin parámetros
	Métodos accesores (getters) y mutadores(setters)
	override del metodo toString
	Método para obtener una descripción legible del estado: obtenerEstadoDescripcion()  (Sin problemas, No aprueba, Con observaciones, Desconocido)

11. Clase Contenedor
	Esta clase actúa como un contenedor para almacenar y gestionar listas de usuarios (Asesoria) y capacitaciones (Capacitacion). Proporciona métodos
	para agregar, eliminar y listar usuarios y capacitaciones, así como para realizar búsquedas y filtros en general	
	
	Métodos:
		MétodoConstructor sin parámetros que inicializa las listas
				
		Método para almacenar un cliente: almacenarCliente()		
		Método para almacenar un usuario: almacenarUsuario() 
		Método para almacenar un profesional: almacenarProfesional()
		Método para almacenar un administrativo: almacenarAdministrativo	()	
		Método para almacenar una capacitación: almacenarCapacitación()
		Método para eliminar un usuario por su RUN: eliminarUsuario()
		Método para listar todos los usuarios: listarUsuarios()
		Método para listar usuarios por tipo: listarUsuariosPorTipo()
		Método para listar todas las capacitaciones junto con los datos del cliente asociado: listarCapacitaciones()

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
