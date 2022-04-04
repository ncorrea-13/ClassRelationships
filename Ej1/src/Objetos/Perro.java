package Objetos;

public class Perro {

    private String raza, nombre;

    private int edad;

    private float tamano;

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public float isTamano() {
        return tamano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", tama�o=" + tamano + '}';
    }
}
