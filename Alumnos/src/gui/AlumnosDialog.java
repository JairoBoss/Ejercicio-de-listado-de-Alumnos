/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import exepciones.CalificacionErroneaExeption;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import model.Alumno;
import model.Carrera;

/**
 *
 * @author Megabit
 */
public class AlumnosDialog extends JDialog {

    private JComboBox comboBoxCarreras;
    private String[] carreras;
    private JLabel lblCarrera;

    private AlumnoDialogListener listener;



    private JLabel lblNoControl;
    private JTextField edtNoControl;

    private JLabel lblNombre;
    private JTextField edtNombre;

    private JLabel lblPaterno;
    private JTextField edtPaterno;

    private JLabel lblMaterno;
    private JTextField edtMaterno;

    private JLabel lblCalificacion;
    private JTextField edtCalificacion;

    private JButton btnAceptar;
    private JButton btnCancelar;

    public AlumnosDialog(JFrame parent) {
        super(parent, true);
        super.setSize(207, 364);
        super.setLocationRelativeTo(parent);
        super.setLayout(new FlowLayout());

        lblNoControl = new JLabel("No. de control");
        edtNoControl = new JTextField(15);

        lblNombre = new JLabel("Nombre del alumno");
        edtNombre = new JTextField(15);

        carreras = new String[]{"SISTEMAS", "ELECTRONICA", "NUTRICION", "ARQUITECTURA", "GASTRONOMIA", "FISIOTERAPIA","DERECHO","ENFERMERIA"};
        comboBoxCarreras = new JComboBox(carreras);
        comboBoxCarreras.setSelectedIndex(-1);
        lblCarrera = new JLabel("Selecciona la carrera");

        lblPaterno = new JLabel("Apellido paterno");
        edtPaterno = new JTextField(15);

        lblMaterno = new JLabel("Apellido Materno");
        edtMaterno = new JTextField(15);

        lblCalificacion = new JLabel("Calificacion");
        edtCalificacion = new JTextField(15);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno alumno;
                try {


                    String x = ((String) comboBoxCarreras.getSelectedItem());

                    if  (edtNoControl.getText().isEmpty() || edtNombre.getText().isEmpty() || edtPaterno.getText().isEmpty() || edtMaterno.getText().isEmpty() || x == null){
                        if (edtNoControl.getText().isEmpty()) {
                            edtNoControl.requestFocus(true);
                            JOptionPane.showMessageDialog(AlumnosDialog.this, "Agrega un ID", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        if (edtNombre.getText().isEmpty()) {
                            edtNombre.requestFocus(true);
                            JOptionPane.showMessageDialog(AlumnosDialog.this, "Agrega un apellido nombre", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        if (edtPaterno.getText().isEmpty()) {
                            edtPaterno.requestFocus(true);
                            JOptionPane.showMessageDialog(AlumnosDialog.this, "Agrega un apellido paterno", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        if (edtMaterno.getText().isEmpty()) {
                            edtMaterno.requestFocus(true);
                            JOptionPane.showMessageDialog(AlumnosDialog.this, "Agrega un apellido materno", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        if (x == null) {
                            JOptionPane.showMessageDialog(AlumnosDialog.this, "Agrega una carrera", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{

                    alumno = new Alumno(edtNoControl.getText(),
                            edtNombre.getText(),
                            edtPaterno.getText(),
                            edtMaterno.getText(),
                            (new Double(edtCalificacion.getText())),
                            ((String) comboBoxCarreras.getSelectedItem()));

                    listener.aceptarButtonClick(alumno);

                    }
                } catch (CalificacionErroneaExeption ex) {
                    JOptionPane.showMessageDialog(AlumnosDialog.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AlumnosDialog.this, "Error al convertir la calificaion", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.cancelarButtonClick();
            }
        });

        super.add(lblNoControl);
        super.add(edtNoControl);


        super.add(lblNombre);
        super.add(edtNombre);

        super.add(lblPaterno);
        super.add(edtPaterno);

        super.add(lblMaterno);
        super.add(edtMaterno);

        super.add(lblCarrera);
        super.add(comboBoxCarreras);

        super.add(lblCalificacion);
        super.add(edtCalificacion);


        super.add(btnAceptar);
        super.add(btnCancelar);


    }

    public void setListener(AlumnoDialogListener listener) {
        this.listener = listener;
    }
}
