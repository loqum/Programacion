package ufglobal.ac02.centro_educativo;

public class Persona {

  private String nombre;
  private String direccion;

  public Persona() {

  }

  public Persona(Persona persona) {

  }

  public Persona(String nombre, String direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Persona [nombre=");
    builder.append(nombre);
    builder.append(", direccion=");
    builder.append(direccion);
    builder.append("]");
    return builder.toString();
  }

}
