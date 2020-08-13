public class Cuadrado extends Figura {
    private int lado;

    public void dibujate() {
        System.out.println(String.format("Yo soy un cuadrado de lado %s", lado));
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
