package Practices.ParcialFinal.adapter;

public class WebDesktop implements IWeb{
    @Override
    public void iniciarSesion() {
        System.out.println("Se esta iniciando sesión :D");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Se esta cerrando sesión :C");

    }

    @Override
    public void generarDatos() {
        System.out.println("Datos: A B C :D");
    }
}
