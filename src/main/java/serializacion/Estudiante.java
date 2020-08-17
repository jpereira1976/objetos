package serializacion;


import java.io.*;

public class Estudiante implements Serializable {
    private final static long serialVersionUID = -6853215668953725960L;

    private final static String SERIALIZATION_FILE = "./estudiante.ser";
    private String nombre;
    private String apellido;
    private String cedula;


    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void printStudentInformation() {
        System.out.println(String.format("Hola yo soy %s %s", nombre, apellido));
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Estudiante estudiante = new Estudiante("Juan", "Perez");
        FileOutputStream fo = new FileOutputStream(SERIALIZATION_FILE);
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(estudiante);
        oo.close();
        fo.close();*/

        FileInputStream fi = new FileInputStream(SERIALIZATION_FILE);
        ObjectInputStream oi = new ObjectInputStream(fi);
        Estudiante estudianteRecuperado = (Estudiante) oi.readObject();

        estudianteRecuperado.printStudentInformation();

        //System.out.println(estudiante != estudianteRecuperado);
    }

}
