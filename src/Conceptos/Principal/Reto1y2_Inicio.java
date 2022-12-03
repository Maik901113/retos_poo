package Conceptos.Principal;

import Salud.Reto1y2_Persona;

public class Reto1y2_Inicio {

    public static void main(String[] args) {

        Reto1y2_Persona Registro = new Reto1y2_Persona();

        Registro.pedirDatos();
        Registro.mostrarPersona();
        String resp=Registro.calcularImc();
        if(resp.equals("pesobajo")){
            System.out.println("El paciente esta por debajo del peso ideal");
        }    

        if(resp.equals("pesoideal")){
            System.out.println("El paciente tiene un peso ideal"); 
        }       

        if(resp.equals("sobrepeso")){
            System.out.println("El paciente tiene sobrepeso");   
        }  

        Registro.mayorEdad();
        }
    }
        

    


