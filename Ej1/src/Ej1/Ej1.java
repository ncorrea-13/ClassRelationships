package Ej1;

import Objetos.Persona;

public class Ej1 {

    public static void main(String[] args) {
        Persona P1 = new Persona();
        Persona P2 = new Persona();
        for (int i = 0; i < 2; i++) {
            System.out.println("Dicte los datos para la persona nro " + i+1);
            if (i == 0) {
                P1.crearPersonaYPerro();

            } else {
                P2.crearPersonaYPerro();
            }
        }
        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }

}
