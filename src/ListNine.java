import java.util.Scanner;

public class ListNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Qual o tipo de bilete desejado? \n 1. Bilete Unitário (1) \n 2. Bilhete duplo (2) \n 3. Bilhete de 10 viagens (3)");
        int opcao = sc.nextInt();
        System.out.println("Digite o valor a ser depositado: ");
        double valor = sc.nextDouble();
        double bileteUnitario = 1.30;
        double bileteDuplo = 2.60;
        double bilete10 = 12.0;
        double total, troco;
        switch (opcao) {
            case 1:
                total = valor / bileteUnitario;
                troco = valor % bileteUnitario;
                System.out.printf("Quantidade de bilites: %.0f%n", total);
                System.out.printf("Troco: %.2f%n ", troco);
                break;
            case 2:
                total = valor / bileteDuplo;
                troco = valor % bileteDuplo;
                System.out.printf("Quantidade de bilites: %.0f%n", total);
                System.out.printf("Troco: %.2f%n ", troco);
                break;
            case 3:
                total = valor / bilete10;
                troco = valor % bilete10;
                System.out.printf("Quantidade de bilites: %.0f%n", total);
                System.out.printf("Troco: %.2f%n ", troco);
                break;
            default:
                break;
        }
    }
}
