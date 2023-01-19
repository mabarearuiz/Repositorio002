package refactorizacion;

public class CalculoCostesVersion3
//En este caso tenemos en cuenta que el suledo sea un "double"
{

	private static final double SUELDO_TRABAJADOR = 1200.0;
	public static void main(String[] args)
	{
		costeTrabajadores(50);

		System.out.println(costeTrabajadores(50));
	}		
	public static double costeTrabajadores(int numeroTrabajadores)
	{
		return SUELDO_TRABAJADOR*numeroTrabajadores;
	}
}
