import java.text.DecimalFormat;

// Alunas: Adryellen Alves de Souza e Mariana Oliveira Azevedo
public class CalculoSerieTaylor {

    /*
     * ***************************************************************
     * Metodo: calcularFatorial
     * Funcao: metodo para poder calcular o fatorial do valor passado comp parametro
     * Retorno: double, o resultado do fatorial
     */
    public static double calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    /*
     * ***************************************************************
     * Metodo: CalculaSenoRecursivo
     * Funcao: calcula por meio da recursao o valor de seno, usando a formula da
     * serie de taylor e tendo n=10, ou seja eh feito o somatorio de n indo de 0 ate
     * 10
     * Retorno: void
     */
    public static double CalculaSenoRecursivo(double x, int n) {

        if (n <= 0) {
            return x;
        } else {

            return (Math.pow(-1, n) * Math.pow(x, ((2 * n) + 1)) / calcularFatorial(((2 * n) + 1)))
                    + CalculaSenoRecursivo(x, n - 1);
        }
    }

    /*
     * ***************************************************************
     * Metodo: CalcularFuncao_e_Recursiva
     * Funcao: calcular o valor de e^x por meio do metodo da recursao e utilizando a
     * formula de taylor, e eh feito o somatorio ate n = 10
     * Retorno: double, que eh o resultado da funcao
     */
    public static double CalcularFuncao_e_Recursiva(double x, int n) {

        {
            if (n >= 0) {
                return Math.pow(x, n) / calcularFatorial(n) + CalcularFuncao_e_Recursiva(x, n - 1);
            } else {
                return 0;
            }
        }

    }

}