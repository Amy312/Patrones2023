package Practices.Parcial2.fila2.ejercicio2;

public class AppMain {
    public static void main (String []args){

        Chat chat = new Chat();

        Estudiante est1 = new Estudiante(chat);
        est1.setName("juan");
        est1.setAlias("Juan23");
        est1.setRanking("Miga de Pan");
        chat.addPersona("14", est1);

        Estudiante est2 = new Estudiante(chat);
        est2.setName("ander");
        est2.setAlias("andy23");
        est2.setRanking("Miga de Pan");
        chat.addPersona("10", est2);

        Estudiante est3 = new Estudiante(chat);
        est3.setName("mario");
        est3.setAlias("mario2");
        est3.setRanking("Miga de Pan");
        chat.addPersona("11", est3);

        Docente doc1 = new Docente(chat);
        doc1.setName("marco");
        doc1.setAlias("Mark");
        doc1.setRanking("Gomita III");
        chat.addPersona("299", doc1);

        Docente doc2 = new Docente(chat);
        doc2.setName("Luis");
        doc2.setAlias("SanLucho");
        doc2.setRanking("Gomita II");
        chat.addPersona("211", doc2);

        Docente doc3 = new Docente(chat);
        doc3.setName("Ernesto");
        doc3.setAlias("DelaCruz");
        doc3.setRanking("Master en gomitas");
        chat.addPersona("222", doc3);

        doc1.send("Buenas", true);
        System.out.println("\n\n");

        est3.send("Como es", false);
        System.out.println("\n\n");

        est1.send("Ah wiwi", true);
    }

}
