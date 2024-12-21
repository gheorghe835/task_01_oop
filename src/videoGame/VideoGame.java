package videoGame;
/*Creează o clasă JocVideo cu atribute: nume (String), gen (String), rating (double).
Creează o metodă care verifică dacă ratingul jocului este peste 4.0.
Adaugă o metodă care schimbă genul jocului. */

public class VideoGame {
    private String name;
    private String genre;
    private double rating;

    public VideoGame( String name, String genre, double rating){
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public double getRating(){
        return rating;
    }
    
    public boolean isPopular(){
        return rating > 0;
    }
    // Metodă pentru a verifica dacă rating-ul este peste 4.0
    public void changeGenre(String newGenre){
        genre = newGenre;
        System.out.println("  genul jocului a fost shimbat la: " + newGenre);
    }
    // Metodă pentru a afișa detalii despre joc
    public void showDetails(){
        System.out.println(" Joc:" + name + "\n Gen: " + genre + "\n Rating: " + rating);
    }
}
