package Practices.Parcial1.FilaB.Builder4;

public abstract class Builder {
    protected Contrato contrato;

    public Contrato getContrato() {

        return contrato;

    }

    public void createContrato() {

        contrato = new Contrato();

    }

    public abstract void buildCosto();

    public abstract void buildEmpresa();

    public abstract void buildCanales();

}
