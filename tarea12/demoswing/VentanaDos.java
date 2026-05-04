package org.example.demoswing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaDos extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel etiqueta;
    private JButton boton;
    private JComboBox<String> combo;

    public VentanaDos() {
        super("Mi segunda ventana Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout = new GridLayout(2,2);
        getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        combo = new JComboBox<>();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Hector");
        nombres.add("Ana");
        nombres.add("Ramon");
        nombres.add("Ernesto");
        nombres.add("Jesus");
        ModeloComboNombres modelo = new ModeloComboNombres(nombres);
        combo.setModel(modelo);


        panel1.setBackground(new Color(186,89,70));
        panel2.setBackground(new Color(92, 122, 212));
        panel3.setBackground(new Color(222,22,22));
        panel4.setBackground(Color.CYAN);

        etiqueta = new JLabel("Soy un label");
        boton = new JButton("Soy un botón");

    panel1.add(etiqueta);
    panel2.add(boton);
    panel3.add(combo);

        getContentPane().add(panel1,0);
        getContentPane().add(panel2,1);
        getContentPane().add(panel3,2);
        getContentPane().add(panel4,3);


        setSize(800,600);
        setVisible(true);
    }

}
