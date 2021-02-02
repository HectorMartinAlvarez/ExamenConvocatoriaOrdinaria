package control;

import model.Subasta;

/**
 *
 * @author Hector
 */
public class EntrarCommand implements Command{

    @Override
    public void execute(Object obj) {
    }
    
    public PujarCommand entrar(Subasta subastaActual){
        return new PujarCommand(subastaActual);
    }

}
