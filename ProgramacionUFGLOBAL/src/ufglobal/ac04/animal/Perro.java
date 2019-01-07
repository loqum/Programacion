package ufglobal.ac04.animal;

public class Perro extends Animal {

  public Perro() {

  }

  @Override
  void llamar() {
    System.out.println("Guau! Guau!");

  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Perro [getNombre()=");
    builder.append(getNombre());
    builder.append(", getNumPatas()=");
    builder.append(getNumPatas());
    builder.append("]");
    return builder.toString();
  }

}
