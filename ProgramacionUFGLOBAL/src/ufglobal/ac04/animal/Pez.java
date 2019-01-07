package ufglobal.ac04.animal;

public abstract class Pez extends Animal {

  public Pez() {

  }

  abstract void nadar();

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Pez [getNombre()=");
    builder.append(getNombre());
    builder.append(", getNumPatas()=");
    builder.append(getNumPatas());
    builder.append("]");
    return builder.toString();
  }

}
