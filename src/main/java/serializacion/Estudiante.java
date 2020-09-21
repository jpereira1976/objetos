package serializacion;


import com.thoughtworks.xstream.XStream;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Estudiante implements Serializable {
    private final static long serialVersionUID = -6853215668953725960L;

    private final static String SERIALIZATION_FILE = "./estudiante.ser";
    private String nombre;
    private String apellido;
    private String cedula;

    public void printStudentInformation() {
        System.out.println(String.format("Hola yo soy %s %s %s", nombre, apellido, cedula));
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Estudiante estudiante = Estudiante.builder()
                .nombre("Juan")
                .apellido("Perez")
                .cedula("1234")
                .build();
        estudiante.getApellido();
        estudiante.getCedula();
        FileOutputStream fo = new FileOutputStream(SERIALIZATION_FILE);
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(estudiante);
        oo.close();
        fo.close();

        FileInputStream fi = new FileInputStream(SERIALIZATION_FILE);
        ObjectInputStream oi = new ObjectInputStream(fi);
        Estudiante estudianteRecuperado = (Estudiante) oi.readObject();

        estudianteRecuperado.printStudentInformation();

        XStream xstream = new XStream();
        xstream.alias("estudiante", Estudiante.class);
        String xmlEstudiante = xstream.toXML(estudiante);
        System.out.println(xmlEstudiante);
        Estudiante estudiante2 = (Estudiante) xstream.fromXML(xmlEstudiante);
        estudiante2.printStudentInformation();
        //System.out.println(estudiante != estudianteRecuperado);
    }

}
