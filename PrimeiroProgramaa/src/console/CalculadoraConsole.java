package console;

import vo.Calculadora;

/**
 *
 * @author info2025
 */
public class CalculadoraConsole {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        calculadora.setNumero1(5);
        calculadora.setNumero2(2);
        calculadora.soma();
                
        System.out.println("A soma é: " + calculadora.getResultado());
    }
}