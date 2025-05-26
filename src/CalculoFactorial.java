//Juan Francisco Morán
//25 de mayo 2025
//clase para calcular un factorial
public class CalculoFactorial {
    public long factorialjfmg(int numero){
        long resultado = 1;
        for(int i= 1; i <= numero; i++) {
        //Bucle "for" que multiplica todos los números para el factorial
            resultado *= i;
            }
        return resultado;
    }
}
