package Repaso;

public class Circulo extends Figura_Reto5{

    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double pi= 3.1416;
        double radio2= Math.pow(radio, 2);
        double area= pi*radio2;
        System.out.println("El area del circulo, se calcula pi "+pi+  " por radio " +radio+ " elevado a la 2 y su resultado es " +area);
        
    }

    
    

    
    
}
