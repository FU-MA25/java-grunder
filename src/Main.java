import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String word = "JAVA";
    static String guessedWord = initGuessedWord();

    static int attemptsLeft = 5;

    public static void main(String[] args) {

        run();

    }

    private static void run() {
        greeting();

        while(true){
            String input = getInput();
            checkInput(input);

            if (checkResult()) {
                break;
            }
        }
    }

    private static boolean checkResult() {
        if(word.toLowerCase().equals(guessedWord.toLowerCase())){

            System.out.println("Hurra! du vann!!!");
            return true;
        } else if( attemptsLeft <= 0) {
            System.out.println("sorry, du torskade...");
            return true;
        }
        return false;
    }

    private static void checkInput(String input) {

        //todo kontrollera om bokstav finns i ord
        if(word.toLowerCase().contains(input.toLowerCase())){
            System.out.println(input + " finns i det hemliga ordet!");
            StringBuilder updatedWord = new StringBuilder(guessedWord);

            for (int i = 0; i < word.length(); i++){
                if(word.toLowerCase().charAt(i) == input.toLowerCase().charAt(0)){
                    updatedWord.setCharAt(i, input.toLowerCase().charAt(0));
                }
            }

            guessedWord = updatedWord.toString();
            System.out.println(guessedWord);

        } else {
            System.out.println(input + " finns INTE i det hemliga ordet");

            attemptsLeft--;
            System.out.println(guessedWord);
        }
    }

    private static String initGuessedWord() {

        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++){
            hiddenWord += "_";
        }

        return hiddenWord;
    }

    private static String getInput() {
        // gissa på en bokstav

        System.out.println("du har " + attemptsLeft + " försök kvar");
        System.out.println("skriv en boksav :");

       String input = scanner.next();
       scanner.nextLine();

       return input;


    }

    private static void greeting() {
        //skriv hälsningsfras/instruktion
        System.out.println("välkommen till gissa ordet!");
        System.out.println("du ska gissa korrekta bokstäver i ett ord");
        System.out.println("ordet är: " + guessedWord);
    }
}