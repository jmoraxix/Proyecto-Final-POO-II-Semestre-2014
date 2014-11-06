/** 
* Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 */
package dogLovers.modelo;

/**
 * @author xDiegoxD 01/11/2014
 *
 * 
 */
public class Recompensa {
	private double monto;
	private String moneda;
	
	
	/****CONSTRUCTOR****/	
	public Recompensa(double monto, String moneda) {
		this.monto = monto;
		this.moneda = moneda;
	}

	/****GETTERS AND SETTERS****/
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
}