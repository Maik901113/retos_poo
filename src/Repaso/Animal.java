package Repaso;

public class Animal {
    //Atributos
    private String nombre;
    private int edad;

    //Metodos
    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void registrarAnimal(){
        System.out.println("Este metodo registra");
    }

    public void mostrarAnimal(){
        System.out.println("El animal "+nombre+" tiene "+edad);
    }
}
