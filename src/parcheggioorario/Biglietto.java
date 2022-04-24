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
public class Biglietto {

    private int oraIngresso;

    public Biglietto() {
    }

    public Biglietto(int oraIngresso) {
        setOraIngresso(oraIngresso);
    }

    public int getOraIngresso() {
        return oraIngresso;
    }

    public void setOraIngresso(int oraIngresso) {
        if (oraIngresso > 24) {
            System.out.println("orario non valido");
            this.oraIngresso = -1;
        } else {
            this.oraIngresso = oraIngresso;
        }
    }

}
