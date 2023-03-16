package Practices.Parcial2.fila2.ejercicio3;

public class User implements IUser{

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Usuario " + name);
    }

    @Override
    public void notificacion(String mensaje) {
        show();
        System.out.println("NOTIFICACION: "+mensaje);

    }

}
