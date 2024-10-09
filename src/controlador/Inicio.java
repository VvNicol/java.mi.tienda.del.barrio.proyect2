package controlador;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dto.PedidoDto;
import dto.VentaDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
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

	public static FicheroInterfaz fi = new FicheroImplementacion();

	public static String directorioFicheros = "ficheros";
	public static LocalDate fecha = LocalDate.now();
	public static DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public static String ficheroLog = directorioFicheros + File.separator + "ficheroLog" + fecha.format(formatear)+ ".txt";

	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();

		String mensaje = "";

		byte opcion = 0;
		boolean esCerrado = false;

		do {

			try {

				mensaje = "Menu principal";
				fi.imprimirFichero(mensaje, ficheroLog);
				opcion = mi.mostrarMenuInicial();

				switch (opcion) {
				case 0:

					mensaje = " Cerrar menu ";
					fi.imprimirFichero(mensaje, ficheroLog);
					System.out.println("Ha cerrado la aplicacion");
					esCerrado = true;

					break;
				case 1:

					mensaje = "Menu empleado";
					fi.imprimirFichero(mensaje, ficheroLog);
					System.out.println("Ha seleccionado menu empleado");
					mi.MenuEmpleado();

					break;
				case 2:
					mensaje = "Menu gerencia";
					fi.imprimirFichero(mensaje, ficheroLog);
					mi.MenuGerencia();
					System.out.println("Ha seleccionado menu gerencia");
					break;

				default:
					mensaje = "Opcion no valida";
					fi.imprimirFichero(mensaje, ficheroLog);
					System.out.println("Opcion no valida");
					break;
				}

			} catch (Exception e) {
				System.out.println("Ha ocurrido un error: " + e.getMessage());
				e.printStackTrace();
				try {
					fi.imprimirFichero("Error: " + e.getMessage(), ficheroLog);
				} catch (Exception e1) {

					System.out.println("Error al escribir en el fichero log: " + e1.getMessage());
					e1.printStackTrace();
				}
			}

		} while (!esCerrado);

	}

}
