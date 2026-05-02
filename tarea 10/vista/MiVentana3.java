package org.example.vista;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiVentana3 extends Frame {
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;

    public MiVentana3(){
        super("Mi Ventana 3");
        setSize(400,300);

        setLayout(new GridLayout(3,2));
        boton1 = new Button("Presioname");
        boton2 = new Button("En segundo lugar a este");
        boton3 = new Button("Despues a este");
        boton4 = new Button("Por ultimo a este");

        add(boton1,0);
        add(boton2,1);
        add(boton3,2);
        add(boton4,3);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

}
