/**
 * 
 */
package servicios;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import controlador.Inicio;
import dto.VentaDto;
import util.util;

/**
 * Detalle de los metodos de la operativa interfaz
 * 
 * @author nrojlla 081024
 */
public class OperativaImplementacion implements OperativaIntefaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void CalculoDiario() throws IOException {
	
		LocalDate fechaFormateada = util.SolicitarFecha();
		
		double banca = 0.0;
		
		for (VentaDto v : Inicio.VentaLista) {
			
			LocalDate fechaCompraProducto = v.getFechaDate(); 
																						
			if (fechaCompraProducto.equals(fechaFormateada)) {
				
				banca += v.getImporteVenta();
				
			}
		}
		
	    LocalDate primeraFechaCompra = Inicio.VentaLista.get(0).getFechaDate();
	    LocalDate ultimaFechaCompra = Inicio.VentaLista.get(Inicio.VentaLista.size() - 1).getFechaDate();
	    
	    long diferenciaDias = ChronoUnit.DAYS.between(primeraFechaCompra, ultimaFechaCompra);
	    
	    // Mostrar resultados
	    System.out.println("Diferencia entre la primera y la última compra: " + diferenciaDias + " días");
	    System.out.println("Total del día: " + banca + "euros");
	    System.out.println("Fecha: " + fechaFormateada);

	}

	@Override
	public void AgregarVenta() throws IOException {

		System.out.println("Ingrese importe de la venta");
		double importe = sc.nextDouble();
		LocalDate instante = LocalDate.now();
		Long id = util.CalculoId();
		
		
		VentaDto v = new VentaDto();

		v.setImporteVenta(importe);
		v.setFechaDate(instante);
		v.setIdVenta(id);

		Inicio.VentaLista.add(v);

		System.out.println("Ingresado con exito");

	}

}
