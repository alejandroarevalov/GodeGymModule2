package leccion3;

public class Guitarra extends InstrumentoMusical {

    public Guitarra(int frecuenciaMinima, int frecuenciaMaxima, String marca, String material,
                    double precio) {
        super(frecuenciaMinima, frecuenciaMaxima, marca, material, precio);
    }

    public void reproducirSonido() {
        System.out.println(
            String.format(
                "Sonido reproducido en la frecuencia %d",
                elegirFrecuenciaReproduccionAleatoria()
            )
        );
    }

    private int elegirFrecuenciaReproduccionAleatoria() {
        return (int)(this.getRangoFrecuencias()[0] + this.getRangoFrecuencias()[1] * Math.random());
    }
}
