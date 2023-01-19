package ejercicioRepaso04;

public class Departamento
{
	private int idDepartamento;
	private String nombreDepartamento;
	private CentroTrabajo centroTrabajo;

	public Departamento()
	{
		idDepartamento = 0;
		nombreDepartamento = "";
		centroTrabajo = new CentroTrabajo();
	}

	public Departamento(String nombreDepartamento, CentroTrabajo centroTrabajo)
	{
		super();
		this.nombreDepartamento = nombreDepartamento;
		this.centroTrabajo = centroTrabajo;
	}

	public Departamento(int idDepartamento, String nombreDepartamento, CentroTrabajo centroTrabajo)
	{
		this.idDepartamento = idDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.centroTrabajo = centroTrabajo;
	}

	public int getIdDepartamento()
	{
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento)
	{
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento()
	{
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento)
	{
		this.nombreDepartamento = nombreDepartamento;
	}

	public CentroTrabajo getCentroTrabajo()
	{
		return centroTrabajo;
	}

	public void setCentroTrabajo(CentroTrabajo centroTrabajo)
	{
		this.centroTrabajo = centroTrabajo;
	}

	@Override
	public String toString()
	{
		return "Departamento [idDepartamento=" + idDepartamento + ", nombreDepartamento=" + nombreDepartamento
				+ ", centroTrabajo=" + centroTrabajo + "]";
	}

}
