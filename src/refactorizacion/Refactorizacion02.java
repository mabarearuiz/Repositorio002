package refactorizacion;

public class Refactorizacion02
{
	private static int numero;
	public static void main (String [] args) 
	{
		//No lo hemos implementado en ninguna parte y usamos el constructor por defecto que nos da Java
		//El constructor por defecto = Constructor VACIO
		//Podemos llamar a la funcion directamente por su nombre "Refactorizacion"

		Refactorizacion02 refactor = new Refactorizacion02();

		numero = 3;
		//Es una variable LOCAL, declarada e iniciada en el main...solo la podemos usa aqui..
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
		numero=5;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
	}
	public  double calcularFactorial(double n) 
	{
		//Ahora podemos usar aqui tb la variable "numero" 
		numero=10;
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
