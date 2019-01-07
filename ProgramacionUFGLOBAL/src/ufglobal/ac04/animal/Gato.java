package ufglobal.ac04.animal;

public class Gato extends Animal {

  public Gato() {

  }

  @Override
  void llamar() {
    // TODO Auto-generated method stub

  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Gato [getNombre()=");
    builder.append(getNombre());
    builder.append(", getNumPatas()=");
    builder.append(getNumPatas());
    builder.append("]");
    return builder.toString();
  }

}
