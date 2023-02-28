package Practices.Parcial2.Memento;

public class Git { // originator
    private BaseDeDatos data;

    public void setData(BaseDeDatos data){
        this.data = data;
        this.data.setAlias(data.getAlias()).setData(data.getData());
    }

    public Memento createBackup(){
        return new Memento (this.data);
    }

    public BaseDeDatos checkoutBackup(Memento memento){
        this.data =memento.getDataBase();
        return this.data;
    }
}
