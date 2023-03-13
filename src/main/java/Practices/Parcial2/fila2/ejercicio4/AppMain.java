package Practices.Parcial2.fila2.ejercicio4;

public class AppMain {
    public static void main (String[]args) {
        BaseDatos libreria = new BaseDatos();

        libreria.addEstudiante(new Estudiante("1", "ros", "uhh"));
        libreria.addEstudiante(new Estudiante("3", "cos", "uyh"));
        libreria.addEstudiante(new Estudiante("6", "bos", "ugh"));
        libreria.addEstudiante(new Estudiante("0", "raos", "mhh"));

        System.out.println("Carreras");
        libreria.setStrategy(new OrdCarrera());
        libreria.execute();
        System.out.println();

        System.out.println("CI");
        libreria.setStrategy(new OrdCi());
        libreria.execute();
        System.out.println();

        System.out.println("Nombre");
        libreria.setStrategy(new OrdNombre());
        libreria.execute();
        System.out.println();

    }
}
