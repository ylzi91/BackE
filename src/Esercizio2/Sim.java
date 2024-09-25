package Esercizio2;

public class Sim {
    private String numTel;
    private double credito;
    private Chiamata[] chiam = new Chiamata[5];

    public Sim (String num){
        this.numTel = num;
        this.credito = 0;
    }
    public Chiamata[] getChiam(){
        return chiam;
    }

    public String getNumTel() {
        return numTel;
    }

    public double getCredito() {
        return credito;
    }

    public void ricaricaCredito(double credito) {
        this.credito += credito;
    }

    public void avviaChiamata(String num, int min) {
        if(credito <= 0){
            System.out.println("Credito non sufficiente, ricarica");
        } else {
            System.out.println("Avvio chiamata..." );
            for (int i = 0; i < chiam.length; i++ ){
                if (chiam[i] == null){
                    chiam[i] = new Chiamata(min, num);
                    credito -= (min * 0.3);
                    System.out.println("Durata:" + min);
                    System.out.println("Credito residuo "+ credito);
                    System.out.println("---------------------");
                    break;
                }
            }
        }

    }
}
