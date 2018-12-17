package ufglobal.ac02.centro.educativo;

public class Trabajador extends Persona {

  public Trabajador() {

  }

  public Trabajador(Trabajador trabajador) {

  }

  public Trabajador(String nombre, String direccion, String numSs, String direccionTrabajo) {
    super(nombre, direccion);
    this.numSs = numSs;
    this.direccionTrabajo = direccionTrabajo;

  }

  private String numSs;
  private String direccionTrabajo;

  public String getNumSs() {
    return numSs;
  }

  public void setNumSs(String numSs) {
    this.numSs = numSs;
  }

  public String getDireccionTrabajo() {
    return direccionTrabajo;
  }

  public void setDireccionTrabajo(String direccionTrabajo) {
    this.direccionTrabajo = direccionTrabajo;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Trabajador [numSs=");
    builder.append(numSs);
    builder.append(", direccion=");
    builder.append(direccionTrabajo);
    builder.append("]");
    return builder.toString();
  }

}
