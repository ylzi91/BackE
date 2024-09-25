package Esercizio1;

public class Rettangolo {
    private int lato1;
    private int lato2;


    public Rettangolo (int lato1, int lato2){
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    public void areaPerimetro(Rettangolo ret){
        System.out.println("L'area del rettangolo è: " + (ret.lato1 * ret.lato2));
        System.out.println("Il perimetro del rettangolo è: " + (ret.lato1 * 2) + (ret.lato2 * 2));

    }

    public void areaPerimetroPerDue(Rettangolo ret1, Rettangolo ret2){
        int ar1 = (ret1.lato1 * ret1.lato2);
        int per1 = (ret1.lato1 * 2) + (ret1.lato2 * 2);
        int ar2 = (ret2.lato1 * ret2.lato2);
        int per2 = (ret2.lato1 * 2) + (ret2.lato2 * 2);
        System.out.println("L'area del primo rettangolo è: " + (ret1.lato1 * ret1.lato2));
        System.out.println("Il perimetro del primo rettangolo è: " + ((ret1.lato1 * 2) + (ret1.lato2 * 2)));
        System.out.println("L'area del secondo rettangolo è: " + (ret2.lato1 * ret2.lato2));
        System.out.println("Il perimetro del secondo rettangolo è: " + ((ret2.lato1 * 2) + (ret2.lato2 * 2)));
        System.out.println("La somma dei perimetri é: " + (per1 + per2));
        System.out.println("La somma delle areee é: " + (ar1 + ar2));



    }
}
