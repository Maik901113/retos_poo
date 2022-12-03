package Repaso;

public class Prueba_Juego {
    public static void main(String[] args) {
        
        Caraysello juego1=new Caraysello();

        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        Reto6_PiedraPapelyTijera juego2=new Reto6_PiedraPapelyTijera();

        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();

    }
}
