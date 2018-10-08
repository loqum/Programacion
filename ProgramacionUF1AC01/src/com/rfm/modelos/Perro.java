package com.rfm.modelos;

public class Perro {

	private String nombre;
	private int edad;
	private double altura;
	private static int cantidadPerros;
	private Raza raza;

	public static int contarPerros() {
		return cantidadPerros++;
	}

	// Constructor completo por parámetros
	public Perro(String nombre, int edad, double altura, int cantidadPerros) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	// Constructor copia
	public Perro(Perro perro, int cantidadPerros) {
		this.nombre = perro.nombre;
		this.edad = perro.edad;
		this.altura = perro.altura;
	}

	// Constructor que únicamente recibe el nombre por parámetros
	public Perro(String nombre, int cantidadPerros) {
		this.nombre = nombre;
	}
	
	// Constructor completo con raza por parámetros
	public Perro(String nombre, int edad, double altura, int cantidadPerros, Raza raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.raza = raza;
	}
	
	// Constructor con raza por parámetros
	public Perro(Raza raza) {
		this.raza = raza;
	}

	public Perro(int cantidadPerros) {

	}

	public Perro() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public static int getCantidadPerros() {
		return cantidadPerros;
	}

	public static void setCantidadPerros(int cantidadPerros) {
		Perro.cantidadPerros = cantidadPerros;
	}

	public void ladrar() {
		System.out.println("¡Guau, guau!");
	}

	public void clonar(Perro perro, int cantidadPerros) {
		this.nombre = perro.nombre;
		this.edad = perro.edad;
		this.altura = perro.altura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Perro [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}

}
