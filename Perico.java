import java.awt.*;

public class Perico {
    private String tipoDePico;
    private String tamaño;
    private Color color;
    private byte edad;
    private String nombre;

    public Perico (String ganchua, String pequeño, Color green, int i, String marlo) {
        this.tipoDePico = tipoDePico;
        this.tamaño = tamaño;
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }
    public Perico (String tipoDePico, String tamaño, String nombre){
        this.nombre = nombre;
        this.tipoDePico = tipoDePico;
        this.tamaño = tamaño;
    }



    public String gettipoDePico(){
        return tipoDePico;
    }

    public void settipoDePico(String tipoDePico){
        this.tipoDePico= tipoDePico;
    }

    public String getTamaño(){
        return tamaño;
    }

    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }

    public byte getEdad(){
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad > 0 && edad <= 3) {
            this.edad = edad;
        }
    }

    public String toString(){
        return "PERRO{"+
                "raza='"+ tipoDePico+'\'' +
                "tamaño='"+ tamaño+'\'' +
                "color='"+ color+'\'' +
                "edad='"+ edad+'\'' +
                "nombre='"+ nombre+'\'' +
                '}';

    }
    public boolean escalando(){
        System.out.println(nombre+"esta escalando ");
        return true;
    }
    public boolean comer(){
        System.out.println(nombre+"esta comiendo");
        return true;
    }
    public boolean volando(){
        System.out.println(nombre+"esta volando");
        return true;
    }

    public static void main(String[] args) {
        Tarea4_Clases perico = new Tarea4_Clases("gansuela","pequeño",Color.green,12,"marlon");
        System.out.println(perico.toString());


    }
}
