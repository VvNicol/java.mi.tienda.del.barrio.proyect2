/**
 * 
 */
package servicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controlador.Inicio;
import dto.PedidoDto;

/**
 * 
 */
public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void imprimirFichero(String mensaje, String ficheroLog) {

		try (PrintWriter printWriter = new PrintWriter(new FileWriter(ficheroLog, true))) {
			printWriter.println(mensaje);
		} catch (IOException e) {
			System.out.println("Ha habido un error al escribir en el fichero log: " + e.getMessage());
		}

	}

	@Override
	public void ImprimirPedido() {
		try {
			LocalDate fecha = util.util.SolicitarFecha();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			String pedidosImprimir = Inicio.directorioFicheros+ File.pathSeparator +"Pedido" + fecha.format(formatter) + ".txt";
			
			PrintWriter pw = new PrintWriter(new FileWriter(pedidosImprimir, true));
			System.out.println("Imprimiendo pedidos para la fecha: " + fecha.format(formatter));
			for (PedidoDto p : Inicio.PedidoLista) {
				if (p.getFechaPedido().equals(fecha)) {
					System.out.println("Pedido número: " + p.getIdPedido() + "\n"+"Nombre del pedido:" + p.getNombrePedido() + "\n" + "Cantidad: " + p.getCantidadPedido()
							+ "\n" + "Fecha del pedido: " + p.getFechaPedido().format(formatter) + "\n");

					// Escribir en el archivo
					pw.println("Pedido número: " + p.getIdPedido() + "\n"+"Nombre del pedido:" + p.getNombrePedido() + "\n" + "Cantidad: " + p.getCantidadPedido()
					+ "\n" + "Fecha del pedido: " + p.getFechaPedido().format(formatter) + "\n");
				}
			}
			pw.close();

		} catch (Exception e) {
			System.out.println("Error al imprimir el pedido: " + e.getMessage());
			e.printStackTrace();
			try {
				Inicio.fi.imprimirFichero("Error: " + e.getMessage(), Inicio.ficheroLog);
			} catch (Exception e1) {

				System.out.println("Error al escribir en el fichero log: " + e1.getMessage());
				e1.printStackTrace();
			}
		}

	}

}
