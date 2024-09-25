import java.util.Scanner;

public class ListEitgh {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero > 9999 || numero < 1000) {
            System.out.println("O numero precisa ser de quatro digitos!");
        } else {
            int p1 = numero / 100;
            int p2 = numero % 100;
            int soma = p1 + p2;
            int multiplicacaoResultado = soma * soma;
            if (multiplicacaoResultado == numero) {
                System.out.println("Certo!, resultado: " + multiplicacaoResultado);
            }else{
                System.out.println("Errado! resultado: " + multiplicacaoResultado);
            }
        }
    }
}
