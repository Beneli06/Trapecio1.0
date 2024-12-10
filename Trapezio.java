public class Trapezio {
    private final double baseMayor;
    private final double baseMenor;
    private final double lado1;
    private final double lado2;
    private final double altura;

    public Trapezio(double baseMayor, double baseMenor, double lado1, double lado2, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }

    public static void main(String[] args) {
        Trapezio trapezio = new Trapezio(8, 6, 5, 5, 4);
        System.out.println("Área: " + trapezio.calcularArea());
        System.out.println("Perímetro: " + trapezio.calcularPerimetro());
    }
}
