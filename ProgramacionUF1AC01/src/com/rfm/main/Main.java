package com.rfm.main;

import com.rfm.enumeraciones.PerroTamano;
import com.rfm.modelos.Perro;
import com.rfm.modelos.Raza;

public class Main {

	public static void main(String[] args) {

		// Instancia objeto Perro sin parámetros por constructor
		Perro perroSinParametros = new Perro(Perro.contarPerros());

		// Instancia objeto Perro con parámetros por constructor
		Perro perroConParametros = new Perro("Rex", 5, 0.5, Perro.contarPerros());

		// Inicialización propiedades mediante método set
		perroSinParametros.setNombre("Pancho");
		perroSinParametros.setEdad(7);
		perroSinParametros.setAltura(0.2);

		// Salida por pantalla
		System.out.println(perroSinParametros);
		System.out.println(perroConParametros);

		// Instanciado perroCopia de perroConParametros
		Perro perroCopia = new Perro(perroConParametros, Perro.contarPerros());
		System.out.println(perroCopia);

		// Llamada al método ladrar por todos los objetos instanciados
		perroConParametros.ladrar();
		perroSinParametros.ladrar();
		perroCopia.ladrar();

		// Instancia objeto perroClonado que llama al método clonar
		Perro perroClonado = new Perro();
		perroClonado.clonar(perroSinParametros, Perro.contarPerros());
		System.out.println(perroClonado);
		perroClonado.ladrar();

		System.out.println("Cantidad de perros creados: " + Perro.getCantidadPerros());

		Perro razaPastorAleman = new Raza("Rex", 5, 1.5, Perro.contarPerros(), "Pastor Alemán", PerroTamano.GRANDE, 10);
		System.out.println(razaPastorAleman);

	}

}
