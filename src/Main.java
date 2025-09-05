//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int x = 6;
//
//        while(true){
//            System.out.println(x);
//            x -= 1;
//
//            if(x < -10){
//                break;
//            }
//        }


//        do {
//            System.out.println(x);
//            x++;
//        }
//        while (x < 5);

        int[] array = {4,6,2,56,5};

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


        System.out.println("for each");

        for(int i: array){
            System.out.println(i);
        }

    }
}