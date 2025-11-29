import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        try {
            System.out.println("*******************************");
            System.out.println("Boas vindas ao programa Divisor");
            System.out.println("*******************************");
            System.out.println("Digite o dividendo (inteiro): ");
            Scanner leitor = new Scanner(System.in);
            int dividendo = leitor.nextInt();

            System.out.println("Digite, agora, o divisor (inteiro): ");
            int divisor = leitor.nextInt();

            System.out.println("A divisão entre " + dividendo + " e " + divisor + " é: " + dividendo / divisor);
        } catch (ArithmeticException e) {
            System.out.println("Você digitou ZERO como divisor. A divisão por zero é impossível e não tem um resultado definido, pois não existe" +
                    " nenhum número que, multiplicado por zero, resulte em um número diferente de zero. Quando você tenta dividir um número qualquer " +
                    "por zero, você cria um paradoxo, pois não há como satisfazer a operação de verificação da divisão. Tente um divisor diferente de" +
                    "ZERO, da próxima vez.");
        }

    }
}
