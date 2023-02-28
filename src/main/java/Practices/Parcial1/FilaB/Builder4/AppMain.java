package Practices.Parcial1.FilaB.Builder4;

public class AppMain {
    public static void main(String[] args) {

        Director director = new Director();

        ContratoAMAZON contratoAMAZON = new ContratoAMAZON();
        ContratoHBO contratoHBO = new ContratoHBO();
        ContratoNETFLIX contratoNETFLIX = new ContratoNETFLIX();

        director.setContratoBuilder(contratoHBO);
        director.buidContrato();

        Contrato contrato1 = director.getContratoFromBuilder();

        director.setContratoBuilder(contratoNETFLIX);
        director.buidContrato();

        Contrato contrato2 = director.getContratoFromBuilder();

        director.setContratoBuilder(contratoAMAZON);
        director.buidContrato();

        Contrato contrato3 = director.getContratoFromBuilder();

        contrato1.showInfo();
        contrato2.showInfo();
        contrato3.showInfo();


    }
}
