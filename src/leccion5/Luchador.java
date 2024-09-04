package leccion5;

public class Luchador extends Avatar {

    public Luchador(String nombre) {
        super(nombre);
    }

    @Override
    public int atacarFisicamente(Avatar avatar) {
        while(avatar.getVida() > 0 && this.getVida() > 0) {
            avatar.setVida(avatar.getVida() - this.getFuerza());
            if (avatar.getVida() <= 0) {
                System.out.println(avatar.getNombre() + " ha muerto!");
                return 1;
            } else {
                this.setVida(this.getVida() - avatar.getFuerza());
                if (this.getVida() <= 0) {
                    System.out.println(this.getNombre() + " ha muerto!");
                    return -1;
                }
            }
        }
        return 0;
    }
}
