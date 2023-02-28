package Practices.Parcial2.Memento;

public class Memento {
    private BaseDeDatos data;

    public Memento(BaseDeDatos data){
        this.data = data;
    }

    public BaseDeDatos getDataBase(){
        return data;
    }
}
