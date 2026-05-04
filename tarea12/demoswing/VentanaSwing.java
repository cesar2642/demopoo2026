package org.example.demoswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JTextField entrada;
    private JButton boton;


    public VentanaSwing() {
        super("Mi primer ventana Swing");
        this.getContentPane().setLayout(new GridLayout(3,3));
        etiqueta = new JLabel("Dame un número");
        entrada = new JTextField(10);
        boton = new JButton("Enviar");
        boton.setForeground(new Color(91,152,235));
        boton.setBackground(new Color(222,42,42));
        etiqueta.setForeground(new Color(222,42,42));
        etiqueta.setOpaque(true);
        boton.setSize(100,100);


        getContentPane().add(etiqueta,0);
        getContentPane().add(entrada,1);
        getContentPane().add(boton,2);


        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double entradaCelsius = Double.parseDouble(entrada.getText());
                double gradosFahrenheit = (entradaCelsius * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, "En Fahrenheit es: " + gradosFahrenheit);
            }
        });

        entrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola desde el click a cuadro dialogo");
            }
        });

        entrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Hola desde el keyTyped al cuadro de entrada");
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
            }
        });

    }

}
