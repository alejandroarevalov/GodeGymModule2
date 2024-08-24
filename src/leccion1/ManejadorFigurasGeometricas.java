package leccion1;

import leccion2.claseabstracta.Circulo;
import leccion2.claseabstracta.FiguraGeometrica;
import leccion2.claseabstracta.Rectangulo;

public class ManejadorFigurasGeometricas {

    private static double umbral = 50;
    public static boolean figuraEncajaEnEspacio(FiguraGeometrica figura) {
        double area = figura.calcularArea();
        return area <= umbral;
    }

    public static FiguraGeometrica crearFiguraGeometrica(String nombreFigura) {
        FiguraGeometrica figura = null;
        switch (nombreFigura) {
            case "Circulo":
                figura = new Circulo(1);
                break;
            case "Rectangulo":
                figura = new Rectangulo(1, 2);
                break;
            case "Triangulo":
                figura = new Triangulo(1, 2);
                break;
            default:
                break;
        }
        return figura;
    }
}
