package Objetos;

import Enum.NewEnum;

public class Perro {

    private NewEnum nombre;
    private int numero;

    public Perro() {
    }

    public Perro(NewEnum nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public NewEnum getNombre() {
        return nombre;
    }

    public void setNombre(NewEnum nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + nombre + '}';
    }

}
