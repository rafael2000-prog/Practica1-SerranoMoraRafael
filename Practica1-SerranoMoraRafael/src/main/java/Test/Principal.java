package Test;

import Clase.*;
import java.util.Scanner;

public class Principal {
	//Creacion y prueba de instancias de objetos en el metodo main
	public static void main (String[]args) {
		
		//Uso de la clase Scanner
		Scanner escan = new Scanner(System.in);
		
		int x = 1;
		
		while (x!=4) 
		{
			//Mostrar Menu
			System.out.println("MENU");
			System.out.println("1.Ingreasar datos Profesor");
			System.out.println("2.Ingresar datos Estudiante");
			System.out.println("3.Ingresar datos Asignatura");
			System.out.println("4.Salir");
			System.out.println("Ingresar opcion: ");
			x = escan.nextInt();
			
			if (x==1) 
			{
				//Bucle para solicitar datos Profesor
				Profesor[] personas = new Profesor[3];
				for (int i=0;i<3;i++) 
				{
					personas[i] = new Profesor();
					//Solicitud al usuario los datos
					System.out.println("Profesor");
					System.out.println("Ingresar nombre: ");
					String nombreProfesor = escan.next();
					System.out.println("Ingresar edad: ");
					int edadProfesor = escan.nextInt();
					System.out.println("Ingresar identificacion: ");
					String identificacionProfesor = escan.next();
					System.out.println("Ingresar conocimiento: ");
					String conocimientoProfesor = escan.next();
					System.out.println("Ingresar especialidad: ");
					String especialidadProfesor = escan.next();
					
					//Instanciar la clase
					personas[i].setNombre(nombreProfesor);
					personas[i].setEdad(edadProfesor);
					personas[i].setIdentificacion(identificacionProfesor);
					personas[i].setConocimiento(conocimientoProfesor);
					personas[i].setEspecialidad(especialidadProfesor);
				}
			
				for (int i=0;i<3;i++) {
					//Impresion de datos
					System.out.println(personas[i].toString());
				}
			}
			
			if (x==2) 
			{
				//Bucle para solicitar datos de asignatura
				Estudiante[] personasUno = new Estudiante[3];
				for (int i=0;i<3;i++) 
				{
				personasUno[i] = new Estudiante();
				//Solicitud al usuario los datos
				System.out.println("Estudiante");
				System.out.println("Ingresar nombre: ");
				String nombreProfesor = escan.next();
				System.out.println("Ingresar edad: ");
				int edadProfesor = escan.nextInt();
				System.out.println("Ingresar identificacion: ");
				String identificacionProfesor = escan.next();
							
				//Instanciar la clase
				personasUno[i].setNombre(nombreProfesor);
				personasUno[i].setEdad(edadProfesor);
				personasUno[i].setIdentificacion(identificacionProfesor);
				}
				for (int i=0;i<3;i++) {
				//Impresion de datos
				System.out.println(personasUno[i].toString());
				}
			}
			
			if(x==3) 
			{
				//Bucle para solicitar datos Asignatura
				Asignatura[] asignaturaUno = new Asignatura[3];
				for (int i=0;i<3;i++) 
				{
				asignaturaUno[i] = new Asignatura();
				//Solicitud al usuario los datos
				System.out.println("Asignatura");
				System.out.println("Ingresar nombre: ");
				String nombreAsignatura = escan.next();
				System.out.println("Ingresar codigo: ");
				String codigoAsignatura = escan.next();
							
				//Instanciar la clase
				asignaturaUno[i].setNombre(nombreAsignatura);
				asignaturaUno[i].setCodigo(codigoAsignatura);
				}
				for (int i=0;i<3;i++) {
				//Impresion de datos
				System.out.println(asignaturaUno[i].toString());
				}
			}
		}	
	}
}
