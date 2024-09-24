package MiaLibreria;

public class numeriStringa {
     int num;

    public numeriStringa(int myNum) {
        this.num = myNum;
    }
    public String converti(){
        switch (this.num){
            case 1:
                return "uno";
            case 2:
                return  "due";
            case 3:
                return "tre";
            case 0:
                return "Uscita";
            default:
                return "Inserimento errato";
        }
    }


}
