package exercicio1;

public class App {
    public static void main(String[] args) {
        
        Calculadora calculadora1 = new Calculadora(10, 2);
        System.out.println("Resultado da divisao: " + calculadora1.divisao());
        System.out.println("Resultado da soma: " + calculadora1.soma());
        System.out.println("Resultado da multiplicacao: " + calculadora1.multiplicacao());
        System.out.println("Resultado da subtracao: " + calculadora1.subtracao());
        System.out.println("Resultado da potenciacao do numero1: " + calculadora1.potenciacao());
        System.out.println("Resultado da fatorial do numero1: " + calculadora1.fatorial());
    }
    
}
