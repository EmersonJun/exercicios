package exercicio1;

public class Calculadora {
    private float numero1, numero2, resultado;

    public Calculadora() {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = 0;
    }

    public float soma(){
        if (numero1 <50 || numero1>0 && numero2 <50 || numero2>0) {
        resultado = numero1 + numero2;
        }
        return resultado;
    }
    public float subtracao(){
        if (numero1 <50 || numero1>0 && numero2 <50 || numero2>0) {
        resultado = numero1 - numero2;
        }
        return resultado;
    }
    public float multiplicacao(){
        if (numero1 <50 || numero1>0 && numero2 <50 || numero2>0) {
        resultado = numero1 * numero2;
        }
        return resultado;
    }
    public float divisao(){
        if (numero1 <50 || numero1>0 && numero2 <50 || numero2>0) {
            if (numero2 == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            resultado = numero1 / numero2;
        }
        return resultado;
    }

    public float potenciacao(){
        if (numero1 <50 || numero1>0 || numero2 <50 || numero2>0) {
            if (numero2 == 0) {
                throw new ArithmeticException("potenciacao por zero não é permitida.");
            }
            resultado = 1;
            for(int i=0; i<numero2; i++){
                resultado*=numero1;
            }
        }
        return resultado;
    }

    public float fatorial(){
        if (numero1 < 0 || numero1 > 50) {
            throw new IllegalArgumentException("O fatorial só é permitido para números entre 0 e 50.");
        }

        int fatorial = 1;
        for (int i = 1; i <= numero1; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Calculadora [numero1=" + numero1 + ", numero2=" + numero2 + "]";
    }
    
    
}
