package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDos {
    public static void main(String[] args) {

        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese su peso: ");
            calculadoraIMC.setPeso(teclado.nextDouble());
            System.out.println("Ingrese su altura: ");
            calculadoraIMC.setAltura(teclado.nextDouble());
            calculadoraIMC.calcularIMC();

            Integer numero = new Integer(10);
            numero = null;
            System.out.println(numero.byteValue());

        } catch (InputMismatchException e) {
            System.out.println("Error revisa tu entrada ");
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Objeto nulo revisa tu entrada ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido");
            System.out.println(e.getMessage());
        }
        System.out.println("Su IMC es: " + calculadoraIMC.getImc());


    }
}