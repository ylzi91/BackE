package Esercizio3;

public class Articolo {
    private int idArt;
    private static int cont = 0;
    private String descrizione;
    private double prezzo;
    private int nPezzi;

    public Articolo (String descrizione, double prezzo, int nPezzi){
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.nPezzi = nPezzi;
        cont++;
        this.idArt = cont;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getIdArt() {
        return idArt;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getnPezzi() {
        return nPezzi;
    }

    public void setnPezzi(int nPezzi) {
        this.nPezzi = nPezzi;
    }
    public void togliPezzo(){
        this.nPezzi--;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


}
