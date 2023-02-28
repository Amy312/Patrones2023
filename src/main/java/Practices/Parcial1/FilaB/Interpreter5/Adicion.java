package Practices.Parcial1.FilaB.Interpreter5;

public class Adicion extends OperacionesMatematicas{
    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("+")){
            context.signo = true;
            context.input = context.input.substring(1);
        }
    }
}

