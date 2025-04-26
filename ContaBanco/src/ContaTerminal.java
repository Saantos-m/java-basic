import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto scanner para receber os dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0.0;
        boolean saldoValido = false;
        
        // Solicitando e recebendo o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número
        
        // Solicitando e recebendo o número da agência
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();
        
        // Solicitando e recebendo o nome do cliente
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scanner.nextLine();
        
        // Loop para garantir a entrada de um saldo válido
        while (!saldoValido) {
            // Solicitando e recebendo o saldo inicial
            System.out.println("Por favor, digite o seu saldo inicial!");
            String saldoStr = scanner.nextLine();
            
            try {
                // Tentativa de converter o valor com ponto como separador decimal
                saldoStr = saldoStr.replace(',', '.');
                saldo = Double.parseDouble(saldoStr);
                saldoValido = true; // Se chegou aqui, a conversão foi bem-sucedida
            } catch (NumberFormatException e) {
                // Caso ocorra erro na conversão, informa ao usuário para tentar novamente
                System.out.println("Formato de saldo inválido. Por favor, digite novamente usando números e ponto ou vírgula como separador decimal.");
            }
        }
        
        // Formatando o saldo para exibição com duas casas decimais
        String saldoFormatado = String.format("%.2f", saldo);
        
        // Exibindo a mensagem final com os dados informados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                          agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.");
        
        // Fechando o scanner
        scanner.close();
    }
}