package Practices.Parcial1.airport;

public class AppMain {
    public static void main (String[]ars){
        StandardTicket st1 = new StandardTicketCreator().create();
        StandardTicket st2 = new StandardTicketCreator().create();

        SolidarityTicket so1 = new SolidarityTicketCreator().create();
        SolidarityTicket so2 = new SolidarityTicketCreator().create();

        ChildTicket ch1 = new ChildTicketCreator().create();
        ChildTicket ch2 = new ChildTicketCreator().create();

        st1.changeData("María", "2454275ST", "14A");
        st2.changeData("Josue", "3224672LP", "15A");

        so1.changeData("Alan", "10242067LP", "16B");
        so2.changeData("Sergio", "6240132LP", "20B");

        ch1.changeData("Monica", "3487324LP", "41A");
        ch2.changeData("Valeria", "1444202LP", "23B");

        st1.showTicket();
        st2.showTicket();

        so1.showTicket();
        so2.showTicket();

        ch1.showTicket();
        ch2.showTicket();
    }
}
