package entities;

public class Purchase implements Comparable<Purchase>{
    //DECLARAÇÃO DOS ARGUMENTOS
    private String description;
    private double price;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Purchase() {
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public Purchase(String description, double price) {
        this.description = description;
        this.price = price;
    }

    //MÉTODO GETTERS E SETTERS
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Compra: descrição = "
                + description
                + "price = "
                + price;
    }

    @Override
    public int compareTo(Purchase otherPurchase) {
        return Double.valueOf(this.price).compareTo(Double.valueOf(otherPurchase.price));
    }

}
