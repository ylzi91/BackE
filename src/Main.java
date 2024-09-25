import Esercizio1.Rettangolo;
import Esercizio2.Chiamata;
import Esercizio2.Sim;
import Esercizio3.Articolo;
import Esercizio3.Carrello;
import Esercizio3.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Rettangolo ret = new Rettangolo(10, 15);
        Rettangolo ret2 = new Rettangolo(23, 45);
        ret.areaPerimetroPerDue(ret, ret2);

        Sim sm1 = new Sim("4442233444");
        sm1.ricaricaCredito(20);
        sm1.avviaChiamata("3334455999", 12);
        sm1.avviaChiamata("3334455666", 20);
        sm1.avviaChiamata("3334455666", 20);
        System.out.println("Numero telefono: " + sm1.getNumTel() +"\nCredito: " + sm1.getCredito());
        Chiamata[] ch = sm1.getChiam();
        System.out.println("Chiamate");
        for (int i = 0; i < ch.length; i++){
            if(ch[i] != null){
            System.out.println("Numero telefono chiamato:" + ch[i].getNumeroChiamato());
            System.out.println("Minuti: " + ch[i].getMin());
            }
        }

        Cliente cln1 = new Cliente("Mario Rossi", "mario.rossi@libero.it");
        Articolo[] arts = new Articolo[]{
                new Articolo("Telefono", 23, 43),
                new Articolo("Tv", 500, 20),
                new Articolo("Monitor", 300, 12)};
        System.out.println("Ciao " + cln1.getNomeCognome() + " cosa vuoi aggingere al carrello?");
        int scelta = 0;
        Carrello cart = new Carrello(cln1.getCodCliente());
        Scanner scn = new Scanner(System.in);
        do {
            for(int i = 0; i < arts.length; i++){
            System.out.println(i+1 + ") " + arts[i].getDescrizione() +
                    " al prezzo di " + arts[i].getPrezzo() + "€" + " TotPezzi: " + arts[i].getnPezzi());
        }
        System.out.println("0) Vai al carrello");
            scelta = Integer.parseInt(scn.nextLine());
            cart.aggiungiArticolo(scelta, arts);
            if(scelta < 0 || scelta > arts.length){
                System.out.println("Hai sbagliato a selezionare");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(scelta != 0)
                System.out.println("Scegli un altro articolo o vai al carrello");
        } while(scelta != 0 );

        ArrayList<Articolo> listaCarrello = cart.getArticoli();
        if(!listaCarrello.isEmpty()){
            for (int i = 0; i < listaCarrello.size(); i++){
                System.out.println(listaCarrello.get(i).getDescrizione() + " " + listaCarrello.get(i).getPrezzo() + "€");
            }
            System.out.println("Totale carrello: " + cart.costoTotale() + "€");
        }
        else {
            System.out.println("Carrello vuoto");
        }




    }
}