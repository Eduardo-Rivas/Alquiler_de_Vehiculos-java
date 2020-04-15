package modelo.entidades;

import java.util.Date;

public class AlquilerVehiculo {
	private Date horaRetiro;
	private Date horaLlegada;

	// --Definimos las Asociaciones--//
	private Vehiculo vehiculo;
	private Impuesto impuesto;
	
	public AlquilerVehiculo(Date horaRetiro, Date horaLlegada, Vehiculo vehiculo) {
		this.horaRetiro = horaRetiro;
		this.horaLlegada = horaLlegada;
		this.vehiculo = vehiculo; 
		//this.impuesto = impuesto;
	}

	public Date getHoraRetiro() {
		return horaRetiro;
	}

	public void setHoraRetiro(Date horaRetiro) {
		this.horaRetiro = horaRetiro;
	}

	public Date getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Impuesto getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(Impuesto impuesto) {
		this.impuesto = impuesto;
	}

	
	

}
