//Juan Francisco Morán
//25 de mayo 2025

// Clase principal que contiene el método main
public class Principal {

    public static void main(String[] args) {
        // Se crea un objeto de la clase CálculoFactorial
        CalculoFactorial calculadora = new CalculoFactorial();

        // Bucle para calcular y mostrar el factorial de los números del 1 al 13
        for (int i = 1; i <= 13; i++) {
            long factorial = calculadora.factorialjfmg(i);
            System.out.println("El valor del cálculo factorial de " + i + " es igual a : " + factorial);
        }
    }
}
