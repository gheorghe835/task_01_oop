package book;
/*Clasa Carte
Creează o clasă numită Carte cu următoarele atribute: titlu (String), autor (String), numarPagini (int).
Adaugă un constructor pentru inițializarea atributelor.
Creează o metodă care verifică dacă cartea are mai mult de 300 de pagini. */

public class Book {
    String title ;
    String author;
    int numberPage;

    public Book(String title, String author, int numberPage) {
        this.title = title;
        this.author = author;
        this.numberPage = numberPage;
    }
    String typeBook(){
        if (numberPage > 300)return  "este o carte mare.";
        else return  "este o carte mica.";
    }
}
