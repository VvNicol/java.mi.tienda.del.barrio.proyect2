package controlador;

import java.util.ArrayList;
import java.util.List;

import dto.PedidoDto;
import dto.VentaDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Aplicacion tienda del barrio
 * 
 * @author nrojlla 081024
 */
public class Inicio {

	public static List<VentaDto> VentaLista = new ArrayList<VentaDto>();
	public static List<PedidoDto> PedidoLista = new ArrayList<PedidoDto>();

	
	public static void main(String[] args) {

		
		MenuInterfaz mi = new MenuImplementacion();

		byte opcion = 0;
		boolean esCerrado = false;

		do {

			try {
				opcion = mi.mostrarMenuInicial();

				switch (opcion) {
				case 0:

					System.out.println("Ha cerrado la aplicacion");
					esCerrado = true;

					break;
				case 1:

					System.out.println("Ha seleccionado menu empleado");
					mi.MenuEmpleado();

					break;
				case 2:
					mi.MenuGerencia();
					System.out.println("Ha seleccionado menu gerencia");
					break;

				default:
					break;
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (!esCerrado);

	}

}
