import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

//        String text = "hej";
//
//        char tecken = 'a';
//
//        long stortTal = 235;
//
//        short litetTal = -1;
//        byte bitar = 1;
//
//
//
//        double decimalTal = 2.6;
//        float decimaltalLitet = 1.6f;
//
//        boolean bool = true;

//        int fruits = 1;
//
//        fruits = fruits + 1;
//
//        fruits++;

//        fruits += 1;
//

//        double x = 14;
//        double y = 3;
//
//        int z = 4 * 3;
//
//
//        int tal2 = Math.abs(-8);
//
//        int mittTal = 12345;
//
//        System.out.println(mittTal%1000/100);
//
//        System.out.println("tal2 = " + tal2);

//        System.out.println(z);
//        System.out.println(x/y);
//        System.out.println(x%y);


  //      System.out.println(text);
        //System.out.println(fruits);


        Scanner in = new Scanner(System.in);

        while(true) {


            System.out.println("skriv ett heltal");


            int x = in.nextInt();


            int y = 1;

            if (x == 10) {
                System.out.println("hej");
            } else if (x > 10) {
                System.out.println("adjö");
            } else {
                System.out.println("godmorgon");
            }

            System.out.println("koden fortsätter som vanligt...");


            switch (y) {
                case 1:
                    System.out.println("jag är en etta");
                    break;
                case 10:
                    System.out.println("jag är en tia");
                    break;
                default:
                    System.out.println("jag fanns inte med");
            }

        }
    }



}