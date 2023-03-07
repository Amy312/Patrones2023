package Practices.Parcial2.visitor;

public class Boliviano implements IMoneda{

    private double monto;


    public Boliviano(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    @Override
    public void changeMonto(ILibreCambista viajero) {
        viajero.cambio(this);
    }
}
