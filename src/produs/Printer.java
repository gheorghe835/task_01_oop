package produs;

public class Printer {
    public static void main(String[] args) {
        Produs laptop = new Produs("Lenova",27000.45,78);

        laptop.showDetails();
        laptop.upStock(4);
        laptop.addDiscount(10);
        laptop.showDetails();
    }
}
