import java.util.Optional;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int moltiplica (int num1, int num2) {
        return num1 * num2;

    }
    static String concatena (String parola, int num){
        return parola + String.valueOf(num) ;
    }

    static String[] inserisciInArray (String[] strings , String parola){
        String [] appoggio = new String[strings.length + 1];
        for (int i = 0; i < 3; i ++)
            appoggio[i] = strings[i];
        appoggio[4] = strings[3];
        appoggio[5] = strings[4];
        appoggio[3] = parola;
        return appoggio;
    }

    static double perimetri (double base, double altezza, double perTriangolo){
        double semi = (base + altezza + perTriangolo) / 2;
        return Math.sqrt(semi * (semi - base) * (semi - altezza) * (semi - perTriangolo));
    }

    static double perimetri (double base, double altezza) {
        return 2*(base + altezza);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Scrivi due numeri da moltiplicare");
        int result = Main.moltiplica(scan.nextInt(), scan.nextInt());
        System.out.println(result);
        System.out.println(Main.concatena("Ciao", 24));*/
        String[] parole = {"uno", "due", "tre", "quattro", "cinque"};
        String parola = "cavallo";
        String[] arrayTransf = Main.inserisciInArray(parole, parola);
        for (int i = 0; i < arrayTransf.length; i++){
            System.out.println(arrayTransf[i]);
        }

        /*System.out.println("Scrivi tre parole\n");
        String parola1 = scan.nextLine();
        String parola2 = scan.nextLine();
        String parola3 = scan.nextLine();
        System.out.println(parola1 + " " + parola2 + " " +  parola3 );
        System.out.println(parola3 + " " + parola2 + " " +  parola1 );*/

        boolean flag = true;
        double per;
        System.out.println("Cosa vuoi calcolare?\n" +
                "1)Perimetro rettangolo\n" +
                "2)Area triangolo");
        byte scelta = scan.nextByte();
        do {
            try {
                double base = 0;
                do {
                    System.out.println("Scrivi il lato 1");
                    base = scan.nextDouble();
                    if (base < 0 ) {
                        System.out.println("Non puoi inserire un numero minore di 0");
                    }
                } while (base < 0);
                double altezza = 0;
                do {
                    System.out.println("Scrivi il lato 2");
                    altezza = scan.nextDouble();
                    if (altezza < 0 ) {
                        System.out.println("Non puoi inserire un numero minore di 0");
                    }
                } while (altezza < 0);
                if (scelta == 2){
                    double perTrg = 0;
                    do {
                        System.out.println("Scrivi il lato 3");
                        perTrg = scan.nextDouble();
                        if (perTrg < 0 ) {
                            System.out.println("Non puoi inserire un numero minore di 0");
                        }
                    } while (perTrg < 0);
                    System.out.println("L'area del triangolo è: " + Main.perimetri(base, altezza, perTrg));
                }

                per = Main.perimetri(base, altezza);
                System.out.println(per + " E' il perimetro del rettangolo");
                flag = false;
            } catch (Exception e) {
                System.out.println("Errore nel tipo");
                scan.next();
            }
        }while (flag);





    }
}