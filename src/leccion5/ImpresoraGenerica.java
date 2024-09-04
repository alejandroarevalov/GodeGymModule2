package leccion5;

public class ImpresoraGenerica<T extends Number, U> {

    private final T algoParaImprimir;
    private U otroCampo;

    public ImpresoraGenerica(T cosaParaImprimir) {
        this.algoParaImprimir = cosaParaImprimir;
        otroCampo = null;
    }

    public ImpresoraGenerica(T cosaParaImprimir, U otraCosa) {
        this.algoParaImprimir = cosaParaImprimir;
        this.otroCampo = otraCosa;
    }

    public void imprimirCosa() {
        System.out.println(algoParaImprimir.toString());
        System.out.println(otroCampo);
    }

    public static void main(String[] args) {
        ImpresoraGenerica<Integer, Object> impresoraEnteros = new ImpresoraGenerica<>(533);
        ImpresoraGenerica<Double, String> impresoraDoubles = new ImpresoraGenerica<>(Math.PI);
        // La siguiente línea marca error por que String no es un tipo de la familia de Number
        //ImpresoraGenerica<String> impresoraString = new ImpresoraGenerica<>("No se puede");
        impresoraEnteros.imprimirCosa();
        impresoraDoubles.imprimirCosa();

    }
}
