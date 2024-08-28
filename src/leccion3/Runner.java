package leccion3;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra(
                110,
                3000,
                "Fender",
                "Madera",
                1000
        );
        guitarra.setMaterial("Oro");
        guitarra.reproducirSonido();
        System.out.println(guitarra.toString());

        System.out.println("==".repeat(40));

        // Relación de composición.
        Libro libro = new Libro(
            new Portada("Harry Potter", "J K Rowling", "Cometa 7 Books"),
            List.of(
                new Pagina(1, "AAAAAAA"),
                new Pagina(2, "BBBBBB"),
                new Pagina(3, "CCCCCC")
            )
        );
        System.out.println(libro);
        System.out.println(libro.getPortada().getTitulo());
        System.out.println(libro.getPortada().getEscritor());
        System.out.println(libro.getPortada().getEditorial());

        // Relación de agregación.
        Botella botella = new Botella();
        System.out.println(botella.getLiquido());
    }
}
