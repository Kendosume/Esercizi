/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcheggioorario;

/**
 *
 * @author Studente
 */
public class Veicolo {
    protected String tipo;
    protected String targa;
    protected Biglietto biglietto;

    public Veicolo(String tipo, String targa, int oraIngresso) {
        this.tipo = tipo;
        this.targa = targa;
        this.biglietto = new Biglietto(oraIngresso);
    }

    public Veicolo() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public Biglietto getBiglietto() {
        return biglietto;
    }

    public void setBiglietto(Biglietto oraIngresso) {
        this.biglietto= oraIngresso;
    }

    

    
    
    
}
