package ufglobal.ac02.centro_educativo;

public class Estudiante extends Persona {

  private String fechaAlta;
  private int edad;
  private String nif;

  public Estudiante() {

  }

  public Estudiante(Estudiante estudiante) {

  }

  public Estudiante(String nombre, String direccion, String fechaAlta, int edad, String nif) {
    super(nombre, direccion);
    this.fechaAlta = fechaAlta;
    this.edad = edad;
    this.nif = nif;
  }

  public Estudiante(Persona persona, String fechaAlta, int edad, String nif) {
    super(persona);
    this.fechaAlta = fechaAlta;
    this.edad = edad;
    this.nif = nif;
  }

  public String getFechaAlta() {
    return fechaAlta;
  }

  public void setFechaAlta(String fechaAlta) {
    this.fechaAlta = fechaAlta;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNif() {
    return nif;
  }

  public void setNif(String nif) {
    this.nif = nif;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Estudiante [fechaAlta=");
    builder.append(fechaAlta);
    builder.append(", edad=");
    builder.append(edad);
    builder.append(", nif=");
    builder.append(nif);
    builder.append(", getNombre()=");
    builder.append(getNombre());
    builder.append(", getDireccion()=");
    builder.append(getDireccion());
    builder.append("]");
    return builder.toString();
  }

}
