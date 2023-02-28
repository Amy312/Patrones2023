package Practices.Parcial2.Memento;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {//concrete

    private List<Persona> data;
    private String alias;

    public BaseDeDatos () {
        this.data = new ArrayList<>();
    }

    public List<Persona> getData() {
        return data;
    }

    public BaseDeDatos setData(List<Persona> data) {
        this.data = data;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public BaseDeDatos setAlias(String alias) {
        this.alias = alias;
        return this;
    }



    public void addPersona(Persona persona){
        data.add(persona);
    }

    public void showInfo(){
        System.out.println("*************");
        System.out.println("Personas: "  + alias);
         for(Persona p: data){
             System.out.println(" - Persona: " + p.getName() + ", ci: " + p.getCi() + ", edad: " + p.getEdad());
         }
        System.out.println("************");
    }
}
