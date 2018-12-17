package ufglobal.ac02.centro.educativo;

public final class Profesor extends Trabajador {

  public Profesor() {

  }

  private String titulacion;
  private String especialidad;

  public String getTitulacion() {
    return titulacion;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Profesor [titulacion=");
    builder.append(titulacion);
    builder.append(", especialidad=");
    builder.append(especialidad);
    builder.append("]");
    return builder.toString();
  }

}
