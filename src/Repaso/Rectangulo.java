package Repaso;

public class Rectangulo extends Figura_Reto5{

    private float lado1, lado2;

    public Rectangulo() {
    }

    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public void calcularArea() {
        float area= lado1*lado2;
        System.out.println("El area del rectangulo, se calcula, lado "+lado1+  " por base " +lado2+ " y su resultado es " +area);
        
    }  
}
