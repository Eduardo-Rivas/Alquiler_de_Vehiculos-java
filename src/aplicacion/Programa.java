package aplicacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.AlquilerVehiculo;
import modelo.entidades.Vehiculo;
import modelo.servicios.ServicioAlquiler;
import modelo.servicios.ServicioTasa;

public class Programa {

	public static void main(String[] args) throws ParseException {
	   Locale.setDefault(Locale.US);	
	   Scanner sc = new Scanner(System.in);
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
       
	   System.out.println("Entre los Datos de Alquiler :");
	   System.out.print("Modelo del Vehiculo :");
	   String modelo = sc.nextLine();
	   
	   System.out.print("Fecha de Entrada(dd/mm/yyyy hh:mm) :");
	   Date horaRetiro = sdf.parse(sc.nextLine());
	   
	   System.out.print("Fecha de Llegada(dd/mm/yyyy hh:mm) :");
	   Date horaLlegada = sdf.parse(sc.nextLine());
	   
	   //--Instanciamos Obj. AlquilerVehiculo--//
	   AlquilerVehiculo av = new AlquilerVehiculo(horaRetiro, horaLlegada,new Vehiculo(modelo));
	   
	   System.out.print("Precio Por Hora :");
	   double precioHoras = sc.nextDouble();
	    
	   System.out.print("Precio Por Dias :");
	   double precioDias = sc.nextDouble(); 
	   
	   ServicioAlquiler servAlq = new ServicioAlquiler(precioDias, 
			                                                    precioHoras, 
			                                                    new ServicioTasa());
	    
	   servAlq.procesoImpuesto(av);
	   
	   System.out.println("--- Pago de Factura ---");
	   System.out.println("Tiempo :"+String.format("%.2f", servAlq.getCanHoras())+"-"+servAlq.getStrTiempo());
	   
	   System.out.println("Impuesto Basico :" +String.format("%.2f", av.getImpuesto().getImpuestoBasico()));
	   System.out.println("Tasas :" +String.format("%.2f", av.getImpuesto().getTasa()));
	   System.out.println("Total Impuesto :" +String.format("%.2f", av.getImpuesto().getTotalImpuesto()));
	   
	   
	   
	   sc.close();
	}

}
