package org.example.vista;

import java.awt.*;

public class MiVentana extends Frame {
    private Button boton1;
    private Button boton2;
    private TextField texto;
    private FlowLayout layout;

    public MiVentana() {
        super("Mi Ventana"); //Frame("Mi
        setSize(800,600);
        layout = new FlowLayout();
        setLayout(new FlowLayout());
        boton1 = new Button("Presioname!!!");
        boton2 = new Button("Hola");
        boton1.setSize(100,100);
        texto = new TextField();
        add(boton1);
        add(boton2);
        add(texto);
        setVisible(true);
    }
}
