package ufglobal.ac04.animal;

public abstract class Animal {
  
  private String nombre;
  private int numPatas;
  
  public Animal() {
    
  }

  public Animal(String nombre, int numPatas) {
    this.nombre = nombre;
    this.numPatas = numPatas;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getNumPatas() {
    return numPatas;
  }

  public void setNumPatas(int numPatas) {
    this.numPatas = numPatas;
  }

  abstract void llamar();

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Animal [nombre=");
    builder.append(nombre);
    builder.append(", numPatas=");
    builder.append(numPatas);
    builder.append("]");
    return builder.toString();
  }
 
}
