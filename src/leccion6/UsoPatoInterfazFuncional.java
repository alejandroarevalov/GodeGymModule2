package leccion6;

@FunctionalInterface
interface PatoInterfazFuncional {

    String graznar();
}

public class UsoPatoInterfazFuncional {
    PatoInterfazFuncional pato = () -> "Quack quack";

    public static void main(String[] args) {
        UsoPatoInterfazFuncional usoPato = new UsoPatoInterfazFuncional();
        usoPato.pato.graznar();
    }
}
