package MiaLibreria;

public class StringaChar {
    String parola;
    public StringaChar(String miaParola){
        this.parola = miaParola;

    }
    public char[] converti (){
        char[] stringChar = new char[(this.parola.length() * 2)];
        for (int i = 0, h = 0; i < stringChar.length; i+=2, h++){
                stringChar[i] = this.parola.charAt(h);
                if(stringChar.length -2 != i){
                    stringChar[i+1] = ',';
                }
                else {
                    stringChar[i+1] = ' ';
                }

        }
        return stringChar;
    }
}
