//Juan Francisco Moráan
//25 de mayo 2025

public class ApA1 {
    public static void main(String[] args) {
        //Creo una clase principal para el cálculo
        CalculoFactorial calculadora = new CalculoFactorial();
        //Creo el bucle "for" desde el 1 al 13
        for (int i = 1; i =<13; i++) {
            long factorial = calculadora.CalculoFactorial(i);
            //Imprimo el resultado
            System.out.println("El resultado del factorial de "+ i + "es igual a " + factorial);
        }
    }
}
