package leccion9;

import utilitarios.Animal;

import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;

    private Animal mascota;

    public Persona() {

    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Animal getMascota() {
        return mascota;
    }

    public void setMascota(Animal mascota) {
        this.mascota = mascota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
            "nombre='" + nombre + '\'' +
            ", edad=" + edad +
            '}';
    }

    @Override
    public Object clone() {
        Persona nuevaPersona = new Persona(this.nombre, this.edad);
        try {
            Animal mascotaClonada = mascota.getClass().newInstance();
            nuevaPersona.setMascota(mascotaClonada);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return nuevaPersona;
    }

    public void finalizar() throws Throwable {
        this.finalize();
    }
}