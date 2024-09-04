package leccion5;

public class Casa<T> {

    private T mascota;

    public Casa(T unaMascota) {
        this.mascota = unaMascota;
    }

    public void emitirSonidoMascota() {
        System.out.println("!!!");
    }

    public static void main(String[] args) {
        Casa<Animal> casa1 = new Casa<>(new Perro());
        casa1.emitirSonidoMascota();
        Casa<? extends Animal> casa2 = new Casa<>(new Perro());
        //casa2 = new Casa<>(new Gato());
    }
}
