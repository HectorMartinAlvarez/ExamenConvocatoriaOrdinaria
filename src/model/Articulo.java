package model;

/**
 *
 * @author Hector
 */
public class Articulo {

    private final String descripcion;
    private final int inicialPrice;
    private final String fotos;

    public Articulo(String descripcion, int inicialPrice, String fotos) {
        this.descripcion = descripcion;
        this.inicialPrice = inicialPrice;
        this.fotos = fotos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getInicialPrice() {
        return inicialPrice;
    }

    public String getFotos() {
        return fotos;
    }
}
