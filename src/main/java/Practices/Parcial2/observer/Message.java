package Practices.Parcial2.observer;

public class Message {
    private String info;
    private String titulo;

    public Message(String info, String titulo) {
        this.info = info;
        this.titulo = titulo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void showInfo() {
        System.out .println("Message {" +
                "titulo='" + titulo + '\'' +
                ", info='" + info + '\'' + '}');
    }
}
