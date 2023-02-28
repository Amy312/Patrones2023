package Practices.Parcial1.FilaB.Builder4;

import java.util.List;

public class Contrato {

    private int costo;
    private String empresa;
    private List<String> listaDeCanales;

    public Contrato() {}

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public List<String> getListaDeCanales() {
        return listaDeCanales;
    }

    public void setListaDeCanales(List<String> listaDeCanales) {
        this.listaDeCanales = listaDeCanales;
    }

    public void showInfo() {

        System.out.println("Contrato: ");
        System.out.println("Costo: " + getCosto());
        System.out.println("Empresa: " + getEmpresa());

        for(int i = 0; i<listaDeCanales.size(); i++) {

            System.out.println("Canal " + (i+1) + ": " + listaDeCanales.get(i));

        }
        System.out.println();


    }

}