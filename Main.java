

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Cubo cubo = new Cubo();
        cubo.setLado(5);
        System.out.println("volumen de cubo=" + cubo.calcularVolumen() );
        Esfera esfera = new Esfera();
        esfera.setRadio(2);
        System.out.println("volumen de esfera: " + esfera.calcularVolumen() );
    }
}