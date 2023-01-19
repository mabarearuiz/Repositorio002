package refactorizacion;

public class Refactorizacion03
//Extraer una CADENA como constante o como variable local
//Hemos extraido "El factorial de " como constante y lo denominamos "TEXTO"...debemos ponerlo en Mayusculas
//Extraemos tb " es "..
{
	private static final String ES = " es ";
	//Tiene el atributo "final" por que es una constante NO una variable
	private static final String TEXTO = "El factorial de ";
	public static void main (String [] args) 
	{
	int numero = 3;
	System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
	numero = 5;
	System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
	}
	public static double calcularFactorial(double n) 
		{
		if (n == 0) 
		{
			return 1;
		} 	
		else 
		{
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
}
