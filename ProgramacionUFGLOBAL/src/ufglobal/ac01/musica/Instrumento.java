package ufglobal.ac01.musica;

public abstract class Instrumento {

  public Instrumento() {

  }

  private double precio;

  public static void play() {
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

}
