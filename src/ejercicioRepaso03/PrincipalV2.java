package ejercicioRepaso03;

//Se importan dos paquetes de Java: java.time.LocalDateTime y java.time.format.DateTimeFormatter.
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class PrincipalV2
{
	// Se define la clase Principal, que contiene el m�todo main.
	public static void main(String[] args)
	{
		// Dentro del m�todo main, se crea un objeto LocalDateTime llamado "now" que
		// contiene la fecha y hora actual.
		LocalDateTime now = LocalDateTime.now();

		// Se crea un objeto DateTimeFormatter llamado "formatter" con un patr�n de
		// formato espec�fico (dd-MM-yyyy HH:mm:ss)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		// Ahora el string llamado formatDateTime tomar� el formato dado anteriormente.
		String formatDateTime = now.format(formatter);

		Pedido pedido1 = new Pedido(LocalDateTime.now(), "PED-01");
		Pedido pedido2 = new Pedido(LocalDateTime.now(), "PED-02");

		Factura factura1 = new Factura(1, "Fac-01", pedido1);
		Factura factura2 = new Factura(2, "Fac-02", pedido2);

		System.out.println("La factura con id: " + factura1.getIdFactura() + " y n�mero: " + factura1.getNumeroFactura()
				+ " est� asociada al Pedido de referencia: " + factura1.getPedido().getReferencia()
				+ " emitido con fecha: " + formatDateTime);

		System.out.println("La factura con id: " + factura2.getIdFactura() + " y n�mero: " + factura2.getNumeroFactura()
				+ " est� asociada al Pedido de referencia: " + factura2.getPedido().getReferencia()
				+ " emitido con fecha: " + formatDateTime);

		// En vez de llamar a la fecha y hora desde la clase POJO
		// "factura1.getPedido().getFecha()", lo hemos concatenado con el formatDateTime.
	}
}
