package Conceptos;

public class Pruebas {
    public static void main(String[] args) {
    
        Animal panda= new  Animal();

        panda.nombre="Bambu";

        panda.registrarAnimal();

        panda.cambiarNombre("Copito");

        panda.calcularedad(2015);
        //System.out.println("La edad del panda es "+panda.calcularedad(2015));
        System.out.println("La edad del panda es "+panda.edad);
        
    
        
    }
    
    
}
