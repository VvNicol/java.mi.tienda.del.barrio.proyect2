/**
 * 
 */
package servicios;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controlador.Inicio;
import dto.PedidoDto;
import dto.VentaDto;
import util.util;

/**
 * 
 */
public class GerenciaImplementacion implements GerenciaInterfaz {
	Scanner sc = new Scanner(System.in);

	@Override
	public void MostrarVentasDia() throws IOException {
		System.out.println("Ingrese fecha (dd-MM-yyyy)");
		String fecha = sc.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaFormateada = LocalDate.parse(fecha, formatter);

		for (VentaDto v : Inicio.VentaLista) {

			if (v.getFechaDate().equals(fechaFormateada)) {

				System.out.print("Venta numero:" + v.getIdVenta() + "\n"+
							 	 "Euros:" + v.getImporteVenta() + " euros\n"
							   + "Instante compra: " + v.getFechaDate().format(formatter)+"\n");
			}

		}

	}

	@Override
	public void CrearPedido() throws IOException {

	    boolean esCerrado = false;

	    do {
	        System.out.println("Ingrese el nombre del producto");
	        String nombre = sc.nextLine();
	        
	        System.out.println("Ingrese la cantidad del producto");
	        int cantidad = sc.nextInt();
	        sc.nextLine();

	        System.out.println("Ingrese la fecha deseada de entrega (dd-MM-yyyy)");
	        String fecha = sc.nextLine();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate fechaDeseada = LocalDate.parse(fecha, formatter);

	        Long id = util.CalculoIdPedido();

	        PedidoDto p = new PedidoDto();
	        p.setNombrePedido(nombre);
	        p.setCantidadPedido(cantidad);
	        p.setFechaPedido(fechaDeseada);
	        p.setIdPedido(id);

	        Inicio.PedidoLista.add(p);

	        System.out.println("¿Desea seguir agregando pedidos? s/n");
	        String sn = sc.nextLine().toLowerCase(); 
	        
	        if (sn.equals("n")) {
	            esCerrado = true;
	        }

	    } while (!esCerrado);

	    for (PedidoDto p : Inicio.PedidoLista) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        System.out.println("Producto: " + p.getNombrePedido() + "\n" +
	                           "Cantidad: " + p.getCantidadPedido() + " unidades\n" +
	                           "Fecha entrega: " + p.getFechaPedido().format(formatter));
	    }
	}

		
}

