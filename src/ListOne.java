import java.util.Scanner;

public class ListOne {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int a = sc.nextInt();
        System.out.println("Digite outro valor: ");
        int b = sc.nextInt();
        System.out.println("Digite outro valor: ");
        int c = sc.nextInt();
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("É um triangulo!");
            if (a == b && b == c) {
                System.out.println("É um triangulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("É um triangulo Isósceles");
            } else {
                System.out.println("É um triangulo Escaleno");
            }
        } else {
            System.out.println("Não é um triagulo!");
        }

    }
}
