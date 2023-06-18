
// Alunas: Adryellen Alves de Souza e Mariana Oliveira Azevedo
public class LissajousCurve {
    /*
     * ***************************************************************
     * Metodo: EquacaoPorLissajous
     * Funcao: ele calcula o valor de x e y baseado nas funcoes dadas, calcula o
     * valor do coeficiente angular e assim a equacao da reta tangente
     * Retorno: void, ele imprime os valores no console
     */
    public static void EquacaoPorLissajous(double t) {
        // calcula os valoes de x e y baseado nas equaçoes que foram dadas na questao
        double x = Math.sin(2 * t);
        double y = Math.cos(t);

        // Calcula a derivada das coordenadas x e y
        double dx_dt = 2 * Math.cos(2 * t);
        double dy_dt = -Math.sin(t);

        // Calcula o coeficiente angular da reta tangente
        double coeficienteAngular = dy_dt / dx_dt;

        // Calcule o valor do termo independente da reta tangente
        double termoIndependente = y - coeficienteAngular * x;
        // Imprime O ponto x e y
        System.out.println("P(" + x + "," + y + ")");
        // Imprime a equação da reta tangente
        System.out.println("A equação da reta tangente em t = " + t + " é:");
        System.out.println("y = " + coeficienteAngular + " * x + " + termoIndependente);

    }
}
