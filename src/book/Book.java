package book;

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
