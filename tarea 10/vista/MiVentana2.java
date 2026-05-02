package org.example.vista;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiVentana2 extends Frame {
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;

    public MiVentana2(){
        super("Mi Ventana 2");
        setSize(400,300);
        setResizable(false);

        setLayout(new BorderLayout());
        boton1 = new Button("Norte");
        boton2 = new Button("Sur");
        boton3 = new Button("Este");
        boton4 = new Button("Oeste");

        add("North", boton1);
        add("South", boton2);
        add("West", boton4);
        add("East", boton3);
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
