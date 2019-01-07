package ufglobal.ac04.animal;

public class Sardina extends Pez {

  private int aletes;
  private static final boolean TE_COLA = true;

  public Sardina() {

  }

  public Sardina(int aletes) {
    this.aletes = aletes;
  }

  @Override
  void nadar() {
    System.out.println("Qué bien nado");

  }

  @Override
  void llamar() {
    // TODO Auto-generated method stub

  }

  public int getAletes() {
    return aletes;
  }

  public void setAletes(int aletes) {
    this.aletes = aletes;
  }

  public static boolean isTeCola() {
    return TE_COLA;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Sardina [aletes=");
    builder.append(aletes);
    builder.append(", getNombre()=");
    builder.append(getNombre());
    builder.append(", getNumPatas()=");
    builder.append(getNumPatas());
    builder.append("]");
    return builder.toString();
  }

}
