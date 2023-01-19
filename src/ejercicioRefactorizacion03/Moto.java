package ejercicioRefactorizacion03;

public class Moto
//02-Extraemos una Superclase porque coche y motos tienen atributos iguales (matricula y  numeroRuedas)
		extends Vehiculo
{
	// tendriamos que eliminar esta linea que ya estaria incluido en el super
	// private "String matricula;"
	// tendriamos que eliminar esta linea que ya estaria incluido en el super
	// private "int numeroRuedas;"
	private String cilindrada;

	// Constructor vacio
	public Moto()
	{
		super();
		// tendriamos que eliminar esta linea que ya estaria incluido en el super
		// "this.setMatricula("");"
		// tendriamos que eliminar esta linea que ya estaria incluido en el super
		// "this.setNumeroRuedas(2);"
		this.cilindrada = "";
	}

	// Constructor por parametros
	public Moto(String matricula, int numeroRuedas, String cilindrada)
	{
		super(matricula, numeroRuedas);
		// tendriamos que eliminar esta linea que ya estaria incluido en el super
		// "this.setMatricula(matricula);"
		// tendriamos que eliminar esta linea que ya estaria incluido en el super
		// "this.setNumeroRuedas(numeroRuedas);"
		this.cilindrada = cilindrada;
	}

	public String getCilindrada()
	{
		return cilindrada;
	}

	public void setCilindrada(String cilindrada)
	{
		this.cilindrada = cilindrada;
	}
}
