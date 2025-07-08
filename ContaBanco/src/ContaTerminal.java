import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer a importa a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuario
        System.out.println("Por favor, Informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, qual o seu saldo? ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}