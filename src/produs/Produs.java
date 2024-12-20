package produs;

/*Clasa Produs
Creează o clasă Produs cu atribute: nume (String), pret (double), stoc (int).
Adaugă metode pentru a crește și a scădea stocul.
Adaugă o metodă pentru a aplica un discount asupra prețului.
*/
public class Produs {
    String name;
    double price;
    int stock;

    public Produs(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
   
}
