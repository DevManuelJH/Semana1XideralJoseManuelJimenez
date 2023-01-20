package com.polimorfismo.src.com.curso;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
/*El siguiente programa, emula el sistema de una gasolinera, que como resultado final, nos dara una lista
 * de todos los tickets generados a los largo del día*/
public class Principal {

	public static void main(String[] args) {
		
		Singleton fecha = Singleton.getInstance(); //instanciamos una variable de tipo singleton para poder acceder a nuestro singleton
		ArrayList<CobroCombustible> listaPedidos = new ArrayList<>();//declaramos un lista de tipo ArrayList
		//le agregamos a la lista los objetos creados que pueden ser de 3 tipos
		listaPedidos.add(new Diesel(new BigDecimal(10), new BigDecimal(23.63), new BigDecimal(500), fecha.fechaActual));
		listaPedidos.add(new GasolinaMagna(new BigDecimal(10), new BigDecimal(22.71), new BigDecimal(500), fecha.fechaActual));
		listaPedidos.add(new GasolinaPremium(new BigDecimal(10), new BigDecimal(24.98), new BigDecimal(100), fecha.fechaActual));
        
		//invocamos nuestro metodo para mostrar lista
		//se manda a llamar directo de la clase ya que es un metodo estatico
		MostrarPedidos.generarPedido(listaPedidos);
		
	}
	
}
