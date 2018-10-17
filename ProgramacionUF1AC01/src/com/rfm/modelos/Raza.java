package com.rfm.modelos;

import com.rfm.enumeraciones.PerroTamano;

public class Raza extends Perro {

	private String nombreRaza;
	private PerroTamano tamaño;
	private int tiempoVida;

	public Raza() {

	}

	public Raza(String nombreRaza, PerroTamano tamaño, int tiempoVida) {
		this.nombreRaza = nombreRaza;
		this.tamaño = tamaño;
		this.tiempoVida = tiempoVida;
	}

	public Raza(String nombreRaza, PerroTamano tamaño) {
		this.nombreRaza = nombreRaza;
		this.tamaño = tamaño;
		this.tiempoVida = 10;
	}

	public Raza(String nombre, int edad, double altura, int cantidadPerros, String nombreRaza, PerroTamano tamaño,
			int tiempoVida) {
		super(nombre, edad, altura, cantidadPerros);
		this.nombreRaza = nombreRaza;
		this.tamaño = tamaño;
		this.tiempoVida = tiempoVida;
	}

	public String getNombreRaza() {
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	}

	public PerroTamano getTamaño() {
		return tamaño;
	}

	public void setTamaño(PerroTamano tamaño) {
		this.tamaño = tamaño;
	}

	public int getTiempoVida() {
		return tiempoVida;
	}

	public void setTiempoVida(int tiempoVida) {
		this.tiempoVida = tiempoVida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreRaza == null) ? 0 : nombreRaza.hashCode());
		result = prime * result + ((tamaño == null) ? 0 : tamaño.hashCode());
		result = prime * result + tiempoVida;
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
		Raza other = (Raza) obj;
		if (nombreRaza == null) {
			if (other.nombreRaza != null)
				return false;
		} else if (!nombreRaza.equals(other.nombreRaza))
			return false;
		if (tamaño != other.tamaño)
			return false;
		if (tiempoVida != other.tiempoVida)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raza [nombre=");
		builder.append(getNombre());
		builder.append(", edad=");
		builder.append(getEdad());
		builder.append(", altura=");
		builder.append(getAltura());
		builder.append(", nombreRaza=");
		builder.append(nombreRaza);
		builder.append(", tamaño=");
		builder.append(tamaño);
		builder.append(", tiempoVida=");
		builder.append(tiempoVida);
		builder.append("]");
		return builder.toString();
	}

}
