package Practices.Parcial2.fila2.ejercicio2;

public class AppMain {
    public static void main (String []args){

        Chat chat = new Chat();

        Estudiante est1 = new Estudiante(chat, "1222");
        est1.setName("juan");
        chat.addPersona("1", est1);

        Docente doc1 = new Docente(chat, "128129");
        doc1.setName("marco");
        chat.addPersona("2", doc1);



        doc1.send("Buenas");

    }

}
