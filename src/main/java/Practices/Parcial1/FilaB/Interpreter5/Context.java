package Practices.Parcial1.FilaB.Interpreter5;

public class Context {
    protected String input = "";
    protected int output = 0;
    protected boolean signo = true; //true : suma
    //false : division
    public Context(String input){
        this.input = input;
    }
}
