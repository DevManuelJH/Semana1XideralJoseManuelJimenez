package com.polimorfismo.src.com.curso;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GasolinaPremium extends CobroCombustible {
	
	public GasolinaPremium(BigDecimal litrosCombustible, 
            BigDecimal precioCombustible, BigDecimal pagoCombustible, 
            String fechaCompraCombustible) {
		
		super(litrosCombustible, precioCombustible, pagoCombustible, fechaCompraCombustible);
	}
	//sobreescribimos el metodo cobrar declarado en la interfaz, si bien esta clase no implementa directamente
		//la interfaz, si es posible heredar este metodo ya que hereda de la clase padre, donde nuestra interfaz si
		//esta implentada
	@Override
	public String cobrar() {
		BigDecimal total = litrosCombustible.multiply(precioCombustible);
		BigDecimal cambio = pagoCombustible.subtract(total);
		int resultado = total.compareTo(pagoCombustible);
		if(resultado>0) {
		System.out.println("______________________________________");
		return "¡CREDITO INSUFICIENTE <<COMPRA CANCELADA>>";
		}else {
		return "\n\n¡GRACIAS POR SU COMPRA! \n"
				+ "\nEl total de su compra es de: " + "$" + total.setScale(2, RoundingMode.HALF_UP) + "mx"
				+ "\nSu cambio es: " + "$" + cambio.setScale(2, RoundingMode.HALF_UP) + "mx"+
				"\n______________________________________\n";
		
}
}
}
	
