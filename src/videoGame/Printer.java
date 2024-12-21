package videoGame;

public class Printer {
    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame("Joc","Actiune", 4.1);

        // Afișarea detaliilor despre joc
        videoGame.showDetails();

        // Verificarea popularității
        if (videoGame.isPopular()) {
            System.out.println(videoGame.getName() + " -- este popular");
        }
        else{
            System.out.println(videoGame.getName() + " -- nu este popular");
        }
        // Schimbarea genului
        videoGame.changeGenre("Aventura");
        videoGame.showDetails();

    }
}
