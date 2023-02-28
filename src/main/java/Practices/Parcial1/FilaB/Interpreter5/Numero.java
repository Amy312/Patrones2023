package Practices.Parcial1.FilaB.Interpreter5;

public class Numero extends OperacionesMatematicas{

    private int digit;
public Numero(int digit){
        this.digit = digit;
        }
@Override
public void interpreter(Context context) {
        if(context.signo){
        context.output = context.output + (Integer.parseInt(context.input.substring(0, this.digit)));

        }else{
        context.output = context.output / (Integer.parseInt(context.input.substring(0, this.digit)));

        }
        context.input = context.input.substring(this.digit);
        }
        }