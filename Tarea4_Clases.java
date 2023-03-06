import java.awt.*;

// PERRO
public class Tarea4_Clases {

    private String raza;
    private String tamaño;
    private Color color;
    private byte edad;
    private String nombre;

    public Tarea4_Clases(String chihuahua, String pequeño, Color yellow, int i, String panquecito) {
      this.raza = raza;
      this.tamaño = tamaño;
      this.color = color;
      this.edad = edad;
      this.nombre = nombre;
    }
    public Tarea4_Clases (String raza, String tamaño, String nombre){
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
    }



    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
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
        if (edad > 0 && edad <= 14) {
            this.edad = edad;
        }
    }

    public String toString(){
        return "PERRO{"+
                "raza='"+ raza+'\'' +
                "tamaño='"+ tamaño+'\'' +
                "color='"+ color+'\'' +
                "edad='"+ edad+'\'' +
                "nombre='"+ nombre+'\'' +
                '}';

    }
    public boolean ladrar(){
        System.out.println(nombre+"esta ladrando");
        return true;
    }
    public boolean comer(){
        System.out.println(nombre+"esta comiendo");
        return true;
    }
    public boolean dormir(){
        System.out.println(nombre+"esta durmiendo");
        return true;
    }

    public static void main(String[] args) {
        Tarea4_Clases perro = new Tarea4_Clases("chihuahua","pequeño",Color.yellow,12,"panquecito");
        System.out.println(perro.toString());


    }


}

