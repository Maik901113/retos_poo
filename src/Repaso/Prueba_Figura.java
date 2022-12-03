package Repaso;

import java.util.Scanner;

public class Prueba_Figura {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int op;
        float num1, num2;

        System.out.println("Menu opciones \n 1.Cuadrado \n 2.Rectangulo \n 3.Triangulo \n 4.Circulo \n  Ingrese el número de la opción que desea realizar");
        op=leer.nextInt();


            switch(op){
            case 1: 
            System.out.println("Ingrese el lado");
            num1=leer.nextInt();

            Cuadrado c1=new Cuadrado();
            c1.setLado(num1);
            c1.calcularArea();

            break;

            case 2: 
            System.out.println("Ingrese el lado 1");
            num1=leer.nextInt();
            System.out.println("Ingrese el lado 2");
            num2=leer.nextInt();
    
            Rectangulo r1=new Rectangulo();
            r1.setLado1(num1);
            r1.setLado2(num2);
            r1.calcularArea();

            break;

            case 3: 
            System.out.println("Ingrese el lado 1 (base)");
            num1=leer.nextInt();
            System.out.println("Ingrese el lado 2(altura)");
            num2=leer.nextInt();
        
            Triangulo t1=new Triangulo();
            t1.setBase(num1);
            t1.setAltura(num2);
            t1.calcularArea();
            
            break;

            case 4: 
            System.out.println("Ingrese el radio");
            num1=leer.nextInt();
            
            Circulo l1=new Circulo();
            l1.setRadio(num1);
            l1.calcularArea();    

        }
        
    }
    
}
