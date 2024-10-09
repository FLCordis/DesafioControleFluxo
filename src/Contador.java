import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int primeiroParametro = sc.nextInt();
        System.out.print("\nDigite o segundo parâmetro: ");
        int segundoParametro = sc.nextInt();

        sc.close();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }
    }
    static void contar(int primeiroN, int segundoN) throws ParametrosInvalidosException{
        if (primeiroN > segundoN) {
            throw new ParametrosInvalidosException("O PRIMEIRO parâmetro deve ser MAIOR que o SEGUNDO parâmetro.");
        } else {
            int contagem = primeiroN + segundoN;

            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o Nº" + i);
            }
        }
    }

}
