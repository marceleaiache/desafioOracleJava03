package entities;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    //DECLARAÇÃO DE ARGUMENTOS
    private double limit;
    private double balance;
    private List<Purchase> purchases;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public CreditCard() {
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public CreditCard(double limit, double balance, List<Purchase> purchases) {
        this.limit = limit;
        this.balance = balance;
        this.purchases = purchases;
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTO ESPECÍFICO
    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchases = new ArrayList<>();
    }

    //MÉTODO GETTERS
    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    //MÉTODO SET
    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    //MÉTODO~FUNÇÃO
    public boolean makePurchase(Purchase purchase) {
        if (this.balance >= purchase.getPrice()) {
            this.balance -= purchase.getPrice();
            this.purchases.add(purchase);

            return true;
        }
        else {
            return false;
        }
    }
}
