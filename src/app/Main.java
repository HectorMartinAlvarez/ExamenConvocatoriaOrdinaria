package app;

import app.mock.MockArticuloLoader;
import app.mock.MockDisplaySubasta;
import control.EntrarCommand;
import control.PujarCommand;
import control.DisplayCommand;
import control.ExitCommand;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import model.Articulo;
import model.Subasta;

/**
 *
 * @author Hector
 */
public class Main {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static final EntrarCommand entrar = new EntrarCommand();
    private static PujarCommand pujar;
    private static final DisplayCommand display = new DisplayCommand();
    private static final ExitCommand exit = new ExitCommand();
    private static final MockDisplaySubasta subasta = new MockDisplaySubasta();
    private static final MockArticuloLoader loader = new MockArticuloLoader();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Articulo> articulos = loader.loader();
        SortedSet<Integer> pujas1 = new TreeSet();
        pujas1.add(616);
        pujas1.add(650);
        pujas1.add(690);
        SortedSet<Integer> pujas2 = new TreeSet();
        pujas2.add(120);
        pujas2.add(102);
        pujas2.add(140);
        Subasta subastaAnillo = new Subasta(10, pujas1, articulos.get(0));
        Subasta subastaCollar = new Subasta(20, pujas2, articulos.get(1));
        while(true){
            subasta.display();
            System.out.println("Escriba -1 para salir de la aplcacion");
            int input = input();
            if(input == -1) exit.execute(null);
            if(input == 1){
                pujar = entrar.entrar(subastaAnillo);
                while(true){
                    display.execute(subastaAnillo);
                    System.out.println("Escriba -1 para salir de la subasta");
                    int input1 = input();
                    if (input1 == -1) break;
                    pujar.execute(input1);
                }
            }
            if(input == 2){
                pujar = entrar.entrar(subastaCollar);
                while(true){
                    display.execute(subastaCollar);
                    System.out.println("Escriba -1 para salir de la subasta");
                    int input1 = input();
                    if (input1 == -1) break;
                    pujar.execute(input1);
                }
            }
        }
    }
    
    private static int input() {
        return scanner.nextInt();
    }
    
    
}
