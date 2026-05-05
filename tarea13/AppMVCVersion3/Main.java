package org.example;

import org.example.controller.ControladorPrincipal;
import org.example.view.VentanaPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventana);
    }
}
