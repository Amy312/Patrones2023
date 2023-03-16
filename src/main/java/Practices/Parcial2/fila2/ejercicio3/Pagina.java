package Practices.Parcial2.fila2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pagina implements IPagina {

    private List<IUser> todo = new ArrayList<>();
    private List<IUser> videos = new ArrayList<>();

    @Override
    public void notificar(String post) {
        System.out.println("--> Notificación <--");
        if(post.equals("video")){
            for (IUser user: videos){
                user.notificacion("Nuevo video");
            }
            for (IUser user: todo){
                user.notificacion("Nuevo video");
            }
        } else{
            for (IUser user: todo){
                user.notificacion("Nueva imagen");
            }        }
    }



    @Override
    public void suscribir(IUser user, String tipo) {
        if(tipo.equals("video")){
            this.videos.add(user);
        }else{
            this.todo.add(user);
        }
    }

}
