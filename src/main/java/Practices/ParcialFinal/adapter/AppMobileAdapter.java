package Practices.ParcialFinal.adapter;

public class AppMobileAdapter implements IWeb{

    private IApp app;

    public AppMobileAdapter(IApp app) {
        this.app = app;
    }

    @Override
    public void iniciarSesion() {
        app.login();
    }

    @Override
    public void cerrarSesion() {
        app.logout();
    }

    @Override
    public void generarDatos() {
        app.reporte();
    }
}
