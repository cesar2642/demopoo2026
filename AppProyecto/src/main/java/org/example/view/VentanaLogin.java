package org.example.view;

import javax.swing.*;
import java.awt.*;

public class VentanaLogin extends JFrame {

    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JPanel pnlPanel3;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblContrasenia;
    private JTextField txtContrasenia;
    private JButton btnSaludar;
    private JLabel lblSalida;
    private ImageIcon imgbomba;
    private JLabel lblimagen;
    private ImageIcon imgCandado;
    private JLabel lblImagenCandado;
    //private ImageIcon bomba = new ImageIcon("img/bomb cartoon.png");
    // private JLabel lblimagen = new JLabel(bomba);


    public VentanaLogin() {
        super("Login de inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        //setLayout(new GridLayout(2,1));
        //declarar paneles
        pnlPanel1 = new JPanel();
        pnlPanel1.setBackground(new Color(112, 142, 228));
        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(new Color(38, 42, 241));
        pnlPanel3 = new JPanel();
        pnlPanel3.setBackground(new Color(33, 26, 232));

        //declarar componentes
        lblNombre = new JLabel("Ingrese su ID: ");
        txtNombre = new JTextField(20);
        lblContrasenia = new JLabel("Ingrese la contraseña ");
        txtContrasenia = new JTextField(20);
        btnSaludar = new JButton("Ingresar ");
        lblSalida = new JLabel("...");
        //lblimagen.setBounds(100,10,100,100);
        imgbomba = new ImageIcon(getClass().getResource("/img/imgpassword1.png"));
        lblimagen = new JLabel(imgbomba);
        imgCandado = new ImageIcon(getClass().getResource("/img/candadoresize.png"));
        lblImagenCandado = new JLabel(imgCandado);


        //agregar componentes al panel
        pnlPanel1.add(lblNombre);
        pnlPanel1.add(txtNombre);
        pnlPanel1.add(lblContrasenia);
        pnlPanel1.add(txtContrasenia);
        pnlPanel1.add(btnSaludar);
        pnlPanel1.add(lblSalida);
        pnlPanel2.add(btnSaludar);
        pnlPanel2.add(lblImagenCandado);
        pnlPanel3.add(lblimagen);

        //agregar panel al frame
        this.getContentPane().add(pnlPanel2, 0);
        this.getContentPane().add(pnlPanel1, 1);
        this.getContentPane().add(pnlPanel3, 2);
        //this.getContentPane().add(pnlPanel1,0);
        //this.getContentPane().add(pnlPanel2,1);


        setSize(800, 600);
        setVisible(true);

    }

    public JPanel getPnlPanel1() {
        return pnlPanel1;
    }

    public void setPnlPanel1(JPanel pnlPanel1) {
        this.pnlPanel1 = pnlPanel1;
    }

    public JPanel getPnlPanel2() {
        return pnlPanel2;
    }

    public void setPnlPanel2(JPanel pnlPanel2) {
        this.pnlPanel2 = pnlPanel2;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JLabel getLblContrasenia() {
        return lblContrasenia;
    }

    public void setLblContrasenia(JLabel lblContrasenia) {
        this.lblContrasenia = lblContrasenia;
    }

    public JTextField getTxtContrasenia() {
        return txtContrasenia;
    }

    public void setTxtContrasenia(JTextField txtContrasenia) {
        this.txtContrasenia = txtContrasenia;
    }

    public JButton getBtnSaludar() {
        return btnSaludar;
    }

    public void setBtnSaludar(JButton btnSaludar) {
        this.btnSaludar = btnSaludar;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }
    /*
    public ImageIcon getBomba() {
        return bomba;
    }

    public void setBomba(ImageIcon bomba) {
        this.bomba = bomba;
    }

    public JLabel getLblimagen() {
        return lblimagen;
    }

    public void setLblimagen(JLabel lblimagen) {
        this.lblimagen = lblimagen;
    }

     */
}
