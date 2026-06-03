package org.example.controller;

import org.example.model.ModeloTablaPalabras;
import org.example.model.Palabra;
import org.example.utilerias.PalabrasArchivo;
import org.example.view.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ControladorPrincipal implements MouseListener {
    private VentanaPrincipal view;
    private ModeloTablaPalabras modelTabla;
    private PalabrasArchivo archivo;

    public ControladorPrincipal(VentanaPrincipal vista) {
        this.view = vista;
        archivo = new PalabrasArchivo("palabrasDB.dat");
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblPalabras().addMouseListener(this);
        this.view.getBtnGuardarAArchivo().addMouseListener(this);
        this.view.getBtnLeerDeArchivo().addMouseListener(this);

        modelTabla = new ModeloTablaPalabras();
        this.view.getTblPalabras().setModel(modelTabla);
        this.view.getTblPalabras().updateUI();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnAgregar()) {
            System.out.println("Agregando nueva palabra");
            Palabra word = new Palabra(
                    this.view.getCombo().getSelectedItem().toString(),
                    this.view.getTxtPalabra().getText(),
                    this.view.getTxtSignificado().getText(),
                    this.view.getTxtEjemplo().getText(),
                    "");
            if(this.view.getRb1().isSelected()){
                word.setCategoria("Sustantivo");
            } else if (this.view.getRb2().isSelected()) {
                word.setCategoria("Verbo");
            } else if (this.view.getRb3().isSelected()) {
                word.setCategoria("Adjetivo");
            }
            if(this.view.validar()) {
                modelTabla.agregarPalabra(word);
                this.view.getTblPalabras().updateUI();
                this.view.limpiar();
            }else{
               JOptionPane.showMessageDialog(this.view,"Faltan datos por completar");
            }

        }

        if(e.getSource() == this.view.getTblPalabras()){
            System.out.println("Click en la tabla");
            System.out.println(this.view.getTblPalabras().getSelectedRow());

        }

        if (e.getSource() == this.view.getBtnGuardarAArchivo()){
            System.out.println("Guardar archivo");
            archivo.escribirPalabras(modelTabla.getData());
        }

        if (e.getSource() == this.view.getBtnLeerDeArchivo()){
            System.out.println("Leer de archivo");
            modelTabla.setData(archivo.leerPalabras());
            this.view.getTblPalabras().updateUI();
        }

        if (e.getSource() == this.view.getBtnEliminar()){
            modelTabla.eliminarPalabra(this.view.getTblPalabras().getSelectedRow());
            this.view.getTblPalabras().updateUI();
        }


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
