package Practices.ParcialFinal.composite;

public class Computadora extends Component {

    private String marca;
    private String rendimiento;





    public Computadora(String type, String marca, String rendimiento) {
        super(type);
        setPrecio(100);
        this.marca = marca;
        this.rendimiento = rendimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }



    @Override
    public String showInfo() {

        return getType()+": \n" + "-Precio: " + getPrecio() + "\n" +
                "-Marca: " + getMarca() + "\n"
                + "-Rendimiento: " + getRendimiento() + "\n";

    }

    @Override
    public void calculatePrice() {


        Precio.getInstance().add(this.showInfo());



    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {

        return null;

    }
}