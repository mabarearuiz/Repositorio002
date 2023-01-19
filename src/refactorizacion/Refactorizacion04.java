package refactorizacion;

public class Refactorizacion04
//Extraemos Variable LOCAL "El factorial de " se convierte en "mensaje"... es en minuscula porque es una variable
//extraemos variable LOCAL " es " como "es"
{
	private static String mensaje;

	public static void main(String[] args)
	{
		int numero = 3;
		
		mensaje = "El factorial de ";
		String es = " es ";
		
		System.out.println(mensaje + numero + es + calcularFactorial(numero));
		numero = 5;
		System.out.println(mensaje + numero + es + calcularFactorial(numero));
	}
	public static double calcularFactorial(double n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
}
