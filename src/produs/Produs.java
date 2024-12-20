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
    //Metoda de crestere a stocului
    public void upStock(int quantity){
        if (quantity>0) {
            stock += quantity;
            System.out.println("  Stocul a fost cresut cu " + quantity + ". Stocul actual: " + stock);
        }
        else{
            System.out.println("  Cantitatea trebuie sa depaseasca 0.");
        }
    }
    //Metoda de scarerea a stocului
    public void downStock(int quantity){
        if (quantity>0 & quantity<=stock) {
            stock -= quantity;
            System.out.println("  Stocul a scazut cu " + quantity + ". Stocul actual: " + stock);            
        }
        else if (quantity>stock) {
            System.out.println("  Soc insuficient. Stoc actual: " + stock);
        }
        else{
            System.out.println("  Cantitatea trebuie sa depaseasca 0.");
        }
    }
    //Metoda de aplicare a discountului
    public void addDiscount(double procent){
        if(procent>0 & procent<=100){
            price -= price*(procent/100);
            System.out.println("  Discount de " + procent + " % a fost aplicat. Pret actual: " + price);
        }
        else{
            System.out.println("  Procentul trebuie sa fie intre 0 si 100.");
        }
    }
    //Metoda de afisare a produsului
    public void showDetails(){
        System.out.println("  Produsul: " + name + ". Pretul: " + price + ". Stocul: " + stock);
    }
   
}
