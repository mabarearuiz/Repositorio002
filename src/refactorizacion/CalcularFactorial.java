package refactorizacion;

public class CalcularFactorial
{

	public static void main(String[] args)
	{
		int numero = 10;
		calcularFactorial(numero);

	}

	public static void calcularFactorial(int numero)
	{
		int contador = 1; // Seleccionamos desde esta l�nea
		double resultado = 1;
		while (contador <= numero)
		{
			resultado = resultado * contador;
			contador++;
		}
		System.out.println(resultado);
	}

}
