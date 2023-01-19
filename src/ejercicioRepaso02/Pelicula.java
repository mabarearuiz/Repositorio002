package ejercicioRepaso02;

public class Pelicula
{
	// Atributos
	private String titulo;
	private int anio;
	private String duracion;
	private Director director;

	// Constructor vacio o por defecto
	public Pelicula()
	{
		titulo = "";
		anio = 0;
		duracion = "";
		director = new Director();
	}

	// Constructor Parametros
	public Pelicula(String titulo, int anio, String duracion, Director director)
	{
		super();
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
		this.director = director;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public int getAnio()
	{
		return anio;
	}

	public void setAnio(int anio)
	{
		this.anio = anio;
	}

	public String getDuracion()
	{
		return duracion;
	}

	public void setDuracion(String duracion)
	{
		this.duracion = duracion;
	}

	public Director getDirector()
	{
		return director;
	}

	public void setDirector(Director director)
	{
		this.director = director;
	}

	@Override
	public String toString()
	{
		return "Pelicula [titulo=" + titulo + ", anio=" + anio + ", duracion=" + duracion + ", director=" + director
				+ "]";
	}
}
