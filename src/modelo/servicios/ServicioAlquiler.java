package modelo.servicios;

import modelo.entidades.AlquilerVehiculo;
import modelo.entidades.Impuesto;

public class ServicioAlquiler {
	private Double precioPorDias;
	private Double precioPorHoras;

	private double canHD;
	private String strTiempo;
	
	// --Instaciamos o Asociacion--//
	//private ServicioTasa serviciotasa;
    private TexServi texServi;
	
	//--Constructor con Argumentos--//
	public ServicioAlquiler(Double precioPorDia, Double precioPorHoras, TexServi texServi) {
		this.precioPorDias = precioPorDia;
		this.precioPorHoras = precioPorHoras;
		this.texServi = texServi;
	} 
	
	public void procesoImpuesto(AlquilerVehiculo alquilerVehi)
	{   
		long t1 = alquilerVehi.getHoraRetiro().getTime(); 
	    long t2 = alquilerVehi.getHoraLlegada().getTime();
		
	    //--Llevar a Horas--//
	    double horas = (double)(t2 - t1) / 1000 / 60 / 60;
	    	    
	    double pagoBasico;
	    if(horas <= 12.0)
	    {
	       canHD = Math.ceil(horas);
	       pagoBasico = canHD * precioPorHoras;
	       strTiempo = "Horas"; //--Horas--//
	    }
	    else
	    {
	    	canHD = Math.ceil(horas/24);
	    	pagoBasico = canHD * precioPorDias;
	    	strTiempo = "Dias"; //--Dias--//
	    }
	    
	    //--Calculamaos la tasa--//
	    double caltax = texServi.tasa(pagoBasico);
	    alquilerVehi.setImpuesto(new Impuesto(pagoBasico, caltax));
	     
	}

	public double getCanHoras() {
		return canHD;
	}

	public String getStrTiempo() {
		return strTiempo;
	}


	
	
	
}
