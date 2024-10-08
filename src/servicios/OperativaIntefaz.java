/**
 * 
 */
package servicios;

import java.io.IOException;

/**
 * Lista de motodos de la operativa
 * 
 * @author nrojlla 081024
 */
public interface OperativaIntefaz {

	/**
	 * Calculo de las ventas diarias
	 * 
	 * @throws IOException
	 * @author nrojlla 081024
	 */
	void CalculoDiario() throws IOException;

	/**
	 * Agregar una venta
	 * 
	 * @throws IOException
	 * @author nrojlla 081024
	 */
	void AgregarVenta() throws IOException;

}
