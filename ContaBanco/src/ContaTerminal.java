import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int contaNumero;
        String agencia, nomeCliente;
        double saldo;
        Random gerador = new Random();

        System.out.println("Digite o Nome do Cliente");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite a agencia");
        agencia = scanner.nextLine();
        contaNumero = gerador.nextInt(1,9999);
        System.out.println("Digite o valor depositado na criação da conta");
        saldo = scanner.nextDouble();

        System.out.println("\n Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+",\n conta "+contaNumero+" e seu saldo R$ "+saldo+" já está disponível para saque");


    }
}
