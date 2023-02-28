package Practices.Parcial1.FilaB.Interpreter5;

import java.util.ArrayList;
import java.util.List;
public class Evaluador extends OperacionesMatematicas{

    private List<OperacionesMatematicas> lista = new ArrayList<>();
    private Context context;

    public Evaluador(String input){
        context = new Context(input.replace(" ",""));
        for (String valor : input.split(" ")){
            switch (valor){
                case "+":
                    lista.add(new Adicion());
                    break;
                case "/":
                    lista.add(new Division());
                    break;
                default:
                    lista.add(new Numero(valor.length()));
            }
        }
    }

    public int resultado(){
        for(OperacionesMatematicas operacionesMatematicas:lista){
            operacionesMatematicas.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}