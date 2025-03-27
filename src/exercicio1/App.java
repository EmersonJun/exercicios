package exercicio1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora calculadora1 = new Calculadora();
        System.out.println("insira o numero 1: ");
        float numero1 = scanner.nextFloat();
        System.out.println("insira o numero 2: ");
        float numero2 = scanner.nextFloat();

        calculadora1.setNumero1(numero1);
        calculadora1.setNumero2(numero2);
        
        System.out.println("Resultado da divisao: " + calculadora1.divisao());
        System.out.println("Resultado da soma: " + calculadora1.soma());
        System.out.println("Resultado da multiplicacao: " + calculadora1.multiplicacao());
        System.out.println("Resultado da subtracao: " + calculadora1.subtracao());
        System.out.println("Resultado da potenciacao do numero1: " + calculadora1.potenciacao());
        System.out.println("Resultado da fatorial do numero1: " + calculadora1.fatorial());
    }
    
}
