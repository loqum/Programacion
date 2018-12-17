package ufglobal.ac02.centro.educativo;

public class Persona {

  public Persona() {

  }

  public Persona(Persona persona) {

  }

  public Persona(String nombre, String direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
  }

  private String nombre;
  private String direccion;

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
