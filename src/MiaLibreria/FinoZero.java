package MiaLibreria;



public class FinoZero {
    int numero;
    public FinoZero (int num){
        this.numero = num;
    }

     public void allaRovescia(){
         for (int i = numero; i >= 0; i--) {
             System.out.println(i);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 System.err.println("Timer interrotto");
             }
         }

         System.out.println("Tempo scaduto!");
     }

}

