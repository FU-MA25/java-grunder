import java.util.*;

public class Main {
    public static void main(String[] args) {

//        String name = "Bill";
//        String name2 = "bosse";
//        String name3 = "Banarne";
//
//
//        String[] names = {"Bill", "Bosse", "Banarne", "Berit"};
//
//        //String[] names2 = names.clone();
//        String[] names2 = Arrays.copyOf(names, names.length);
//
//       //String[] names = new String[5];
//
//
//        names[2] = "nytt namn";
//
//        System.out.println("names:");
//        for(int i = 0; i < names.length; i++){
//
//
//            System.out.println(names[i]);
//        }
//        System.out.println("names2:");
//        for(int i = 0; i < names2.length; i++){
//            System.out.println(names2[i]);
//        }
//        System.out.println(names);
//        System.out.println(names2);

//        System.out.println(Arrays.toString(names));

//        for(String ajdhsfg : names){
//            System.out.println( ajdhsfg);
//        }

//
//        char[][] matrix = {
//                {'.', '.', 'X'},
//            {'.', 'X','.' },
//            {'O', '.', '.'}};
//
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++) {
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }


        int x = 3;

        LinkedList<String> names = new LinkedList<>();

        System.out.println(names);

        names.add("Bill");
        System.out.println(names);
        names.add("Bosse");
        System.out.println(names);
        names.add("Bertil");
        System.out.println(names);
        names.add("Bosse");
        System.out.println(names);
        names.add(1,"andra elementet");
        System.out.println(names);
        System.out.println(names.get(0));
        names.set(x,"tredje elementet");


        names.remove(names.size() -2);
        System.out.println(names);
        names.remove(Collections.singleton("Bzsdxgsse"));

        System.out.println(names);


        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        for(String name : names){
            System.out.println(name);
        }

    }
}