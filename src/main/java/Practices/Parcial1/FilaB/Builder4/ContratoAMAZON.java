package Practices.Parcial1.FilaB.Builder4;

import java.util.ArrayList;
import java.util.List;

public class ContratoAMAZON extends Builder{
    @Override
    public void buildCosto() {

        contrato.setCosto(50);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("AWS");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("Pingu");
        canales.add("Americans");
        canales.add("Rose");


        contrato.setListaDeCanales(canales);

    }
}