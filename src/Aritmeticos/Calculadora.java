package Aritmeticos;

import java.util.Scanner;

public class Calculadora {
    Scanner leer = new Scanner(System.in);
    //Atributos
    int num1;
    int num2;
    int suma;
    int resta;
    double numeroaelevar;
    int exponente1;
    int exponente2;
    String total;


    public void sumadedosNumeros(){

        System.out.println("Ingrese el numero 1");
        this.num1= this.leer.nextInt();

        System.out.println("Ingrese el numero 2");
        this.num2= this.leer.nextInt();

        this.suma=this.num1+this.num2;
        System.out.println("La suma de los dos numeros es "+this.suma);

        }

        public int restadedosNumeros(int num1, int num2){
        this.resta=num1-num2;
        System.out.println("La resta de los dos numeros es "+this.resta);
        return this.resta;
        }   
        
        public int numeroMayor(int num1, int num2){

            if (num1>num2){
            System.out.println("El numero mayor es el Numero1 " +num1);
            return num1;
        }  
            else{
            System.out.println("El numero mayor es el Numero2 " +num2);
            return num2; 
        }   
    } 

        public int numeroMenor(int num1, int num2){

            if (num1<num2){
            System.out.println("El numero menor es el Numero1 " +num1);
            return num1;
        }  
            else{
            System.out.println("El numero menor es el Numero2 " +num2);
            return num2; 
        }      
    }

        public String numeroExponente(){

            System.out.println("Digite el primer numero");
            this.num1=this.leer.nextInt();

            System.out.println("Digite el segundo numero");
            this.num2=this.leer.nextInt();

            System.out.println("Digite el exponente al que desea elevar los numeros");
            double numeroaelevar=this.leer.nextDouble();

            double exponente1=(int)Math.pow(this.num1, numeroaelevar);
            double exponente2=(int)Math.pow(this.num2, numeroaelevar);

            System.out.println("El numero a elevar es "+this.num1+ " y su resultado es " +exponente1+ "\nEl numero a elevar es " +this.num2+ " y su resultado es " +exponente2);
            this.total=this.leer.next();
            return this.total;   
        }          
    }      


    //Metodos

    //1.Metodo sin valor de retorno que sume los dos numeros

    //2.Metodo con valor de retorno que reste los dos numeros

    //3.Metodo con valor de retorno que devuelva cual es el numero mayor

    //4.Metodo sin valor de retorno que devuelva cual es el numero menor

    //5.Metodo con valor de retorno que eleve cada numero al exponente que sea indicado por el usuario




