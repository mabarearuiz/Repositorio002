package refactorizacion;

public class CalculoCostes
{

	public static void main(String[] args)
	{
		costeTrabajadores(50);

		System.out.println(costeTrabajadores(50));
	}		
	public static double costeTrabajadores(int numeroTrabajadores)
	{
		return 1200.5*numeroTrabajadores;
	}	
}
