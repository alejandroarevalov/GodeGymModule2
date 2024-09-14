package leccion8;

public class EjemploOrdenInicializacionVariables {

    /* Tabla de inicialización de variables por de
        int -> 0
        short -> 0
        long -> 0L
        double -> 0.0d
        float -> 0.0
        byte -> 0
        char -> '\0'  Caracter vacio
        boolean -> false
        Object y derivados -> null
    */

    public static final String variable = "Hola";

    private int x = getX() + getY(); // x = getX() + y -> genera error
    private int y = getX() + getY();
    private int z = getX() + getY() + getZ();




    public EjemploOrdenInicializacionVariables() {
    }

    public EjemploOrdenInicializacionVariables(int valorX, int valorY, int valorZ) {
        this.x = valorX;
        this.y = valorY;
        this.z = valorZ;
        System.out.println(variable);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public static void main(String[] args) {
        EjemploOrdenInicializacionVariables ejemplo = new EjemploOrdenInicializacionVariables();
        System.out.println(String.format("X: %d, Y: %d, Z: %d", ejemplo.getX(), ejemplo.getY(), ejemplo.getZ()));
    }
}
