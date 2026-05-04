package org.example.vista;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiVentana extends Frame {
    private Label peso;
    private Label estatura;
    private TextField entrada1;
    private TextField entrada2;
    private Button boton1;
    private Label resultado;

    public MiVentana(){
        super("Calculadora Indice de Masa Corporal");
        setSize(800,600);

        setLayout(new FlowLayout());
        peso = new Label("Ingrese su peso en kilogramos");
        entrada1 = new TextField(10);
        estatura = new Label("Ingrese su estatura en metros");
        entrada2 = new TextField(10);
        boton1 = new Button("Calcular IMC");

        resultado = new Label("Índice de Masa Corporal (IMC)");
        //boton2.addMouseListener(new EventosRaton());
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double weight = Double.parseDouble(entrada1.getText());
                double height = Double.parseDouble(entrada2.getText());
                double indice = weight / (height * height);
                resultado.setText(String.valueOf(indice));

            }
        });
        add(peso);
        add(entrada1);
        add(estatura);
        add(entrada2);
        add(boton1);
        add(resultado);
        addMouseListener(new EventosRaton());

        addWindowListener(new EventosVentana());
        setVisible(true);

    }

}
