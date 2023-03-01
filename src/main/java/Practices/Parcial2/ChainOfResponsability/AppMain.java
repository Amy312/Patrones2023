package Practices.Parcial2.ChainOfResponsability;


public class AppMain {

    public static void main(String[]args){
        Aplicacion app = new Aplicacion();

        app.reporte(new Falla("BUG", "ALTA", "No se abre el menu") );

        app.reporte(new Falla("ERROR", "CRITICA", "Fatal Error al iniciar la aplicación") );

    }
}
