package ufglobal.ac02.centro_educativo;

public class MainClass {

  public static void main(String[] args) {
    Persona personaCompleto = new Persona("Lucia", "Madrid");
    Persona personaIncompleto = new Persona(personaCompleto);

    Estudiante estudianteIncompleto = new Estudiante("Pepito", "Barcelona", "17/12/2018", 18,
        "45663348J");

    Estudiante estudianteCompleto = new Estudiante(personaCompleto, "17/12/2018", 18,
        "48557598H");

    Estudiante estudiante = new Estudiante(estudianteCompleto);

    Trabajador trabajadorCompleto = new Trabajador("Juanito", "Lleida", "72642838-SGH",
        "Barcelona");
    PersonalGestion personalGestionCompleto = new PersonalGestion(trabajadorCompleto, "Interino");
    
    System.out.println(estudianteCompleto.toString());

  }

}
