package org.example;


import lombok.Data;

public @Data class CalculadoraIMC {
    private double peso;
    private double altura;
    private double imc;
    private String estado;

    public void calcularIMC(){
        this.imc = this.peso / (this.altura * this.altura);
    }

}

