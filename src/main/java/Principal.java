import java.util.Scanner;

/**
 * Classe principal responsável por realizar a leitura das dimensões, 
 * preenchimento e multiplicação de duas matrizes ($A_{m \times p}$ e $B_{p \times n}$).
 * <p>
 * O programa calcula a matriz resultante $C_{m \times n}$ aplicando a definição 
 * clássica de produto de matrizes via algoritmo de três laços aninhados.
 * </p>
 * 
 * @author darthruver007
 * @version 1.0.0
 * @since 1.0.0
 */
public class Principal {

    /**
     * Ponto de entrada do programa. Executa a entrada de dados via terminal,
     * realiza a operação matemática de multiplicação e exibe a matriz resultante.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Leitura das dimensões das matrizes
        System.out.print("Digite o número de linhas da Matriz A (m): ");
        int m = leitor.nextInt();

        System.out.print("Digite o número de colunas de A / linhas de B (p): ");
        int p = leitor.nextInt();

        System.out.print("Digite o número de colunas da Matriz B (n): ");
        int n = leitor.nextInt();

        // Instanciação das matrizes com as dimensões especificadas
        double[][] A = new double[m][p];
        double[][] B = new double[p][n];
        double[][] C = new double[m][n];

        // Leitura dos elementos da Matriz A
        System.out.println("\n--- Leitura da Matriz A ---");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = leitor.nextDouble();
            }
        }

        // Leitura dos elementos da Matriz B
        System.out.println("\n--- Leitura da Matriz B ---");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = leitor.nextDouble();
            }
        }

        // Algoritmo de Multiplicação de Matrizes: C[i][j] = sum(A[i][k] * B[k][j])
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0; // Inicializa a posição acumuladora
                for (int k = 0; k < p; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibição da Matriz C Resultante
        System.out.println("\n--- Matriz Resultante C ---");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        leitor.close();
    }
}