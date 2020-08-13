import java.util.ArrayList;
import java.util.List;

public class Dibujador {
    private List<Figura> figuras;

    public Dibujador(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        Circulo circulo = Circulo.builder()
                .radio(10)
                .build();
        figuras.add(circulo);
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        figuras.add(cuadrado);
        Triangulo triangulo = new Triangulo();
        figuras.add(triangulo);

        new Dibujador(figuras).dibujarFiguras();

    }

    public void dibujarFiguras() {
        figuras.stream().forEach(figura -> figura.dibujate());
    }

}
