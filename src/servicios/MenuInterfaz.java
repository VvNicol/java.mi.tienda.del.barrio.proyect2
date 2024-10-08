/**
 * 
 */
package servicios;

import java.io.IOException;

/**
 * Lista de los metodos relacionados con la interfaz
 * 
 * @author nrojlla 081024
 */
public interface MenuInterfaz {
	/**
	 * Vista menu al iniciar la aplicacion
	 * 
	 * @return byte
	 * @throws IOException
	 */
	byte mostrarMenuInicial() throws IOException;

	/**
	 * Elegir opcion menu empleado
	 * 
	 * @throws IOException
	 */
	void MenuEmpleado() throws IOException;

	/**
	 * Elegir opcion menu gerencia
	 * 
	 * @throws IOException
	 */
	void MenuGerencia() throws IOException;

}
