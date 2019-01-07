package ufglobal.ac02.centro_educativo;

public final class PersonalGestion extends Trabajador {

  public PersonalGestion() {

  }

  public PersonalGestion(PersonalGestion personalGestion) {

  }

  public PersonalGestion(Trabajador trabajador, String posicion) {
    super(trabajador);
    this.posicion = posicion;
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
    builder.append(", getNumSs()=");
    builder.append(getNumSs());
    builder.append(", getDireccionTrabajo()=");
    builder.append(getDireccionTrabajo());
    builder.append(", getNombre()=");
    builder.append(getNombre());
    builder.append(", getDireccion()=");
    builder.append(getDireccion());
    builder.append("]");
    return builder.toString();
  }

}
