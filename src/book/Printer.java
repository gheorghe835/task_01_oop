package book;

public class Printer {
    public static void main(String[] args) {
        Book book1 = new Book(" Amintiri din copilarie", " Ion Creanga",473);
        Book book2 = new Book(" Versuri"," Mihai Eminescu",98);

        System.out.println("  Cartea --" + book1.title + ", este scrisa de" + book1.author + ", contine -- " + book1.numberPage + " de pagini si " + book1.typeBook());
        System.out.println("  Cartea --" + book2.title + ", este scrisa de" + book2.author + ", contine -- " + book2.numberPage + " de pagini si " + book2.typeBook());
    }
}
