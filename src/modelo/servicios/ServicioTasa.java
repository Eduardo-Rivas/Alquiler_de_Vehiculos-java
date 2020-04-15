package modelo.servicios;

public class ServicioTasa implements TexServi{
   public double tasa(double monto)
   {
	   if(monto <= 100.0)
	   {
	      return monto * 0.20; 	   
	   }
	   else
	   {
		   return monto * 0.15;   
	   }
	   
   }
}
