import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o usuario");
        String usuario = scanner.next();

        System.out.println("Digite o saldo:");
        Float saldo = scanner.nextFloat();

        System.out.println("Ola " +nome+", obrigado por criar a conta em nosso banco, sua agencia e "+agencia+ ", conta "+usuario+ " e seu saldo R$"+saldo+" ja esta disponivel para saque" );






    }
}
