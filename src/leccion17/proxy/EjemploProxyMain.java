package leccion17.proxy;

import leccion17.Deportista;
import leccion17.Futbolista;

import java.lang.reflect.Proxy;

public class EjemploProxyMain {

    public static void main(String[] args) throws Exception {
        Futbolista futbolista = Futbolista.class.getConstructor().newInstance();
        Futbolista.class.getMethod("setNombre", String.class).invoke(futbolista, "Alejandro");

        MajeadorInvocacion majeadorInvocacion = new MajeadorInvocacion(futbolista);

        Deportista proxyFutbolista = (Deportista) Proxy.newProxyInstance(
            Deportista.class.getClassLoader(),
            new Class[]{Deportista.class},
            majeadorInvocacion
        );
        proxyFutbolista.correr();
    }
}
