package ejercicioRepaso01;

public class Perro
{
	//Atributos
	private Raza raza;
	private double tamano;
	private int edad;
	private String color;

	// Constructor vacio o por defecto
	public Perro()
	{
		raza = new Raza();
		tamano = 0.0;
		edad = 0;
		color = "";
	}

	// Constructor parametros
	public Perro(Raza raza, double tamano, int edad, String color)
	{
		super();
		this.raza = raza;
		this.tamano = tamano;
		this.edad = edad;
		this.color = color;
	}
	
	// Metodos getter & setter
	public Raza getRaza()
	{
		return raza;
	}

	public void setRaza(Raza raza)
	{
		this.raza = raza;
	}

	public double getTamano()
	{
		return tamano;
	}

	public void setTamano(double tamano)
	{
		this.tamano = tamano;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

		//Metodo toString
	@Override
	public String toString()
	{
		return "Perro [raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + ", color=" + color + "]";
	}

}
