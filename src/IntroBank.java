import java.util.Scanner;

public class IntroBank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o numero da sua conta: ");
		int numero = scan.nextInt();
		scan.nextLine();
		System.out.println("Agora digite a sua agencia: ");
		String agencia = scan.nextLine();
		System.out.println("Digite o nome do cliente: ");
		String nome = scan.nextLine();
		System.out.println("Qual o saldo dessa conta? ");
		double saldo = scan.nextDouble();
		System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
	}
}
