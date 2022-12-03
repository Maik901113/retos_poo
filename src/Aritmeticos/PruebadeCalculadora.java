package Aritmeticos;

public class PruebadeCalculadora {
    public static void main(String[] args) {
        Calculadora Registro = new Calculadora();

        Registro.sumadedosNumeros();
        Registro.restadedosNumeros(10, 8);
        Registro.numeroMayor(10, 5);
        Registro.numeroMenor(9, 4);
        Registro.numeroExponente();
    }
}
