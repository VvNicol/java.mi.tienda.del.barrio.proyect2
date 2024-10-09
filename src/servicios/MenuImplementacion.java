/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.Scanner;

import controlador.Inicio;

/**
 * Detalle de los metodos del menu interfaz
 * 
 * @author nrojlla 081024
 */
public class MenuImplementacion implements MenuInterfaz {
	
	Scanner sc = new Scanner(System.in);
	OperativaIntefaz oi = new OperativaImplementacion();
	GerenciaInterfaz gi = new GerenciaImplementacion();
	String mensaje = "";
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
				
				mensaje = "volver";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				System.out.println("Volver");
				esCerrado = true;
				break;

			case 1:
				mensaje = "Calcular diario";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				oi.CalculoDiario();
				break;

			case 2:
				mensaje = "agregar venta";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				oi.AgregarVenta();
				break;

			default:
				mensaje = "Opcion " + opcion + " no disponible";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				System.out.println(mensaje);
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
				mensaje = "Volver";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				System.out.println("Volver");
				esCerrado = true;
				break;

			case 1:
				mensaje = "Mostrar ventas";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				gi.MostrarVentasDia();
				break;

			case 2:
				mensaje = "Crear pedido";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				gi.CrearPedido();
				break;
				
			case 3:
				
				mensaje = "Imprimir pedido";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				Inicio.fi.ImprimirPedido();
				break;

			default:
				mensaje = "Opcion " + opcion + " no disponible";
				Inicio.fi.imprimirFichero(mensaje, Inicio.ficheroLog);
				System.out.println(mensaje);
				break;
			}

		} while (!esCerrado);

	}
/**
 * 
 * @return byte
 */
	private byte MenuGerenciaVista() {
		System.out.println("---------------------");
		System.out.println("----Menu Gerencia---");
		System.out.println("0.Volver");
		System.out.println("1.Mostrar ventas del día");
		System.out.println("2.Crear pedido para proveedores");
		System.out.println("3.Imprimir pedido");
		System.out.println("---------------------");
		byte opcion = sc.nextByte();
		return opcion;
	}

}
