import java.util.Scanner;

public class LeitorSenhas {
    public static void main(String[] args) {
        System.out.println("Digite a senha: ");
        Scanner leitor = new Scanner(System.in);
        String senhaDigitada = leitor.nextLine();

        try {
            validarSenha(senhaDigitada);
            System.out.println("Senha válida.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senhaDigitada) {
        if (senhaDigitada.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter 8 caracteres válidos.");
        }
    }
}
