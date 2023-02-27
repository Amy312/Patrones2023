package Practices.Parcial1.airportAbstractFactory;

public class AppMain {
    public static void main (String []args){
        String ch="childticket";

        String so="solidaryticket";

        String st="standardticket";



        ChildTicket ch11 = (ChildTicket) FactoryTicket.make(ch);          //   Se guardan los datos
        ch11.changeData("Juan", "123434334LP", "10A");  //   solo si estan almacenados en un objeto
        ch11.showTicket();

        FactoryTicket.make(ch).changeData("Mario", "2348327SC", "12B"); //   No se guardan las modificaciones
        FactoryTicket.make(ch).showTicket();                                               //   sin un objeto

        SolidaryTicket so11 = (SolidaryTicket) FactoryTicket.make(so);
        so11.changeData("Luis", "37443222LP", "18B");
        so11.showTicket();

        SolidaryTicket so12 = (SolidaryTicket) FactoryTicket.make(so);
        so12.changeData("Ander", "2733324OR", "19A");
        so12.showTicket();

        StandardTicket st11 = (StandardTicket) FactoryTicket.make(st);
        st11.changeData("Johann", "3454334SC", "15A");
        st11.showTicket();

        StandardTicket st12 = (StandardTicket) FactoryTicket.make(st);
        st12.changeData("Valeria", "6849173LP", "10B");
        st12.showTicket();

    }
}
