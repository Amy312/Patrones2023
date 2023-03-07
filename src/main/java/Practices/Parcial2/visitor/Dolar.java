package Practices.Parcial2.visitor;

public class Dolar implements IMoneda{

    private double monto;


    public Dolar(double monto) {
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
