import java.util.Scanner;

public class ListFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double credito;
        double saldoMedio = sc.nextDouble();
        if (saldoMedio >= 0.00 && saldoMedio <= 200.00) {
            System.out.println("Credito negado!");
        }else if(saldoMedio >= 200.01 && saldoMedio <= 400.00){
            credito = (saldoMedio * 20) / 100;  
            System.out.println("Parabens, Voce tem direito a 20% de seu saldo medio! Ficando: " + credito);
        }else if(saldoMedio >= 400.01 && saldoMedio <= 600.0){
            credito = (saldoMedio * 30) / 100;  
            System.out.println("Parabens, Voce tem direito a 30% de seu saldo medio! Ficando: " + credito);
        }else{
            credito = (saldoMedio * 40) / 100;  
            System.out.println("Parabens, Voce tem direito a 40% de seu saldo medio! Ficando: " + credito);
        }
    }
}
