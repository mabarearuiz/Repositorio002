package ejercicioRefactorizacion02;
import java.io.IOException;
import java.util.Scanner;

//01-Extraemos como variable local (Extract Local Variable...)
//02-Convertir variable local como atributo de clase (Convert Local variable to Field...)la iniciamos fuera del metodo main..
//03-Renombramos las variables cambiamos a=nombre, b=edad, c=curso
//04-Renombramos las otras variables de la funcion x1=nombre, x2=edad, x3=curso
//05-Extraemos metodo (Extract Method...)

public class PreguntasyRespuestasV2
{
	private static String preguntaNombre = "¿Cómo te llamas?";
	private static String preguntaEdad = "¿Cuántos años tienes?";
	private static String preguntaCurso = "¿En qué curso estás?";

	public static void main(String[] args) throws IOException
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(preguntaNombre);
		String nombre = teclado.nextLine();
		
		System.out.println(preguntaEdad);
		String edad = teclado.nextLine();
		
		System.out.println(preguntaCurso);
		String curso = teclado.nextLine();
		
		mensaje(nombre, edad, curso);
		
		teclado.close();
	}

	public static void mensaje(String nombre, String edad, String curso)
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}
}
