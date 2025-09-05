import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();



        System.out.println("hej, välkommen till världens coolaste tärningsspel!");

        while(true){
            System.out.println("tryck Enter för att slå tärningen");
            scanner.nextLine();

            int playerDice = random.nextInt(1,7);
            int opponentDice = (int)(Math.random() * 6) + 1;

            System.out.println("du slog en " + playerDice + ":a !!!");
            System.out.println("datorn slog en " + opponentDice + ":a...");

            System.out.println();

            if(playerDice > opponentDice){
                System.out.println("du vann omgången!");
            } else if(playerDice == opponentDice){
                System.out.println("det blev oavgjort...");
            } else{
                System.out.println("motståndaren vann...");
            }

            System.out.println();

        }



    }
}