package control;

/**
 *
 * @author Hector
 */
public class ExitCommand implements Command{

    @Override
    public void execute(Object obj) {
        System.exit(0);
    }

}
