package control;

import model.Subasta;

/**
 *
 * @author Hector
 */
public class PujarCommand implements Command {
    
    private final Subasta subastaActual;

    public PujarCommand(Subasta subastaActual) {
        this.subastaActual = subastaActual;
    }

    @Override
    public void execute(Object numero) {
        if(numero instanceof Integer){
            int puja = (int) numero;
            if(!subastaActual.addPuja(puja)){
                System.out.println("Su puja debeser mayor a la ultima cantidad pujada");
            }
        }
    }
    
    public void pujar(int numero){
        if(!subastaActual.addPuja(numero)){
            System.out.println("Su puja debeser mayor a la ultima cantidad pujada");
        }
    }

}
