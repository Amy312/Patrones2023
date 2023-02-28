package Practices.Parcial1.FilaB.Builder4;

import java.util.ArrayList;
import java.util.List;

public class ContratoNETFLIX extends Builder{
    @Override
    public void buildCosto() {

        contrato.setCosto(150);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("netflix");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("Saw");
        canales.add("IronMan 2");

        contrato.setListaDeCanales(canales);

    }
}