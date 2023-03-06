package Practices.Parcial2.state;

public class AppMain {
    public static void main (String[] args) throws InterruptedException {

        Computadora computadora = new Computadora();

        computadora.viewState();

        computadora.setStateComputadora(new Reiniciar());
        computadora.viewState();

        computadora.setStateComputadora(new Prendido());
        computadora.viewState();

        computadora.setStateComputadora(new Apagado());
        computadora.viewState();

    }
}
