import java.util.Scanner;
import java.io.*;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        Console teclado = System.console();

        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroConta = entrada.nextInt();
        System.out.println("Agora digite o número da sua Agência: ");
        String agencia = teclado.readLine();
        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = teclado.readLine();
         double saldo = 237.48;


        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua Agência é: " + agencia + " e Conta: " + numeroConta + "."); 
        System.out.println("Seu saldo de: R$" + saldo + ", já está disponível para saque!");
        
        entrada.close(); //Encerrar o programa
        
    }

}
