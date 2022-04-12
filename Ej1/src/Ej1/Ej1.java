package Ej1;

import Objetos.Perro;
import Objetos.Persona;
import java.util.ArrayList;

public class Ej1 {

    public static void main(String[] args) {
        ArrayList<Persona> Gente = new ArrayList(5);
        Persona pipol = new Persona();
        ArrayList<Perro> Caninos = new ArrayList();
        
        for (int i = 0; i<5; i++){
            Caninos.add(pipol.crearPerro(i));
            
        }
        
        System.out.println(Caninos.toString());
        
        for (int i = 1; i<6; i++) {
            System.out.println("Dicte los datos para la persona nro " + i);
            Gente.add(pipol.crearPersona());                   
        }
        
        for (Persona persona : Gente) {
            
        }
    }

}
