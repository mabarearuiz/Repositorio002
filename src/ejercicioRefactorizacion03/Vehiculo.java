package ejercicioRefactorizacion03;

public class Vehiculo
{

	protected String matricula;
	protected int numeroRuedas;

	public Vehiculo()
	{
		// quitamos este "super()" que ha creado eclipse y creamos el constructor vacio
		matricula = "";
		numeroRuedas = 0;
	}

	public Vehiculo(String matricula, int numeroRuedas)
	{
		super();
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
	}

	public String getMatricula()
	{
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public int getNumeroRuedas()
	{
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas)
	{
		this.numeroRuedas = numeroRuedas;
	}

}