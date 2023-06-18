
// Alunas: Adryellen Alves de Souza e Mariana Oliveira Azevedo
/*
  * ***************************************************************
  * Metodo: CalculoSenoFormula
  * Funcao: ele realiza o calculo da formula inserida usando o x como o valor recebido no parametro
  * Retorno: double, resultado da formula de aproximacao
  */
public class CalculoSenoFormula {
    public static double CalcularSenoFormula(double x) {
        double valor = (x - ((double) 1 / 6 * Math.pow(x, 3)) + (double) 1 / 120 * Math.pow(x, 5));
        return valor;
    }
}
