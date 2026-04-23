public class Cubo implements Figura{
    private double lado;

    public Cubo() {
    }

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                '}';
    }

    public double calcularVolumen(){
        return this.lado * this.lado * this.lado;
    }
}
