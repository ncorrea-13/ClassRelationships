package objetos;

public enum Palo {
    ESPADA("Espada"), BASTO("Basto"), COPA("Copa"), ORO("Oro");

    private String nombre;

    private Palo() {
    }

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
