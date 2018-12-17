package ufglobal.ac02.centro.educativo;

public final class PersonalGestion extends Trabajador {

  public PersonalGestion() {

  }

  private String posicion;

  public String getPosicion() {
    return posicion;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("PersonalGestion [posicion=");
    builder.append(posicion);
    builder.append("]");
    return builder.toString();
  }

}
