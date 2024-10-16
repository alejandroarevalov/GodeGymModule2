package leccion17.proxy;

import leccion17.Deportista;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MajeadorInvocacion implements InvocationHandler {

    private Deportista objetoReal;

    public MajeadorInvocacion(Deportista objetoReal) {
        this.objetoReal = objetoReal;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("El futbolista se está preparando para correr");
        // var resultado = method.invoke(objetoReal, args);
        var otraCosa = method.getDeclaringClass().getMethod("getCantidadPasesEntregados").invoke(objetoReal);
        System.out.println("Cantidad de pases entregados: " + otraCosa);
        System.out.println("El futbolista ha terminado de correr");
        return otraCosa;
    }
}
