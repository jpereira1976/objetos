import lombok.Builder;
import lombok.Setter;

@Builder
public class Circulo extends Figura {
    @Setter private int radio;

    public void dibujate() {
        System.out.println(String.format("Yo soy un circulo de radio %s en pos %s, %s", radio, posX, posY));
    }

}
