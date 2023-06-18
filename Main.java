import java.text.DecimalFormat;
import java.util.Scanner;

// Alunas: Adryellen Alves de Souza e Mariana Oliveira Azevedo
public class Main {
        public static void main(String[] args) {
                int n = 10; // n ira representar a quantidade de vezes que ira ocorrer o somatorio
                DecimalFormat df = new DecimalFormat("#.##########"); // Para formatar para 10 casas decimais
                System.out.println(menu()); // chama a funcao menu
                Scanner ler = new Scanner(System.in);
                int op = ler.nextInt();
                switch (op) {
                        case 1: // Esse case se refere a questao 1 da lista
                                System.out.println("Digite o valor de x");
                                double x = ler.nextDouble();
                                System.out.println(
                                                "Antes de realizar a operacao, voce deseja passar o valor em angulo ou radianos? Digite 1-angulo ou 2-radianos");
                                // para que o usuario informe em relacao ao tipo do valor que ele esta digitando
                                int escolha = ler.nextInt();
                                if (escolha == 1) {
                                        System.out.println("----------Calculando f(x) = sen(x)----------\n");

                                        double xRadianos = Math.toRadians(x); // converte o valor dado para radianos
                                        System.out.println(
                                                        "       f(" + x + ") " + "==  "
                                                                        + df.format(CalculoSerieTaylor
                                                                                        .CalculaSenoRecursivo(xRadianos,
                                                                                                        n)));
                                        // chama a funcao para calcular sen(x) pela serie de taylor usando o valor
                                        // convertido para radianos
                                        System.out.println("\n-----------Calculando g(x) = e^x----------\n");
                                        System.out.println("      g(" + x + " ) " + "=="
                                                        + df.format(CalculoSerieTaylor.CalcularFuncao_e_Recursiva(x,
                                                                        n)));
                                        // chama a funcao para calcular e^x pela serie de taylor

                                } else {
                                        System.out.println("----------Calculando f(x) = sen(x)----------\n");
                                        System.out.println(
                                                        "          f(" + x + " ) " + "== "
                                                                        + df.format(CalculoSerieTaylor
                                                                                        .CalculaSenoRecursivo(x, n))); // chama
                                                                                                                       // a
                                        // funcao para calcular sen(x) pela formula de aproximacao usando o valor
                                        // convertido para radianos
                                        System.out.println("\n-----------Calculando g(x) = e^x----------\n");
                                        System.out.println("      g(" + x + " ) " + "==  "
                                                        + df.format(CalculoSerieTaylor.CalcularFuncao_e_Recursiva(x,
                                                                        n)));
                                        // funca par calcula e^ pela formula de aproximacao

                                }

                                break;
                        case 2:
                                // 0, 30, 45
                                System.out.println("Digite os 3 valores para qual deseja fazer a comparacao \n");
                                double valor = ler.nextDouble();
                                double valor2 = ler.nextDouble();
                                double valor3 = ler.nextDouble();
                                double valorRadianos = Math.toRadians(valor); // converte os valores pra radiano
                                double valor2Radianos = Math.toRadians(valor2);
                                double valor3Radianos = Math.toRadians(valor3);
                                // Aqui para cada valor sera chamada a funcao para calcular por meio da serie de
                                // taylor recursiva passando o valor como parametros e tambem sera chamado o
                                // metodo que calcula por meio da formula de aproximacao
                                System.out.println("----------Comparando esses valores---------\n");
                                System.out.println("           Fazendo Sen(" + valorRadianos + "):\n");
                                System.out.println("--------Usando a serie de taylor: -----------\n\n"
                                                + "             "
                                                + df.format(CalculoSerieTaylor.CalculaSenoRecursivo(valor, 10)) + "");
                                System.out.println(
                                                "\n----------Calculando usando a formula de aproximação: ------------- \n\n"
                                                                + "             "
                                                                + CalculoSenoFormula.CalcularSenoFormula(valorRadianos)
                                                                + "");

                                System.out.println("\n       Fazendo Sen(" + valor2 + "):\n");

                                System.out.println("--------Usando a serie de taylor: -------------\n\n"
                                                + "           "
                                                + df.format(CalculoSerieTaylor.CalculaSenoRecursivo(valor2Radianos, 10))
                                                + "");
                                System.out.println(
                                                "\n----------Calculando usando a formula de aproximação: --------- \n\n"
                                                                + "       "
                                                                + CalculoSenoFormula.CalcularSenoFormula(valor2Radianos)
                                                                + "");

                                System.out.println("\n          Fazendo Sen(" + valor3 + "):\n");

                                System.out.println("--------Usando a serie de taylor: -----------\n\n"
                                                + "       "
                                                + df.format(CalculoSerieTaylor.CalculaSenoRecursivo(valor3Radianos, 10))
                                                + "");
                                System.out.println(
                                                "\n----------Calculando usando a formula de aproximacao:  -------------\n\n"
                                                                + "       "
                                                                + CalculoSenoFormula.CalcularSenoFormula(valor3Radianos)
                                                                + "");

                                break;

                        case 3:
                                System.out.println("Digite o valor que deseja para t:");
                                double t = ler.nextDouble();
                                LissajousCurve.EquacaoPorLissajous(t); // chama o metodo que faz esse calculo

                                break;
                }
        }

        /*
         * ***************************************************************
         * Metodo: menu
         * Funcao: metodo para exibir um mini menu pro usuario para ficar mais legivel
         * Retorno: String com as opcoes pro usuario
         */
        public static String menu() {
                System.out.println("Qual operacao deseja realizar?- Digite o numero correspondente a ela ");
                return "1- Calcular as funcoes f(x) = sen(x) e g(x) = e^x\n"
                                + "2- Fazer testes para comparar o resultado de sen(x) usando serie de Taylor com o resultado de sen(x) usando a formula de aproximacao\n"
                                + "3-Achar a equacao da reta tangente para qualquer ponto sobre a curva Lissajous x= sen(2t), y= cos(t)";

        }

}