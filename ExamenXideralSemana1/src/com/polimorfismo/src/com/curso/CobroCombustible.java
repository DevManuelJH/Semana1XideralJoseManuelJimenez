package com.polimorfismo.src.com.curso;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
//Se uso una clase abstracta, ya que contiene un comportamiento que es comun entre las otras clases
public abstract class CobroCombustible implements ICobroCombustible { //le implementamos la ICobroCombustible

  //Atributos 
	BigDecimal litrosCombustible, 
	           precioCombustible, 
	           pagoCombustible, 
	           cambioPagoCombustible;
	String fechaCompraCombustible;
	
	
	//constructor
	public CobroCombustible(BigDecimal litrosCombustible, 
			                BigDecimal precioCombustible, BigDecimal pagoCombustible, 
			                String fechaCompraCombustible) 
	{
		this.litrosCombustible = litrosCombustible;
		this.precioCombustible = precioCombustible;
		this.pagoCombustible = pagoCombustible;
		this.fechaCompraCombustible = fechaCompraCombustible;
	}
	

    //Metodo toString que nos permitira ver el contenido del objeto de clase
	@Override
	public String toString() {
		return  "\n\nTipo de combustible: " + this.getClass().getSimpleName() + 
				"\nFecha de Operación: " + fechaCompraCombustible +
				"\nLitros: " + litrosCombustible + "Lts" + 
				"\nPrecio: " + "$" + precioCombustible.setScale(2, RoundingMode.HALF_UP) + "mx" + 
				"\nImporte recibido: " + "$" + pagoCombustible + "mx"; 
	}
}
