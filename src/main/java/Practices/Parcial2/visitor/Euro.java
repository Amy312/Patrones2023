package Practices.Parcial2.visitor;

public class Euro implements IMoneda{

    private double monto;


    public Euro(double monto) {
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
