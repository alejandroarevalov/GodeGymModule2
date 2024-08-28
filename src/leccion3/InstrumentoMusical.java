package leccion3;

public class InstrumentoMusical {

    private int[] rangoFrecuencias;
    private String marca;
    private String material;
    private double precio;

    public InstrumentoMusical(int frecuenciaMinima, int frecuenciaMaxima, String marca, String material,
                              double precio) {
        this.rangoFrecuencias = new int[2];
        this.rangoFrecuencias[0] = frecuenciaMinima;
        this.rangoFrecuencias[1] = frecuenciaMaxima;
        this.marca = marca;
        this.material = material;
        this.precio = precio;
    }

    public int[] getRangoFrecuencias() {
        int temp[] = new int[2];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = rangoFrecuencias[i] * 1000;
        }
        return temp;
    }

    public void setRangoFrecuencias(int[] rangoFrecuencias) {
        this.rangoFrecuencias = rangoFrecuencias;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical { " +
                "frecuenciaMinima=" + rangoFrecuencias[0] +
                ", frecuenciaMaxima=" + rangoFrecuencias[1] +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", precio=" + precio +
                " }";
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
