package Practices.Parcial2.Mediator;

public class AppMain {

    public static void main (String args[]){

        Skipe skipe = new Skipe();

        Developer dev1 =  new Developer(skipe, "java");
        dev1.setCi("111").setName("Jose").setCargo("dev");
        Developer dev2 =  new Developer(skipe, "C++");
        dev2.setCi("222").setName("Ambar").setCargo("dev");
        Developer dev3 =  new Developer(skipe, "java");
        dev3.setCi("333").setName("Ander").setCargo("dev");


        QA qa1 = new QA(skipe,"Master");
        qa1.setCi("444").setName("Hugo").setCargo("QA");
        QA qa2 = new QA(skipe, "Junior");
        qa2.setCi("666").setName("Brenda").setCargo("QA");
        QA qa3 = new QA(skipe, "Junior");
        qa3.setCi("888").setName("Emanuel").setCargo("QA");

        SM sm1 = new SM(skipe);
        sm1.setCi("00022").setName("Josue").setCargo("SM");
        sm1.addCertificacion("scrum");
        sm1.addCertificacion("DevOps");
        SM sm2 = new SM(skipe);
        sm2.setCi("00055").setName("Alexia").setCargo("SM");
        sm2.addCertificacion("scrum");
        SM sm3 = new SM(skipe);
        sm3.setCi("00155").setName("Missa").setCargo("SM");
        sm3.addCertificacion("scrum");
        sm3.addCertificacion("DevOps");



        skipe.addProfesionalToTheChat(dev1.getCi(), dev1)
                .addProfesionalToTheChat(dev2.getCi(),dev2)
                .addProfesionalToTheChat(dev3.getCi(), dev3)
                .addProfesionalToTheChat(qa1.getCi(), qa1)
                .addProfesionalToTheChat(qa2.getCi(), qa2)
                .addProfesionalToTheChat(qa3.getCi(),qa3)
                .addProfesionalToTheChat(sm1.getCi(), sm1)
                .addProfesionalToTheChat(sm2.getCi(),sm2)
                .addProfesionalToTheChat(sm3.getCi(), sm3);


        qa1.send("Hola a todos los QAS");
        dev3.send("Hola a todos los DEV");
        sm1.send(" >> Hola a Todos <<");


    }
}
