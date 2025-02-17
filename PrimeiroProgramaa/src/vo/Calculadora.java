package vo;

/**
 *
 * @author info2025
 */
public class Calculadora {
    private float numero1;
    private float numero2;
    private float resultado;
    
    public void soma() {
        resultado = numero1 + numero2;
    }
    
    public void subtracao() {
        resultado = numero1 - numero2;
    }
    
    public void multiplicacao() {
        resultado = numero1 * numero2;
    }
    
    public void divisao() {
        resultado = numero1 / numero2;
    }

    /**
     * @return the numero1
     */
    public float getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public float getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    /**
     * @return the resultado
     */
    public float getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
}