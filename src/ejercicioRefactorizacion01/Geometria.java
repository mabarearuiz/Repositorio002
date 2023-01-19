package ejercicioRefactorizacion01;

public class Geometria
{

	private static final double PI = 3.14;

	public static void main(String[] args)
	{
		int radio = 13; // radio del círculo;

		longitudCircunferencia(radio);

		areaCirculo(radio);

	}

	public static void areaCirculo(int radio)
	//al ser static se puede llamar sin tener que declarar un objeto de la clase 
	{
		double area = PI * radio * radio;
		System.out.println("La superficie del círculo es " + area);
	}

	public static void longitudCircunferencia(int radio)
	{
		double longitud = 2 * PI * radio;
		System.out.println("El perímetro del círculo es " + longitud);
	}

}
