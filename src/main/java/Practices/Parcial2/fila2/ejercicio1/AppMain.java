package Practices.Parcial2.fila2.ejercicio1;

public class AppMain {
    public static void main (String []args) {
        GDrive gDrive = new GDrive();
        GDocs gDocs = new GDocs();

        Documento doc1 = new Documento("11/02/2023", "1", "finish", "Este documento es una prueba");
        gDocs.setDocumento(doc1);
        gDrive.addDocumento(gDocs.createDocumento());

        doc1 = new Documento("13/02/2023", "2", "finish", "el exito solo depende de tu esfuerzo");
        gDocs.setDocumento(doc1);
        gDrive.addDocumento(gDocs.createDocumento());

        doc1 = new Documento("17/02/2023", "3", "finish", "prologo");
        gDocs.setDocumento(doc1);
        gDrive.addDocumento(gDocs.createDocumento());


        doc1 = new Documento("21/02/2023", "4","In process", "este documento fue actualizado satisfactoriamente");
        gDocs.setDocumento(doc1);
        gDrive.addDocumento(gDocs.createDocumento());


        System.out.println("Mostrar ultima version");
        doc1.showInfo();





        gDocs.restoreDocumento(gDrive.getDocumento("1"));



    }
}
