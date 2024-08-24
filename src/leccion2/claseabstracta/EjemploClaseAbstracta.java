package leccion2.claseabstracta;

import leccion1.ManejadorFigurasGeometricas;
import leccion1.Triangulo;

public class EjemploClaseAbstracta {

    public static void main(String[] args) {
        // FiguraGeometrica miFigura = new FiguraGeometrica(); - Esto causaría un error ya que no se puede instanciar una clase abstracta
        // miFigura.calcularArea();

        System.out.println("---------------- IMPLEMENTACION 1 DE CLASE ABSTRACTA -------------------");

        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        // Llamar al método concreto de la clase abstracta
        circulo.mostrarTipo(); // Imprime: Soy una figura geométrica.
        System.out.println("Área del círculo: " + circulo.calcularArea()); // Calcula e imprime el área del círculo
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro()); // Calcula e imprime el perímetro del círculo

        rectangulo.mostrarTipo(); // Imprime: Soy una figura geométrica.
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea()); // Calcula e imprime el área del rectángulo
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro()); // Calcula e imprime el perímetro del rectángulo

        System.out.println("---------------- IMPLEMENTACION 2 DE CLASE ABSTRACTA -------------------");

        Triangulo triangulo = new Triangulo(20, 2);

        System.out.println("Circulo encaja?: " + ManejadorFigurasGeometricas.figuraEncajaEnEspacio(circulo));
        System.out.println("Rectángulo encaja?: " + ManejadorFigurasGeometricas.figuraEncajaEnEspacio(rectangulo));
        System.out.println("Triangulo encaja?: " + ManejadorFigurasGeometricas.figuraEncajaEnEspacio(triangulo));

        System.out.println("---------------- IMPLEMENTACION 3 DE CLASE ABSTRACTA -------------------");

        Circulo otroCirculo = (Circulo) ManejadorFigurasGeometricas.crearFiguraGeometrica("Circulo");
        System.out.println(otroCirculo.calcularArea());

    }
}