/**
 * 
 */
package util;

import controlador.Inicio;

/**
 * Utilidades
 * 
 * @author nrojlla 081024
 */
public class util {

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

			nuevoId = Inicio.PedidoLista.get(tamanioLista - 1).getIdPedido()+ 1;

		} else {
			nuevoId = 1;
		}

		return nuevoId;
	}

}
