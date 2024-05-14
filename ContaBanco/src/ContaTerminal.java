import java.util.Scanner;

/**
 * Programa que simula a criação de uma conta bancária,
 * solicitando dados do usuário via terminal.
 */
public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        // Lê o número da agência como um inteiro
        int agencia = scanner.nextInt();

        // Solicita o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        // Lê o número da conta como um inteiro
        int numero = scanner.nextInt();

        // Consome a quebra de linha pendente após a leitura do número da conta
        scanner.nextLine();

        // Solicita o nome do cliente
        System.out.print("Por favor, digite o Nome do Cliente: ");
        // Lê o nome do cliente como uma string
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo inicial
        System.out.print("Por favor, digite o Saldo inicial: ");
        // Lê o saldo inicial como um double
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}