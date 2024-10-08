/**
 * 
 */
package dto;

import java.time.LocalDate;

/**
 * Dto de ventas
 * 
 * @author nrojlla 081024
 */
public class VentaDto {
	
	long idVenta;
	double importeVenta = 999999;
	LocalDate fechaDate = LocalDate.of(9999, 12, 31);
	
	
	/**
	 * @return the idVenta
	 */
	public long getIdVenta() {
		return idVenta;
	}
	/**
	 * @param idVenta the idVenta to set
	 */
	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}
	/**
	 * @return the importeVenta
	 */
	public double getImporteVenta() {
		return importeVenta;
	}
	/**
	 * @param importeVenta the importeVenta to set
	 */
	public void setImporteVenta(double importeVenta) {
		this.importeVenta = importeVenta;
	}
	/**
	 * @return the fechaDate
	 */
	public LocalDate getFechaDate() {
		return fechaDate;
	}
	/**
	 * @param fechaDate the fechaDate to set
	 */
	public void setFechaDate(LocalDate fechaDate) {
		this.fechaDate = fechaDate;
	}
	
}
