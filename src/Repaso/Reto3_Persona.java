package Repaso;

import java.util.Scanner;

public class Reto3_Persona {

    Scanner leer = new Scanner(System.in);

    public String tipoDocumento;
    public int documento;
    public String nombre;
    public String apellido;
    public float peso;
    public float estatura;
    public int edad;
    public String genero;

    public Reto3_Persona() {

    }

    public Reto3_Persona(String tipoDocumento, int documento, String nombre, String apellido,
        float peso, float estatura, int edad, String genero) {

        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido; 
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.genero = genero;
    }

    public void consultarNombre(String name) {
        System.out.println(nombre);

        if (nombre.equals(name)) {
            System.out.println("El paciente " + nombre + " " + apellido + " identificado con " + tipoDocumento
            + " y numero " + documento + " de genero " + genero + " tiene " + edad + " años de edad, pesa "
            + peso + "kg y su estatura es de " + estatura + "cm");
        }

        else {
            System.out.println("Paciente no existe");
        }
    }
}
