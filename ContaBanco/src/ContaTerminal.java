import java.util.Scanner;

class ContaTerminal {
  public static void main(String[] args) {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    Scanner myObj = new Scanner(System.in);

    System.out.println("Digite o número da conta:");
    numero = myObj.nextInt();
    myObj.nextLine();

    System.out.println("Digite a agência:");
    agencia = myObj.nextLine();

    System.out.println("Digite o nome do cliente:");
    nomeCliente = myObj.nextLine();

    System.out.println("Digite o saldo:");
    saldo = myObj.nextDouble();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
    System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
  }
}