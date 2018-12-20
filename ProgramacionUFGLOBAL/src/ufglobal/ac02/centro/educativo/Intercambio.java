package ufglobal.ac02.centro.educativo;

public final class Intercambio extends Estudiante {

  public Intercambio() {

  }

  public Intercambio(Estudiante estudiante, String paisOrigen) {
    super(estudiante);
    this.paisOrigen = paisOrigen;
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
    builder.append(", getFechaAlta()=");
    builder.append(getFechaAlta());
    builder.append(", getEdad()=");
    builder.append(getEdad());
    builder.append(", getNif()=");
    builder.append(getNif());
    builder.append(", getNombre()=");
    builder.append(getNombre());
    builder.append(", getDireccion()=");
    builder.append(getDireccion());
    builder.append("]");
    return builder.toString();
  }

}
