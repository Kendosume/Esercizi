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
public class Motorino extends Veicolo {

    private String marca;
    private int velMax;

    public Motorino(String marca, int velMax, String targa, int oraIngresso) {
        super("motorino", targa, oraIngresso);
        this.marca = marca;
        this.velMax = velMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    @Override
    public String toString() {
        return "Motorino= " + "targa=" + targa + ", ora ingresso " + this.biglietto.getOraIngresso();
    }

}
