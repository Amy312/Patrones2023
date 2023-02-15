package Practices.builderComputer;

public class AppMain {
    public static void main(String []args){
        DirectorComputer directorComputer = new DirectorComputer();
        I9AltoComputer i9AltoComputer = new I9AltoComputer();

        directorComputer.setComputer(i9AltoComputer);
        directorComputer.buildComputer();

        Computer c1 = directorComputer.getcomputer();
        System.out.println("* I9-Alto");
        c1.showInfo();

        I7MedioComputer i7MedioComputer = new I7MedioComputer();
        directorComputer.setComputer(i7MedioComputer);
        directorComputer.buildComputer();

        Computer c2 = directorComputer.getcomputer();
        System.out.println("* I7-Medio");
        c2.showInfo();

        I5BajoComputer i5BajoComputer = new I5BajoComputer();
        directorComputer.setComputer(i5BajoComputer);
        directorComputer.buildComputer();

        Computer c3 = directorComputer.getcomputer();
        System.out.println("* I5-Bajo");
        c3.showInfo();
        

    }
}
