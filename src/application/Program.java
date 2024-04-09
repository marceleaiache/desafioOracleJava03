package application;

import entities.CreditCard;
import entities.Purchase;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limit = sc.nextDouble();
        sc.nextLine();
        CreditCard card = new CreditCard(limit);

        int out = 1;
        while (out !=0) {
            System.out.println("Digite a descrição da compra: ");
            String description = sc.nextLine();

            System.out.println("Digite o valor da compra: ");
            double price = sc.nextDouble();
            sc.nextLine();


            Purchase purchase = new Purchase(description, price);
            boolean finishedPurchase = card.makePurchase(purchase);

            if(finishedPurchase) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 pra sair ou 1 para continuar: ");
                out = sc.nextInt();
                sc.nextLine();
            }
            else {
                System.out.println("Saldo Insuficiente!");
                out = 0;
            }

            System.out.println("***********************");
            System.out.println("COMPRAS REALIZADAS: \n");

            for (Purchase purchase1 : card.getPurchases()) {
                System.out.println(purchase1.getDescription() + " - " + purchase1.getPrice());
            }

            System.out.println("\n***********************");
            System.out.println("\nSaldo do cartão: " + card.getBalance());
            System.out.println();
        }
        sc.close();
    }
}
