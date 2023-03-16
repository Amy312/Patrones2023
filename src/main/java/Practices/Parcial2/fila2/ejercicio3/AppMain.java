package Practices.Parcial2.fila2.ejercicio3;

public class AppMain {
    public static void main(String[] args) {
        Pagina blog = new Pagina();

        blog.suscribir(new User("Luz"), "video");
        blog.suscribir(new User("Elena"), "video");
        blog.suscribir(new User("Marco"), "todo");
        blog.suscribir(new User("Jose"), "todo");

        blog.notificar("video");
        blog.notificar("video");
        blog.notificar("imagen");
    }
}
