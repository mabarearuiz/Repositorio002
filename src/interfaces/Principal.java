package interfaces;

public class Principal
{

	public static void main(String[] args)
	{
		Acumulador acumulador1 = new Acumulador (10);
		acumulador1.incremento(15);
		
		System.out.println(acumulador1.getValor());
		
		acumulador1.setPrecision(12);
		acumulador1.setMaximo(50);
		acumulador1.setValor(INumerico.NUMERO_E);
		acumulador1.setValor(IConstantes.VALOR_MAXIMO);
		acumulador1.setValor(IConstantes.VALOR_MINIMO);
		
		// No podemos hacer esto: "IModificacion acumulador2 = new IModificacion();"
		// Tenemos que construir el elemento con la clase NO con el Interfaz
		// Las interfaces NO tienen Constructores
		
		IModificacion acumulador2 = new Acumulador (12);
		//Esto seria "Polimorfismo" porque usamos datos de tipos diferentes		
		acumulador2.incremento(24);
		
		
		INumerico acumulador3 = new Acumulador (24);
		acumulador3.setPrecision(10);		
		acumulador3.setMaximo(100);
		
		//IConstantes acumulador4 = new Acumulador (10);
		//acumulador4.VALOR_MAXIMO;
		IConstantes acumulador4 = new Acumulador (10);
				
	}
}
