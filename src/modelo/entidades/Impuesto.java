package modelo.entidades;

public class Impuesto {
	public Double impuestoBasico;
	public Double tasa;

	//--Constructor Estandar--//
	public Impuesto() {
	}

	//--Constructor con argumentos--//
	public Impuesto(Double impuestoBasico, Double tasa) {
		this.impuestoBasico = impuestoBasico;
		this.tasa = tasa;
	}

	//--Getters y Setters--//
	public Double getImpuestoBasico() {
		return impuestoBasico;
	}
	public void setImpuestoBasico(Double impuestoBasico) {
		this.impuestoBasico = impuestoBasico;
	}

	public Double getTasa() {
		return tasa;
	}
	public void setTasa(Double tasa) {
		this.tasa = tasa;
	}

	public Double getTotalImpuesto()
	{
		return getImpuestoBasico() + tasa;
	}
	
}
