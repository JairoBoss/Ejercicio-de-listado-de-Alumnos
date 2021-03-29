/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

/**
 *
 * @author Megabit
 */
public class CalificacionErroneaExeption extends Exception {

    /**
     * Creates a new instance of <code>CalificacionErroneaExeption</code>
     * without detail message.
     */
    public CalificacionErroneaExeption() {
    }

    /**
     * Constructs an instance of <code>CalificacionErroneaExeption</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public CalificacionErroneaExeption(String msg) {
        super(msg);
    }
}
