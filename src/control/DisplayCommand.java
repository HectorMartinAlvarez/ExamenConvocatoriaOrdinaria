package control;

import model.Subasta;

/**
 *
 * @author Hector
 */
public class DisplayCommand implements Command{
    
    private Subasta subastaActual;

    @Override
    public void execute(Object subasta) {
        if(subasta instanceof Subasta){
            subastaActual = (Subasta) subasta;
        }else {
            return;
        }
        System.out.println("##########################################");
        System.out.println("Descripcion: " + subastaActual.getArticulo().getDescripcion());
        System.out.println("Precio Inicial: " + subastaActual.getArticulo().getInicialPrice());
        System.out.println(subastaActual.getArticulo().getFotos());
        System.out.println("Tiempo restante: " + subastaActual.getTime());
        System.out.println("Pujas: ");
        for (Integer puja : subastaActual.getPujas()) {
            System.out.println(puja);
        }
        System.out.println("Si quiere pujar introduzca una cantidad y presione enter (Solo numeros enteros)");
    }
    
    public void setSubasta(Subasta subasta){
        this.subastaActual = subasta;
    }

}
