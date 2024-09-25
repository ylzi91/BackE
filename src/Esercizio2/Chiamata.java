package Esercizio2;

public class Chiamata {
    private int minutiDurata;
    private String numeroChiamato;

    public Chiamata(int minuti, String numero){
        this.minutiDurata = minuti;
        this.numeroChiamato = numero;
    }

    public int getMin(){
        return this.minutiDurata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }
}
