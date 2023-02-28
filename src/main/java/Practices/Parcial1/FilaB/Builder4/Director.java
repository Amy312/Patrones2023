package Practices.Parcial1.FilaB.Builder4;

public class Director {
    private Builder builder;

    public Contrato getContratoFromBuilder() {

        return builder.getContrato();

    }

    public void setContratoBuilder(Builder builder) {

        this.builder = builder;


    }

    public void buidContrato() {

        builder.createContrato();
        builder.buildCanales();
        builder.buildCosto();
        builder.buildEmpresa();

    }
}
