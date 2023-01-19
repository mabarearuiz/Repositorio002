package ejercicioRefactorizacion03;

public class Coche
//vamos a extraer y una superclase
		extends Vehiculo

//01-Extraemos una Clase que sea Conductor para los atributos nombreConductor y carnetConductor
//02-Extraemos una Superclase Vehiculo porque coche y motos tienen atributos iguales (matricula y  numeroRuedas)
{
	private Conductor conductor = new Conductor();

	// Constructor vacio
	public Coche()
	{
		super();
		// tendriamos que eliminar esta linea que ya estaria incluido en el super
		// "matricula = "";"
		conductor.setNombreConductor("");
		conductor.setCarnetConductor("");
		// tendriamos que eliminar esta linea que ya estaria incluido en el super
		// "setNumeroRuedas(4);"
	}

	// Constructor por parametros
	public Coche(String matricula, String nombreConductor, String carnetConductor, int numeroRuedas)
	{
		// rellenamos los valores para el "super()" que se habia creado
		// vacio..."super()";
		super(matricula, numeroRuedas);
		// tendriamos que eliminar esta linea que ya estaria incluido en el super
		// "this.matricula = matricula;"
		this.conductor.setNombreConductor(nombreConductor);
		this.conductor.setCarnetConductor(carnetConductor);
		// tendriamos que eliminar esta linea que ya estaria incluido en el super
		// "this.numeroRuedas = numeroRuedas;"
	}

	public String getNombreConductor()
	{
		return conductor.getNombreConductor();
	}

	public void setNombreConductor(String nombreConductor)
	{
		this.conductor.setNombreConductor(nombreConductor);
	}

	public String getCarnetConductor()
	{
		return conductor.getCarnetConductor();
	}

	public void setCarnetConductor(String carnetConductor)
	{
		this.conductor.setCarnetConductor(carnetConductor);
	}

//esto lo ha generado Eclipse...
	public String getDetalles()
	{
		// return "Coche [matricula=" + matricula + ", nombreConductor=" +
		// conductor.getNombreConductor() + ", carnetConductor="
		// + conductor.getCarnetConductor() + "]";

		return "Coche [matricula=" + matricula + ", nombreConductor=" + conductor.getNombreConductor()
				+ ", carnetConductor=" + conductor.getCarnetConductor() + "]";

	}
}
