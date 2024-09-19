package src;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

    public static void main(String[] args) {
        // Criação do Scanner para leitura dos parâmetros
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();  // Recebendo o primeiro número

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();  // Recebendo o segundo número

        try {
            // Chamando o método para realizar a contagem e imprimir os números
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Caso o primeiro parâmetro seja maior que o segundo, imprime a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o Scanner para evitar vazamentos de recursos
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validação: Se o primeiro parâmetro for maior que o segundo, lançar exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Cálculo da quantidade de iterações
        int contagem = parametroDois - parametroUm;

        // Loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
