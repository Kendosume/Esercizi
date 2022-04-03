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
public class Macchina extends Veicolo {

    private int nSedili;
    private int nPorte;
    private String marca;

    public Macchina(int nSedili, int nPorte, String marca, String targa, int oraIngresso) {
        super("macchina", targa, oraIngresso);
        this.nSedili = nSedili;
        this.nPorte = nPorte;
        this.marca = marca;
    }

    public int getnSedili() {
        return nSedili;
    }

    public void setnSedili(int nSedili) {
        this.nSedili = nSedili;
    }

    public int getnPorte() {
        return nPorte;
    }

    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }

    @Override
    public String toString() {
        return "Macchina= " + "targa=" + targa + ", ora ingresso " + this.biglietto.getOraIngresso();
    }

}
