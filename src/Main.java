import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Define o padrão para o formato do número da agência: XXX-X
        Pattern padraoRegexNumeroAgencia = Pattern.compile("\\d{3}-\\d");

        while (true) {
            try {
                System.out.println("Digite o número da conta:");
                contaTerminal.setNumeroConta(Integer.parseInt(scanner.next()));

                System.out.println("Digite o número da agência (O formato deve ser XXX-X):");
                contaTerminal.setNumeroAgencia(scanner.next());
                Matcher matcher = padraoRegexNumeroAgencia.matcher(contaTerminal.getNumeroAgencia());

                if(!matcher.matches()) {
                    System.out.println("Insira um formato válido(Formato XXX-X).");
                    continue;
                }

                System.out.println("Digite seu nome:");
                contaTerminal.setNomeCliente(scanner.next());

                System.out.println("Digite seu sobrenome:");
                contaTerminal.setSobrenomeCliente(scanner.next());

                contaTerminal.setSaldo(237.48);
                String nomeCliente = contaTerminal.primeiraLetraMaiuscula(contaTerminal.getNomeCliente());
                String sobrenomeCliente = contaTerminal.primeiraLetraMaiuscula(contaTerminal.getSobrenomeCliente());
                int numeroConta = contaTerminal.getNumeroConta();
                String numeroAgencia = contaTerminal.getNumeroAgencia();
                double saldo = contaTerminal.getSaldo();


                String mensagem = "Olá " + nomeCliente.concat(" " + sobrenomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                        numeroAgencia + ", conta " + numeroConta + " seu saldo " + saldo + " já está disponível para saque.";

                System.out.println(mensagem);

                scanner.close();
                break;
            } catch (Exception e) {
                if (e instanceof NumberFormatException) {
                    System.out.println("Insira um valor númerico");
                }
            }
        }


    }
}