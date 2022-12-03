package Ficha;

import java.util.Scanner;

import Sena.Aprendiz;

public class Adso {
    public static void main(String[] args) {    

        Scanner leer=new Scanner(System.in);

        Aprendiz gabriel=new Aprendiz();
        gabriel.Cuadernos="Sietematerias";

        System.out.println("El cuaderno necesario para esta clase es "+gabriel.Cuadernos);

        System.out.println("Ingrese el cuaderno que es necesario para la clase");
        gabriel.Cuadernos=leer.next();

        leer.nextLine();

        System.out.println("Ingrese el equipo que utiliza");
        gabriel.Equipos=leer.nextLine();

        System.out.println("Gabriel necesita un cuaderno "+gabriel.Cuadernos+ " y el equipo que utiliza es " +gabriel.Equipos);

        leer.nextLine();
        
        System.out.println("Ingrese una herramienta del salon de clases");
        gabriel.Tablero=leer.nextLine();

        


    }
    
    
}
