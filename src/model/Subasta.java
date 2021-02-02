package model;

import java.util.SortedSet;

/**
 *
 * @author Hector
 */
public class Subasta {

    private final int time;
    private final SortedSet<Integer> pujas;
    private final Articulo articulo;

    public Subasta(int time, SortedSet<Integer> pujas, Articulo articulo) {
        this.time = time;
        this.pujas = pujas;
        this.articulo = articulo;
    }

    public int getTime() {
        return time;
    }

    public SortedSet<Integer> getPujas() {
        return pujas;
    }

    public Articulo getArticulo() {
        return articulo;
    }
    
    public boolean addPuja(int nuevaPuja){
        int last = pujas.last();
        if(nuevaPuja <= last){
            return false;
        }
        pujas.add(nuevaPuja);
        return true;
    }
}
