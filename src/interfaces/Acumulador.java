package interfaces;
	//implementamos el interfaz IModificacion
	//da error "The type Acumulador must implement the inherited abstract method IModificacion.incremento(int)"
public class Acumulador implements IModificacion,INumerico,IConstantes
{
	//corregimos el error "add implements methods"
	//nos generara lo que tienen que hacer los metodos
	
	private int valor;
	
	public Acumulador (int i)
	{
		valor = i;
	}
	
	public int getValor()
	{
		return valor;
	}

	public void setValor(int valor)
	{
		this.valor = valor;
	}

	@Override
	public void incremento(int a)
	{	
		valor = valor + a;
		//se puede poner tb asi: valor += a; 
	}

	@Override
	public void setPrecision(int p)
	{
		valor = p;		
	}

	@Override
	public void setMaximo(int m)
	{
		
		valor= m;
	}

}
