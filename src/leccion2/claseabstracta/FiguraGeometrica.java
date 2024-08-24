package leccion2.claseabstracta;

public abstract class FiguraGeometrica {

    protected String color;
    // Método abstracto
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    // Método concreto
    public void mostrarTipo() {
        System.out.println("Soy una figura geométrica.");
    }
}
