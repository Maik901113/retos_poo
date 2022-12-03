package Repaso;

import java.util.Scanner;

public class Libro {

    Scanner leer=new Scanner(System.in);

    private int idLibro;
    public String nombreLibro; //Atribjuto expuesto
    private String autorLibro; //Atributo encapsulado
    private String categoriaLibro;
    private String editorialLibro;

    //Metodos

    public Libro(){

    }

    public Libro(int idLibro, String nombreLibro, String autorLibro, String categoriaLibro, String editorialLibro){

        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.categoriaLibro = categoriaLibro;
        this.editorialLibro = editorialLibro;
    }

    public void mostrarLibro(){
        System.out.println("El libro" +nombreLibro+ " fue escrito por "+autorLibro);
    }

    public void mostrarLibro(String nombreLibro, String autorLibro){
        System.out.println("El libro" +nombreLibro+ " fue escrito por "+autorLibro);
    }


    //2. Metodos accesorios

    public int getIdLibro(){
        return idLibro;
    }

    public void setIdLibro(int idLibro){
        this.idLibro=idLibro;
    }

    public String getAutorLibro(){
        return autorLibro;
    }    

    public void setAutorLibro(String autorLibro){
        this.autorLibro=autorLibro;
    }    

    public String getCategoriaLibro(){
        return categoriaLibro;
    }    

    public void setCategoriaLibro(String categoriaLibro){
        this.categoriaLibro=categoriaLibro;
    }   
    
    public String getEditorialLibro(){
        return editorialLibro;
    }    

    public void setEditorialLibro(String editorialLibro){
        this.editorialLibro=editorialLibro;
    }  


    // 3. Metodos propios o personalizados de la clase
    public void registrarLibro(){

        System.out.println("Ingrese el ID del libro");
        idLibro=leer.nextInt();
        leer.nextLine(); //Limpieza de buffer, pasa de número a cadena

        System.out.println("Ingrese el nombre del libro");
        nombreLibro=leer.next();

        System.out.println("Ingrese el autor del libro");
        autorLibro=leer.next();

        System.out.println("Ingrese la categoria del libro");
        categoriaLibro=leer.next();

        System.out.println("Ingrese la editorial del libro");
        editorialLibro=leer.next();

    }

    public void consultarLibros(String nameBook){
        System.out.println(nombreLibro);

        if(nombreLibro.equals(nameBook)){
            System.out.println("El libro " +nombreLibro+" fue escrito por " +autorLibro+" es de la editorial "+editorialLibro);
        }

        else{
            System.out.println("Libro no existe");
        }   
    }
}

