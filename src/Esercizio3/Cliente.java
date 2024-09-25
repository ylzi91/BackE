package Esercizio3;

import java.util.Date;

public class Cliente {
    private static int cont = 0;
    private int codCliente;
    private String nomeCognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(String nomeCognome, String email){
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = new Date();
        cont++;
        codCliente = cont;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public String getEmail() {
        return email;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }
}

