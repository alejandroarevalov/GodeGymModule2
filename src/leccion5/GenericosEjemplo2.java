package leccion5;

import java.util.ArrayList;
import java.util.List;

public class GenericosEjemplo2 {

    public static void main(String[] args) {
        Avatar luchador1 = new Luchador("Darius");
        Avatar luchador2 = new Luchador("Nasus");
        luchador1.atacarFisicamente(luchador2);

        System.out.println("=".repeat(80));

        List<Avatar> azules = new ArrayList<>();
        azules.add(new Luchador("Miss Fortune"));
        azules.add(new Luchador("Garen"));
        azules.add(new Luchador("Sett"));

        List<Luchador> rojos = new ArrayList<>();
        rojos.add(new Luchador("Tristana"));
        rojos.add(new Luchador("Maestro Yi"));
        rojos.add(new Luchador("Urgot"));

        Guerra.iniciarCombate(azules, rojos);
        Guerra.agregarMiembrosAlEquipo(rojos);
        Guerra.agregarMiembrosAlEquipo(azules);
    }
}
