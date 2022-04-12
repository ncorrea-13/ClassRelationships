package Objetos;

import Enum.NewEnum;
import java.util.Scanner;

public class Persona {

    private final Scanner leer = new Scanner(System.in);
    ;
    private String nombre;
    private Perro perro;

    public Persona() {

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Perro getPerro() {
        return perro;
    }

    public Persona crearPersona() {
        System.out.print("Nombre = ");
        nombre = leer.next();

        Persona persona = new Persona(nombre);
        return persona;
    }

    public Perro crearPerro(int i) {
        switch (i){
            case 0:
                perro = new Perro(NewEnum.CHOLO);
                break;
            case 1:
                perro = new Perro(NewEnum.MARIA);
                break;
            case 2:
                perro = new Perro(NewEnum.PANCHA);
                break;
            case 3:
                perro = new Perro(NewEnum.TOBY);
                break;
            case 4:
                perro = new Perro(NewEnum.TUKI);
                break;
        }
        return perro;
    }
    
    public void elegirPerro(){
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + perro.toString() + '}';
    }
}
