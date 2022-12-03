package Conceptos;

public class Animal {
    
        //Atributos 
        public String nombre;
        public int edad;

        //Metodos

        //Metodo sin valor de retorno
        public void registrarAnimal(){
            System.out.println("Este es el metodo registrarAnimal()");
        }

        //Metodo sin valor de retorno con parametros
        public void cambiarNombre(String newname){
            nombre=newname;
            System.out.println("El nuevo nombre es "+nombre);
        }

        //Metodo con valor de retorno con parametros
        public int calcularedad(int anioNacimiento){
            edad=2022-anioNacimiento;
            return edad;
        }
    }
    

