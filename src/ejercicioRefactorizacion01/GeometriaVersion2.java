package ejercicioRefactorizacion01;

public class GeometriaVersion2
{
	private static final double PI = 3.14;

	public static void main(String[] args)
	{
		int radio = 13; // radio del círculo;
		
		Ejercicio01GeometriaVersion2 g = new Ejercicio01GeometriaVersion2 ();
		g.areaCirculo(radio);

		longitudCircunferencia(radio);

		areaCirculo(radio);
		Geometria.longitud
		g.areaCirculo (radio);
		
		

	}

	public void areaCirculo(int radio)
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


