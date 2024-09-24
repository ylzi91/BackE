import MiaLibreria.FinoZero;
import MiaLibreria.StringaChar;
import MiaLibreria.numeriStringa;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws InterruptedException {

        System.out.println(stringaPariDispari("Ciaoo"));
        System.out.println(annoBisestile(2000));
       /* int num = 0;
         do try {
             System.out.println("Inserisci un numero da 1 a 3 per convertirlo(0 per uscire):");
             num = Integer.parseInt(scan.nextLine());
             numeriStringa ciao = new numeriStringa(num);
             System.out.println(ciao.converti());
         } catch (Exception e) {
             System.out.println("Tipo errato");
             num = 2;
             scan.next();

         } while ((num >= 1 || num <= 3) && num != 0);*/
        Scanner scan = new Scanner(System.in);
         String parola = "";
         do {
             try {
                 System.out.println("Inserisci una parola(:q per uscire)");
                 parola = scan.nextLine();
                 if (!parola.equals(":q")){
                     StringaChar par = new StringaChar(parola);
                     System.out.println(par.converti());
                 }
             } catch (Exception e) {
                 System.out.println("Errore nel tipo");
             }
         } while (!parola.equals(":q"));
          int numerissimo = -2;
        do
            try{
                System.out.println("Inserisci un numero per come contatore(-1 per uscire)");
                numerissimo = Integer.parseInt(scan.nextLine());
                if (numerissimo != -1){
                    FinoZero var = new FinoZero(numerissimo);
                    var.allaRovescia();
                }
            } catch (Exception e) {
                System.out.println("Errore nel tipo");

            } while (numerissimo != -1);


    }

    static boolean stringaPariDispari (String parola){
        if (parola.length() % 2 == 0){
            return  true;
        }
        else {
            return false;
        }
    }

    static String annoBisestile (int anno){
            if (anno % 4 == 0 && anno % 100 == 0){
                if (anno % 400 == 0){
                    return "Anno bisestile";
                } else {
                    return  "Anno non bisestile";
                }

            } else if (anno % 4 == 0) {
                return "Anno bisestile";
            } else {
                return "Anno non bisestile";
            }

        }
    }
