package desafiocontaterminal;

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Digite a agência: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();
        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        String menssagem = "Olá, " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(menssagem);
    }
}