/**
 * 
 */
package dto;

import java.time.LocalDate;

/**
 * 
 */
public class PedidoDto {
	
	long idPedido;
	String nombrePedido = "aaaaa";
	int cantidadPedido = 11111;
	LocalDate fechaPedido = LocalDate.of(9999, 12, 31);
	/**
	 * @return the idPedido
	 */
	public long getIdPedido() {
		return idPedido;
	}
	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * @return the nombrePedido
	 */
	public String getNombrePedido() {
		return nombrePedido;
	}
	/**
	 * @param nombrePedido the nombrePedido to set
	 */
	public void setNombrePedido(String nombrePedido) {
		this.nombrePedido = nombrePedido;
	}
	/**
	 * @return the cantidadPedido
	 */
	public int getCantidadPedido() {
		return cantidadPedido;
	}
	/**
	 * @param cantidadPedido the cantidadPedido to set
	 */
	public void setCantidadPedido(int cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
	}
	/**
	 * @return the fechaPedido
	 */
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	/**
	 * @param fechaPedido the fechaPedido to set
	 */
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	
	
}
