package org.example.view;

import org.example.model.ModeloComboIdiomas;
import org.example.model.ModeloDefaultComboIdiomas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame {

    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblIdioma;
    private JComboBox<String> combo;
    private JLabel lblPalabra;
    private JTextField txtPalabra;
    private JLabel lblSignificado;
    private JTextArea txtSignificado;
    private JLabel lblEjemplo;
    private JTextArea txtEjemplo;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JButton btnAgregar;
    private JScrollPane scrollPane;
    private JTable tblPalabras;

    private JButton btnGuardarAArchivo;
    private JButton btnLeerDeArchivo;
    private JButton btnEliminar;


    public VentanaPrincipal() {
        super("Bienvenido...");
        setLayout(new GridLayout(2,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //declaramos paneles
        pnlPanel1 = new JPanel();
        pnlPanel1.setBackground(new Color(159, 125, 243, 223));
        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(new Color(121, 153, 225));
        combo = new JComboBox<>();

        ArrayList<String> lenguas = new ArrayList<>();
        lenguas.add("Inglés");
        lenguas.add("Francés");
        lenguas.add("Alemán");
        //ModeloComboIdiomas mod = new ModeloComboIdiomas(lenguas);
        ModeloDefaultComboIdiomas mod = new ModeloDefaultComboIdiomas(lenguas);
        combo.setModel(mod);

        //declaramos componentes
        lblIdioma = new JLabel("Selecciona idioma: ");
        lblPalabra = new JLabel("Nueva palabra: ");
        txtPalabra = new JTextField(20);
        lblSignificado = new JLabel("Significado: ");
        txtSignificado = new JTextArea(3,20);
        lblEjemplo = new JLabel("Ejemplo: ");
        txtEjemplo = new JTextArea(3,20);

        rb1 = new JRadioButton("Sustantivo");
        rb2 = new JRadioButton("Verbo");
        rb3 = new JRadioButton("Adjetivo");
        rb1.setBounds(50,30,100,30);
        rb2.setBounds(50,60,100,30);
        rb3.setBounds(50,90,100,30);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        btnAgregar = new JButton("Agregar");
        btnGuardarAArchivo = new JButton("Guardar en archivo");
        btnLeerDeArchivo = new JButton("Leer de archivo");
        btnEliminar = new JButton("Eliminar palabra");
        scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(500,200));
        tblPalabras = new JTable();
        scrollPane.setViewportView(tblPalabras);

        //agregamos los componentes al panel

        pnlPanel1.add(lblIdioma);
        pnlPanel1.add(combo);
        pnlPanel1.add(lblPalabra);
        pnlPanel1.add(txtPalabra);
        pnlPanel1.add(lblSignificado);
        pnlPanel1.add(txtSignificado);
        pnlPanel1.add(lblEjemplo);
        pnlPanel1.add(txtEjemplo);
        pnlPanel1.add(rb1);
        pnlPanel1.add(rb2);
        pnlPanel1.add(rb3);
        pnlPanel1.add(btnAgregar);
        //pnlPanel2.add(tblPalabras);
        pnlPanel2.add(scrollPane);
        pnlPanel2.add(btnGuardarAArchivo);
        pnlPanel2.add(btnLeerDeArchivo);
        pnlPanel2.add(btnEliminar);




        //agregamos panel al frame

        getContentPane().add(pnlPanel1,0);
        getContentPane().add(pnlPanel2, 1);



        setSize(650,600);
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

    public JLabel getLblIdioma() {
        return lblIdioma;
    }

    public void setLblIdioma(JLabel lblIdioma) {
        this.lblIdioma = lblIdioma;
    }

    public JComboBox<String> getCombo() {
        return combo;
    }

    public void setCombo(JComboBox<String> combo) {
        this.combo = combo;
    }

    public JLabel getLblPalabra() {
        return lblPalabra;
    }

    public void setLblPalabra(JLabel lblPalabra) {
        this.lblPalabra = lblPalabra;
    }

    public JTextField getTxtPalabra() {
        return txtPalabra;
    }

    public void setTxtPalabra(JTextField txtPalabra) {
        this.txtPalabra = txtPalabra;
    }

    public JLabel getLblSignificado() {
        return lblSignificado;
    }

    public void setLblSignificado(JLabel lblSignificado) {
        this.lblSignificado = lblSignificado;
    }

    public JTextArea getTxtSignificado() {
        return txtSignificado;
    }

    public void setTxtSignificado(JTextArea txtSignificado) {
        this.txtSignificado = txtSignificado;
    }

    public JLabel getLblEjemplo() {
        return lblEjemplo;
    }

    public void setLblEjemplo(JLabel lblEjemplo) {
        this.lblEjemplo = lblEjemplo;
    }

    public JTextArea getTxtEjemplo() {
        return txtEjemplo;
    }

    public void setTxtEjemplo(JTextArea txtEjemplo) {
        this.txtEjemplo = txtEjemplo;
    }

    public JRadioButton getRb1() {
        return rb1;
    }

    public void setRb1(JRadioButton rb1) {
        this.rb1 = rb1;
    }

    public JRadioButton getRb2() {
        return rb2;
    }

    public void setRb2(JRadioButton rb2) {
        this.rb2 = rb2;
    }

    public JRadioButton getRb3() {
        return rb3;
    }

    public void setRb3(JRadioButton rb3) {
        this.rb3 = rb3;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblPalabras() {
        return tblPalabras;
    }

    public void setTblPalabras(JTable tblPalabras) {
        this.tblPalabras = tblPalabras;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JButton getBtnGuardarAArchivo() {
        return btnGuardarAArchivo;
    }

    public void setBtnGuardarAArchivo(JButton btnGuardarAArchivo) {
        this.btnGuardarAArchivo = btnGuardarAArchivo;
    }

    public JButton getBtnLeerDeArchivo() {
        return btnLeerDeArchivo;
    }

    public void setBtnLeerDeArchivo(JButton btnLeerDeArchivo) {
        this.btnLeerDeArchivo = btnLeerDeArchivo;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public void limpiar() {
        txtPalabra.setText("");
        txtSignificado.setText("");
        txtEjemplo.setText("");
    }

    public boolean validar() {
        return !txtPalabra.getText().isEmpty() && !txtSignificado.getText().isEmpty() &&!txtEjemplo.getText().isEmpty();
    }

}
