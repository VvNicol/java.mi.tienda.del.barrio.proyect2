/**
 * 
 */
package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import controlador.Inicio;

/**
 * Utilidades
 * 
 * @author nrojlla 081024
 */
public class util {
	static Scanner sc = new Scanner(System.in);

	/**
	 * Calcula el id auto del ventas
	 * 
	 * @author nrojlla
	 * @return long
	 */
	public static long CalculoId() {

		long nuevoId = 0;
		int tamanioLista = Inicio.VentaLista.size();

		if (tamanioLista > 0) {

			nuevoId = Inicio.VentaLista.get(tamanioLista - 1).getIdVenta() + 1;

		} else {
			nuevoId = 1;
		}

		return nuevoId;
	}

	public static long CalculoIdPedido() {

		long nuevoId = 0;
		int tamanioLista = Inicio.PedidoLista.size();

		if (tamanioLista > 0) {

			nuevoId = Inicio.PedidoLista.get(tamanioLista - 1).getIdPedido() + 1;

		} else {
			nuevoId = 1;
		}

		return nuevoId;
	}

	public static LocalDate SolicitarFecha() {

		LocalDate fechaDate = null;
		boolean esValido = false;
		do {
			try {
				System.out.println("Ingrese fecha (dd-mm-yyyy):");
				String fecha = sc.nextLine();

				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				fechaDate = LocalDate.parse(fecha, formato);
				esValido = true;
			} catch (DateTimeParseException e) {
				System.out.println("Formato de fecha inválido. Intente de nuevo.");
			}
		} while (!esValido);
		return fechaDate;
	}

}
