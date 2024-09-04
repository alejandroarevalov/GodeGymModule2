package leccion5;

public abstract class Avatar {

    private String nombre;
    private int fuerza;
    private int vida;

    public Avatar() {
        this.nombre = "Desconocido";
        this.fuerza = (int) (Math.random() * 100);
        this.vida = (int) (Math.random() * 100);
    }

    public Avatar(String nombre) {
        this.nombre = nombre;
        this.fuerza = (int) (Math.random() * 100);
        this.vida = (int) (Math.random() * 100);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract int atacarFisicamente(Avatar otroAvatar);

    protected void mostrarEstadisticas() {
        System.out.println("Nombre: " + this.nombre +
                ", Tipo: " + this.getClass().getName().split("\\.")[1] +
                ", Vida: " + this.vida +
                ", Fuerza: " + this.fuerza);
    }
}
