package ejercicioRefactorizacion03;

public class Conductor
{
	private String nombreConductor;
	private String carnetConductor;

	public Conductor()
	{
		// iniciamos los valores para constructor vacio que ha creado Eclipse
		nombreConductor = "";
		carnetConductor = "";
	}

	// Creamos constructor por parametros y lo iniciamos con sus valores
	public Conductor(String nombreConductor, String carnetConductor)
	{
		this.nombreConductor = nombreConductor;
		this.carnetConductor = carnetConductor;
	}

	// Metodos get y set
	public String getNombreConductor()
	{
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor)
	{
		this.nombreConductor = nombreConductor;
	}

	public String getCarnetConductor()
	{
		return carnetConductor;
	}

	public void setCarnetConductor(String carnetConductor)
	{
		this.carnetConductor = carnetConductor;
	}
}