package ejercicioRefactorizacion02;
import java.io.IOException;
import java.util.Scanner;


//01-Extraemos variables como constantes
//02-Renombramos a= nombre, b=edad, c=curso x1=nombre x2=edad x3=curso
//03-Extraemos metodo para la respuesta del usuario
//04-Extraemos metodo para preguntar... tenemos que modificar para poderlo usar 

public class PreguntasyRespuestasV3
{
	private static final String EN_QUE_CURSO_ESTAS = "¿En qué curso estás?";
	private static final String CUANTOS_ANOS_TIENES = "¿Cuántos años tienes?";
	private static final String COMO_TE_LLAMAS = "¿Cómo te llamas?";

	public static void main(String[] args) throws IOException
	{
		Scanner teclado = new Scanner(System.in);
		
		preguntar(COMO_TE_LLAMAS);
		String nombre = responder(teclado);
		
		preguntar(CUANTOS_ANOS_TIENES);
		String edad = responder(teclado);
		
		preguntar(EN_QUE_CURSO_ESTAS);
		String curso = responder(teclado);
		
		mensaje(nombre, edad, curso);
		teclado.close();
	}

	public static void preguntar(String pregunta)
	{
		System.out.println(pregunta);
	}

	public static String responder(Scanner teclado)
	{
		return teclado.nextLine();
	}

	public static void mensaje(String nombre, String edad, String curso)
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}
}
