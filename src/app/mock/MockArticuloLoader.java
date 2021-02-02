package app.mock;

import java.util.ArrayList;
import java.util.List;
import model.Articulo;
import view.ArticuloLoader;

/**
 *
 * @author Hector
 */
public class MockArticuloLoader implements ArticuloLoader{

    @Override
    public List<Articulo> loader() {
        List<Articulo> lista = new ArrayList();
        Articulo collar = new Articulo("Collar de Oro, usado durante 3 años", 100,"foto1.jpg");
        Articulo anillo = new Articulo("Anillo de boda, 16mm de diametro", 615, "anillo.jpg");
        lista.add(anillo);
        lista.add(collar);
        return lista;
    }

}
