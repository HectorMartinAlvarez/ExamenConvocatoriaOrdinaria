package app.mock;

import view.DisplaySubasta;

/**
 *
 * @author Hector
 */
public class MockDisplaySubasta implements DisplaySubasta{

    @Override
    public void display() {
        System.out.println("############################");
        System.out.println("Subasta 1, Articulo Anillo");
        System.out.println("Subasta 2, Articulo Collar");
        System.out.println("Pulse 1 para ver la Subasta 1");
        System.out.println("Pulse 2 para ver la Subasta 2");
    }

}
