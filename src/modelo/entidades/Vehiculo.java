package modelo.entidades;

public class Vehiculo {
	private String modelo;

	//--Constructor Estandar--//
	public Vehiculo() {
	}

	//--Constructor con Argumentos--//
	public Vehiculo(String modelo) {
		this.modelo = modelo;
	}

	//--Getter y Setters--//
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
 
	
}
