package Esercizio3;

import java.util.ArrayList;

public class Carrello {
    private int idCliente;
    private ArrayList<Articolo> articoli = new ArrayList<Articolo>();
    private double costoTotale = 0;

    public Carrello(int codC){
        this.idCliente = codC;

    }

    public ArrayList<Articolo> getArticoli() {
        return articoli;
    }

    public void aggiungiArticolo(int idArt, Articolo[] art){
        for (int i = 0; i < art.length; i++){
            if (art[i].getIdArt() == idArt){
                this.articoli.add(art[i]);
                art[i].togliPezzo();
                break;
            }
        }

    }
    public double costoTotale(){
        if(!articoli.isEmpty()){
            for(int i= 0; i < articoli.size(); i++){
                costoTotale += articoli.get(i).getPrezzo();
            }
        } else {
            System.out.println("Nessun articolo nel carrello");
        }


        return costoTotale;
    }
}
