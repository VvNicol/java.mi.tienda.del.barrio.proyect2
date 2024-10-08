/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.Scanner;

/**
 * Detalle de los metodos del menu interfaz
 * 
 * @author nrojlla 081024
 */
public class MenuImplementacion implements MenuInterfaz {
	
	Scanner sc = new Scanner(System.in);
	OperativaIntefaz oi = new OperativaImplementacion();
	GerenciaInterfaz gi = new GerenciaImplementacion();

	@Override
	public byte mostrarMenuInicial() throws IOException {
		System.out.println("---------------------");
		System.out.println("-----Menu incial-----");
		System.out.println("0.Cerrar menu");
		System.out.println("1.Menu empleado");
		System.out.println("2.Menu gerencia");
		System.out.println("---------------------");
		byte opcion = sc.nextByte();
		return opcion;
	}

	@Override
	public void MenuEmpleado() throws IOException {

		byte opcion = 0;
		boolean esCerrado = false;

		do {

			opcion = MenuEmpleadoVista();

			switch (opcion) {
			case 0:
				System.out.println("Volver");
				esCerrado = true;
				break;

			case 1:
				oi.CalculoDiario();
				break;

			case 2:
				oi.AgregarVenta();
				break;

			default:
				System.out.println("Opcion " + opcion + " no disponible");
				break;
			}

		} while (!esCerrado);

	}

	/**
	 * Vista del menu empleado
	 * 
	 * @author nrojlla 081024
	 * @return byte
	 * @throws IOException
	 */
	private byte MenuEmpleadoVista() throws IOException {
		System.out.println("---------------------");
		System.out.println("----Menu Empledado---");
		System.out.println("0.Volver");
		System.out.println("1.Calculo de ventas diario");
		System.out.println("2.Agregar venta");
		System.out.println("---------------------");
		byte opcion = sc.nextByte();
		return opcion;
	}

	@Override
	public void MenuGerencia() throws IOException {
		
		byte opcion = 0;
		boolean esCerrado = false;

		do {

			opcion = MenuGerenciaVista();

			switch (opcion) {
			case 0:
				System.out.println("Volver");
				esCerrado = true;
				break;

			case 1:
				gi.MostrarVentasDia();
				break;

			case 2:
				gi.CrearPedido();
				break;

			default:
				System.out.println("Opcion " + opcion + " no disponible");
				break;
			}

		} while (!esCerrado);

	}
/**
 * 
 * @return
 */
	private byte MenuGerenciaVista() {
		System.out.println("---------------------");
		System.out.println("----Menu Gerencia---");
		System.out.println("0.Volver");
		System.out.println("1.Mostrar ventas del día");
		System.out.println("2.Crear pedido para proveedores");
		System.out.println("---------------------");
		byte opcion = sc.nextByte();
		return opcion;
	}

}
