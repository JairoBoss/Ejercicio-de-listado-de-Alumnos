package exepciones;

/**
 *
 * @author Megabit
 */
public class CampoVacio extends Exception {

    /**
     * Creates a new instance of <code>CalificacionErroneaExeption</code>
     * without detail message.
     */
    public CampoVacio() {
    }

    /**
     * Constructs an instance of <code>CalificacionErroneaExeption</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public CampoVacio(String msg) {
        super(msg);
    }
}
