package ejercicioRepaso01;

public class Raza
{
	//Atributos
	private String nombreRaza;

	//Constructor Vacio
	public Raza()
	{
		nombreRaza="";
	}
	
	//Constructor parametros
	public Raza(String nombreRaza)
	{
		super();
		this.nombreRaza = nombreRaza;
	}

	// Metodos getter & setter
	public String getNombreRaza()
	{
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	@Override
	public String toString()
	{
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}
}
