package org.example.controller;

import org.example.view.VentanaLogin;
import org.example.view.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorLogin implements MouseListener{


    private VentanaLogin view;

    public ControladorLogin(VentanaLogin vista) {
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
        this.view.getLblNombre().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("Hola desde CDMX");
        //this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
        if (e.getSource() == this.view.getBtnSaludar()) {
            System.out.println("Hola desde CDMX");
            //this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
            if (view.getTxtNombre().getText().equals("admin") && view.getTxtContrasenia().getText().equals("123")) {
                this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
                JOptionPane.showMessageDialog(null, "Acceso concedido");
                new VentanaPrincipal();
                view.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado, intenta de nuevo");
            }
        }
        if (e.getSource() == this.view.getLblNombre()) {
            System.out.println("hola desde la etiqueta ");
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


