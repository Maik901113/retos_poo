package Sena;

import java.util.Scanner;

public class Aprendiz {

    Scanner leer = new Scanner (System.in);

    // Atributos
    private String Estudiantes;
    String Instructores; 
    public String Equipos="portatil";
    public String Cuadernos;
    public String Tablero;

    //Metodos/Operaciones

        public void registrarcuadernos(){
       
        System.out.println("El cuaderno que registro anteriormente es "+this.Cuadernos+" Ingrese el cuaderno que actualmente va a utilizar ");
        this.Cuadernos=this.leer.nextLine();
        
        System.out.println("El cuaderno que ingreso es "+this.Cuadernos);
        //Limpiar buffer

        this.leer.nextLine();

        System.out.println("El equipo que registro anteriormente es "+this.Equipos+" Ingrese el equipo que actualmemnte va a registrar" );
        this.Equipos=this.leer.nextLine();
        System.out.println("El equipo que ingreso es "+this.Equipos);

        this.leer.close();
    }



    
}
