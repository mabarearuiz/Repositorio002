package ejercicioRepaso02;

import java.time.LocalDate;

public class Director
{
	//Atributos
	private String nombre;
	private String nacionalidad;
	private LocalDate fechaNacimento;
	


	// Constructor Vacio
	public Director()
	{
		nombre = "";
		fechaNacimento = LocalDate.of(1990, 3, 14);
		nacionalidad = "";
		// LocalDate.of dara fecha formato americano para cambiar a formato europeo...
		// DateTimeFormatter formatoEuropeo = DateTimeFormatter.ofPattern ("dd/MM/yyy")
		// DateTimeFormatter.ofPattern ("dd/MM/yyy")
	}

	// Constructor Parametros
	public Director(String nombre, LocalDate fechaNacimento, String nacionalidad)
	{
		this.nombre = nombre;
		this.fechaNacimento = fechaNacimento;
		this.nacionalidad = nacionalidad;
	}

	// Metodos getter & setter
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimento()
	{
		return fechaNacimento;
	}

	public void setFechaNacimento(LocalDate fechaNacimento)
	{
		this.fechaNacimento = fechaNacimento;
	}

	public String getNacionalidad()
	{
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString()
	{
		return "Director [nombre=" + nombre + ", fechaNacimento=" + fechaNacimento + ", nacionalidad=" + nacionalidad
				+ "]";
	}
}
