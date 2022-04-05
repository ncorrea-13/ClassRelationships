package objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mazo {

    private ArrayList<carta> mazo, jugadores;
    private Integer numero;
    private Scanner leer;

    public mazo() {
        mazo = new ArrayList();
        jugadores = new ArrayList();
        leer = new Scanner(System.in);
    }

    public void crearBaraja() {
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 11; i++) {
                carta cartaNueva = new carta();
                switch (i) {
                    case 8:
                        cartaNueva.setNúmero(10);
                        break;
                    case 9:
                        cartaNueva.setNúmero(11);
                        break;
                    case 10:
                        cartaNueva.setNúmero(12);
                        break;
                    default:
                        cartaNueva.setNúmero(i);
                        break;
                }
                System.out.println(i);
                switch (j) {
                    case 0:
                        cartaNueva.setPalo("oro");
                        break;
                    case 1:
                        cartaNueva.setPalo("copa");
                        break;
                    case 2:
                        cartaNueva.setPalo("basto");
                        break;
                    case 3:
                        cartaNueva.setPalo("espada");
                        break;
                }
                mazo.add(cartaNueva);
            }
        }
    }

    public void barajar() {
        Collections.shuffle(mazo);
    }

    public void siguienteCarta() {
        carta nuevas = mazo.get(0);
        mazo.remove(0);
        jugadores.add(nuevas);
    }

    public void cartasDisponibles() {
        if (mazo.isEmpty()) {
            System.out.println("No quedan cartas disponibles");
        } else {
            System.out.println("Quedan " + mazo.size() + " cartas disponibles");
        }
    }

    public void darCartas() {
        carta nuevas;

        System.out.println("Cuántas cartas desea entregar?");
        int cantidad = leer.nextInt();

        if (mazo.isEmpty()) {
            System.out.println("no hay más cartas en el mazo");

        } else if (cantidad > mazo.size()) {
            System.out.println("Usted está pidiendo más cartas de las que hay");

        } else {
            for (int i = 0; i < cantidad; i++) {
                nuevas = mazo.get(i);
                mazo.remove(i);
                jugadores.add(nuevas);
            }
        }
    }

    public void cartasMonton() {
        carta nueva;
        if (jugadores.isEmpty()) {
            System.out.println("están todas las cartas en el mazo");
        } else {
            for (int i = 0; i < jugadores.size(); i++) {
                nueva = jugadores.get(i);
                jugadores.remove(i);
                mazo.add(nueva);
            }
        }
    }

    public void mostrarBaraja() {
        mazo.forEach((mazo1) -> {
            System.out.println(mazo1.toString());
        });
        
    }

}
