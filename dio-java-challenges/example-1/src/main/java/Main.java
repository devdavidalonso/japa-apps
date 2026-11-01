import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine();

        System.out.println(isOperationValid(operacao) ? "VALID" : "INVALID");

        scanner.close();
    }

    static boolean isOperationValid(String operacao) {
        switch (operacao) {
            case "DEPOSITO":
            case "SAQUE":
            case "TRANSFERENCIA":
                return true;
            default:
                return false;
        }
    }
}