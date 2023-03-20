package Practices.ParcialFinal.composite;
import java.util.ArrayList;
import java.util.List;

public class ComputadoraComposite extends Component {



    private List<Component> computerComponentList = new ArrayList<>();

    public ComputadoraComposite(String type) {

        super(type);

    }

    @Override
    public String showInfo() {

        return getSpace() +getType() +": \n" +getSpace()+ "-Precio: " + getPrecio() + "\n";

    }

    @Override
    public void calculatePrice() {


        for(Component computerComponent : computerComponentList) {

            computerComponent.calculatePrice();
            this.setPrecio(this.getPrecio() + computerComponent.getPrecio());

        }
        Precio.getInstance().add(this.showInfo());


        if(isLast()) {

            Precio.getInstance().showInfo();
            Precio.getInstance().setPrecioGlobal(Precio.getInstance().getPrecioGlobal() + this.getPrecio());


        }


    }

    @Override
    public void add(Component component) {

        computerComponentList.add(component);

    }

    @Override
    public void remove(Component component) {

        computerComponentList.remove(component);

    }

    @Override
    public Component getChild(int index) {
        return computerComponentList.get(index);
    }
}