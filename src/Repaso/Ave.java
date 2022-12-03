package Repaso;

public class Ave extends Animal{
    
    //Atributos

    private int envergadura;
    
    //Metodos

    public Ave() {
    }

    public Ave(int envergadura) {
        this.envergadura = envergadura;
    }

    public Ave(String nombre, int edad, int envergadura) {
        super(nombre, edad);
        this.envergadura = envergadura;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }
    
    public void mostrarAve(){
        System.out.println("El animal "+getNombre()+ "tiene " +getEdad()+ "tiene una envergadura de " +this.envergadura);
    }
    



   
    
    

    
}
