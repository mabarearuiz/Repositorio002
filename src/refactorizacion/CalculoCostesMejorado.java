package refactorizacion;

public class CalculoCostesMejorado
{
	//Al refactorizar apararece esta nueva linea.. "private static final int SUELDO_TRABAJADORES = 1200"
private static final int SUELDO_TRABAJADORES = 1200;
//Si ahora quisieramos cambiar el msueldo basta con cambiar solo en la variable "SUELDO_TRABAJADORES = 1200"

	public static void main(String[] args)
	{
		costeTrabajadores(50);

		System.out.println(costeTrabajadores(50));
	}		
	public static double costeTrabajadores(int numeroTrabajadores)
	{
		//ORIGINALMENTE SERIA ASI: "return 1200*numeroTrabajadores;"
		//Cuando refactorizamos nos cambia a lo siguiente...
		return SUELDO_TRABAJADORES*numeroTrabajadores;
	}
}
