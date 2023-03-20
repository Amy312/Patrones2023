package Practices.ParcialFinal.decorator;

public class Accesorios implements IAutomovil{
    private IAutomovil automovil;
    private String tipo;
    private String ventaja;

    public Accesorios(IAutomovil automovil) {
        this.automovil = automovil;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVentaja(String ventaja) {
        this.ventaja = ventaja;
    }

    @Override
    public void avanzar() {
        automovil.avanzar();
        System.out.println("--> Accesorio");
        System.out.println("\t tipo: " + this.tipo);
        System.out.println("\t ventaja: " + this.ventaja);

    }
}
