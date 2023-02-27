package Practices.Parcial2.Mediator;

public abstract class Persona {
    protected ICanal canal;
    private String name;
    private String ci;
    private String cargo;

    public Persona(ICanal canal){
        this.canal = canal;
    }


    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public Persona setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public void showInfo(){
        System.out.println("-------------------------");
        System.out.println("ci: "+ci);
        System.out.println("name: "+name);
        System.out.println("cargo: "+cargo);


    }
    public abstract void send(String msg);
    public abstract void received(String msg);

}
