package Practices.ParcialFinal.composite;

public abstract class Component {
    private int precio;

    private String type;
    private String space ;

    private boolean last;

    public Component(String type) {

        this.type = type;

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public abstract String showInfo();
    public abstract void calculatePrice();


    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int index);
}
