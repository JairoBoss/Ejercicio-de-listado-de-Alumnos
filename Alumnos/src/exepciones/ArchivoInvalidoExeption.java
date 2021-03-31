/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import controlador.Controller;

/**
 *
 * @author Megabit
 */
public class ArchivoInvalidoExeption extends Exception {

    /**
     * Creates a new instance of <code>ArchivoInvalidoExeption</code> without
     * detail message.
     */
    public ArchivoInvalidoExeption() {
    }

    /**
     * Constructs an instance of <code>ArchivoInvalidoExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ArchivoInvalidoExeption(String msg) throws ArchivoInvalidoExeption, CargarArchivoExption {
        super(msg);

    }
}
