package leccion2.claseabstracta;

// Otra subclase concreta que extiende la clase abstracta
public class Rectangulo extends FiguraGeometrica {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método abstracto
    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return (largo + ancho) * 2;
    }
}
