package refactorizacion;

public class Ejemplo02
{
	public static void main (String [] args) 
	{
		int numero = 3;
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
	}
	public static double calcularFactorial(double n) 
	//Al ser estatica "STATIC" nos permite llamarla directamente por su nombre..
	{
		if (n == 0) {
			return 1;
		} else {
			//El factorial de un numero es la multiplicacion desde ese numero hasta "1"
			//Ejemplo Factorial 4 = 4*3*2*1 = 24 
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
}
