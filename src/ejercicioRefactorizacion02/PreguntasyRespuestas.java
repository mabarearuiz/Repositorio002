package ejercicioRefactorizacion02;

import java.io.IOException;
import java.util.Scanner;

public class PreguntasyRespuestas
{
	//02.2-convertimos la variable local que hemos creado y refactorizamos convertir variable local en campo
	//Se declara como atributo de clase inicie cuando se declara y se puede usra en toda la clase al declararla fuera del metodo main
	private static String preguntaNombre = "¿Cómo te llamas?";
	private static String preguntaEdad = "¿Cuántos años tienes?";
	private static String preguntaCurso = "¿En qué curso estás?";
	
	public static void main(String[] args) throws IOException 
	
	{
		Scanner teclado = new Scanner(System.in);
		
		//01-aplicamos refactorizacion extraer variable local
		//02.1-convertimos la variable local que hemos creado y refactorizamos convertir variable local en campo 
		//3.1- Renombramos a = nombre, b=edad, c=curso
		//4- Extraemos metodo
		String nombre = preguntaNombreUsuario(teclado);
		//esto es antes de refactorizacion extraer metodo
		//System.out.println(preguntaNombre);
		//String nombre = teclado.nextLine();
		
		
		String edad = preguntaEdadUsuario(teclado);
		
		String curso = preguntaCursoUsuario(teclado);
		
		mensaje(nombre, edad, curso);
//para llamarlo desde otra parte del programa tendriamos que llamarlo con su clase "Ejercicio02PreguntasyRespuestas.mensaje"
		teclado.close();

	}
	public static String preguntaCursoUsuario(Scanner teclado)
	{
		System.out.println(preguntaCurso);
		String curso = teclado.nextLine();
		return curso;
	}
	public static String preguntaEdadUsuario(Scanner teclado)
	{
		System.out.println(preguntaEdad);
		String edad = teclado.nextLine();
		return edad;
	}
	public static String preguntaNombreUsuario(Scanner teclado)
	{
		System.out.println(preguntaNombre);
		String nombre = teclado.nextLine();
		return nombre;
	}
	//Al ser static lo podemos llamar directamente
	
	//3.2- Renombramos x1 = nombre, x2=edad, x3=curso
	public static void mensaje(String nombre, String edad, String curso)
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}
}
