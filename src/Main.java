import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int moltiplica (int num1, int num2) {
        return num1 * num2;

    }
    static String concatena (String parola, int num){
        return parola + String.valueOf(num) ;
    }

  /*  static String[] inserisciInArray (String[] strings , String parola){
        String [] appoggio = new String[6];

    }*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrivi due numeri da moltiplicare");
        int result = Main.moltiplica(scan.nextInt(), scan.nextInt());
        System.out.println(result);
        System.out.println(Main.concatena("Ciao", 23));

    }
}