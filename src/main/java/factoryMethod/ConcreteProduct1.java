package factoryMethod;

public class ConcreteProduct1 implements IProduct{
    @Override
    public void create() {
        System.out.println("Creando concrete product 1");
    }
}