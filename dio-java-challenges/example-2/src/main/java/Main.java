import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigoInformado = scanner.nextLine();
        String codigoEsperado = scanner.nextLine();

        // Validate equality and display result
        String resultado = isCodeValid(codigoInformado, codigoEsperado)
                ? "ACESSO LIBERADO"
                : "ACESSO NEGADO";

        System.out.println(resultado);

        scanner.close();
    }

    /**
     * Checks if the provided code strictly matches the expected code.
     */
    static boolean isCodeValid(String informed, String expected) {
        if (informed == null || expected == null) {
            return false;
        }
        return informed.equals(expected);
    }
}