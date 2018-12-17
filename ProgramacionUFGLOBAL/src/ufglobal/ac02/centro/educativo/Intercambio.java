package ufglobal.ac02.centro.educativo;

public final class Intercambio extends Estudiante {

  public Intercambio() {

  }

  private String paisOrigen;

  public String getPaisOrigen() {
    return paisOrigen;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Intercambio [paisOrigen=");
    builder.append(paisOrigen);
    builder.append("]");
    return builder.toString();
  }

}
