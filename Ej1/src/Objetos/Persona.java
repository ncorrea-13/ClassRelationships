package Objetos;

import java.util.Scanner;

public class Persona {

    private final Scanner leer;

    private String nombre, apellido;

    private int documento, edad;

    private Perro perro;

    public Persona() {
        leer = new Scanner(System.in);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void crearPersonaYPerro() {
        System.out.print("Nombre = ");
        nombre = leer.next();

        System.out.print("Apellido = ");
        apellido = leer.next();

        System.out.print("DNI = ");
        documento = leer.nextInt();

        System.out.print("Edad = ");
        edad = leer.nextInt();

        System.out.println("Dicte los datos para el perro de esa persona");
        crearPerro();
    }

    public void crearPerro() {
        perro = new Perro();

        System.out.print("Nombre = ");
        perro.setNombre(leer.next());

        System.out.print("Edad = ");
        perro.setEdad(leer.nextInt());

        System.out.print("Raza = ");
        perro.setRaza(leer.next());

        System.out.print("Tamaño = ");
        perro.setTamano(leer.nextFloat());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad + ", " + perro.toString() + '}';
    }

    public Persona crearPersona() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
