package Practices.ParcialFinal.composite;

public class AppMain {
    public static void main(String[] args) {

        Computadora c1 = new Computadora("Computer",  "Asus", "Potente");
        Computadora c2 = new Computadora("Computer","Acer", "Potente");
        Computadora c3 = new Computadora("Computer", "Apple", "Lenta");
        Computadora c4 = new Computadora("Computer","Apple", "Muy lenta");
        Computadora c5 = new Computadora("Computer","Quipus", "Lenta");
        Computadora c6 = new Computadora("Computer","Lenovo", "Medio");


//        c1.setSpace("\t\t\t\t");
//        c2.setSpace("\t\t\t\t");
//        c3.setSpace("\t\t\t\t");
//        c4.setSpace("");
//        c5.setSpace("\t\t\t\t");
//        c6.setSpace("\t\t\t\t");


        ComputadoraComposite laboratorio1 = new ComputadoraComposite("Laboratorio");
        ComputadoraComposite laboratorio2 = new ComputadoraComposite("Laboratorio");







        laboratorio1.add(c1);
        laboratorio1.add(c2);
        laboratorio1.add(c3);

        laboratorio2.add(c4);
        laboratorio2.add(c5);
        laboratorio2.add(c6);


        ComputadoraComposite contenedor1 = new ComputadoraComposite("ContenedorComputer");

        contenedor1.setSpace("");

        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);

        contenedor1.setLast(true);

        contenedor1.calculatePrice();
        System.out.println("Precio total: " + Precio.getInstance().getPrecioGlobal());




    }

}
