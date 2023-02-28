package Practices.Parcial1.FilaB.Interpreter5;

public class Division extends OperacionesMatematicas{
    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("/")){
            context.signo = false;
            context.input = context.input.substring(1);
        }
    }
}