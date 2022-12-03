package Repaso;

import java.util.Random;
import java.util.Scanner;

public class Caraysello implements Juego{

    Scanner leer= new Scanner (System.in);

     //Atributos

    private String nombre;
    private int eleccion;
    private int moneda;

    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre=leer.nextLine();  
    }

    @Override
    public void jugar() {
        System.out.println("Escoge 1 para cara o 2 para sello");
        eleccion=leer.nextInt();
        System.out.println("... Moneda girando ...");
        Random aleatorio= new Random();
        moneda=aleatorio.nextInt(2)+1;     
    }

    @Override
    public void finalizar() {
        if(moneda==1 && eleccion==1){
            System.out.println("Cayo cara, seleccionaste cara ¡Ganaste! " +nombre);
        }

        else if(moneda==1 && eleccion==2){
            System.out.println("Cayo sello, seleccionaste sello ¡Perdiste! " +nombre);
        }

        else if(moneda==2 && eleccion==2){
            System.out.println("Cayo sello, seleccionaste sello ¡Ganaste! " +nombre);
        }

        else if(moneda==2 && eleccion==1){
            System.out.println("Cayo sello, seleccionaste cara ¡Perdiste! " +nombre);
        }
        
    }
    
    
}
