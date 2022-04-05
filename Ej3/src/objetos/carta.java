package objetos;

public class carta {

    private Integer número;
    private String palo;

    public carta() {
    }

    public Integer getNúmero() {
        return número;
    }

    public String getPalo() {
        return palo;
    }

    public void setNúmero(Integer número) {
        this.número = número;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "carta{" + "número=" + número + ", palo=" + palo + '}';
    }

}
