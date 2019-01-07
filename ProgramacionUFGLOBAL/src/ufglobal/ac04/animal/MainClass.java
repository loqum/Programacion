package ufglobal.ac04.animal;

public class MainClass {

  public static void main(String[] args) {

    Animal gato = new Gato();

    gato.setNombre("Pepin");
    gato.setNumPatas(4);
    System.out.println(gato.toString());

    Pez sardina = new Sardina(2);

    sardina.setNombre("Sardinita");
    sardina.nadar();
    System.out.println(sardina.toString());

    Animal perro = new Perro();

    perro.setNombre("Friskas");
    perro.setNumPatas(4);
    perro.llamar();
    System.out.println(perro.toString());

  }

}
