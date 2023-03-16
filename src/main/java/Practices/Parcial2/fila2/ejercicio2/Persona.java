package Practices.Parcial2.fila2.ejercicio2;

public abstract class Persona {
    protected ICanal canal;
    private String name;
    private String alias;
    private String ranking;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona(ICanal canal) {
        this.canal = canal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public abstract void send(String msg, boolean todos);
    public abstract void received(String msg);

}
