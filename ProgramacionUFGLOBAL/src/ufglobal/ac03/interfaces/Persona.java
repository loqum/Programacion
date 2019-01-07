package ufglobal.ac03.interfaces;

public class Persona implements Comparable<Persona> {

  private double peso;
  private double altura;
  private int edad;

  public Persona() {

  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Persona [peso=");
    builder.append(peso);
    builder.append(", altura=");
    builder.append(altura);
    builder.append(", edad=");
    builder.append(edad);
    builder.append("]");
    return builder.toString();
  }

  @Override
  public int compareTo(Persona o) {
    int resultado = 0;

    if (this.edad < o.edad) {
      resultado = -1;

    } else if (this.edad > o.edad) {
      resultado = 1;

    } else {

      if (this.peso < o.peso) {
        resultado = -1;
      }

      else if (this.peso > o.peso) {
        resultado = 1;
      }

      else {
        resultado = 0;
      }
    }

    return resultado;
  }

}
