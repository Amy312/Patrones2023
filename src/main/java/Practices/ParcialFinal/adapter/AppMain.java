package Practices.ParcialFinal.adapter;

public class AppMain {
    public static void main(String[] args) {

        AppAndroid android = new AppAndroid();
        System.out.println("\nAndroid app");

        android.login();
        android.logout();
        android.reporte();

        WebApp docs = new WebApp();
        System.out.println("\nDocs web app");

        docs.iniciarSesion();
        docs.cerrarSesion();
        docs.generarDatos();


        AppMobileAdapter adapter = new AppMobileAdapter(android);

        System.out.println("\nAdapter");
        adapter.iniciarSesion();
        adapter.cerrarSesion();
        adapter.generarDatos();

    }
}