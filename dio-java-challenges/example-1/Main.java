import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine();

        // Validation using switch statement
        boolean operacaoValida;
        switch (operacao) {
            case "DEPOSITO":
            case "SAQUE":
            case "TRANSFERENCIA":
                operacaoValida = true;
                break;
            default:
                operacaoValida = false;
                break;
        }

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}