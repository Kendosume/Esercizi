/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcheggioorario;

import java.util.Arrays;

/**
 *
 * @author Studente
 */
public class Parcheggio {

    private String via;
    private String quartiere;
    private Veicolo[] veicoli;
    private int indexVeicoli = 0;
    private static final int PREZZO_AUTO = 3;
    private static final int PREZZO_MOTO = 2;

    public Parcheggio() {
    }

    public Parcheggio(String via, String quartiere, int nVeicoli) {
        this.via = via;
        this.quartiere = quartiere;

        this.veicoli = new Veicolo[nVeicoli];
    }

//    public int calcPrezzo(Veicolo veicolo, int oraUscita) {
//
//        int y = (oraUscita - veicolo.getBiglietto().getOraIngresso());
//        int x = 0;
//        if (veicolo.tipo.equals("macchina")) {
//            if (y == 1) {
//                return PREZZO_AUTO;
//            } else if (y > 1) {
//                return x = (PREZZO_AUTO + (PREZZO_AUTO * y));
//            }
//        } else if (veicolo.tipo.equals("motorino")) {
//            if (y == 1) {
//                return PREZZO_MOTO;
//            } else if (y > 1) {
//                return x = (PREZZO_MOTO + (PREZZO_MOTO * y));
//            }
//        }
//        return x;
//    }

    public void add(Veicolo veicolo) {
        if (veicolo.tipo.equals("macchina")) {
            if (this.indexVeicoli == veicoli.length) {
                System.out.println("il parchgeggio e' pieno");
            } else {
                this.veicoli[indexVeicoli] = veicolo;
                indexVeicoli++;
                System.out.println("macchina aggiunta");
            }
        } else if (veicolo.tipo.equals("motorino")) {
            if (this.indexVeicoli == veicoli.length) {
                System.out.println("il parchgeggio e' pieno");
            } else {
                this.veicoli[indexVeicoli] = veicolo;
                indexVeicoli++;
                System.out.println("motorino aggiunto");
            }
        }

    }

    public int cercaTramiteTarga(String targa) {
        for (int i = 0; i < this.indexVeicoli; i++) {
            if (veicoli[i].getTarga().equals(targa)) {
                return i;
            }
        }
        return -1;
    }

    public int uscitaPerTarga(int oraUscita, int i) {
        int y = (oraUscita - veicoli[i].getBiglietto().getOraIngresso());
        int x = 0;

        if (y <= -1) {
            return -1;
        } else {
            if (veicoli[i].tipo.equals("macchina")) {
                if (y == 1 || y == 0) {
                    return PREZZO_AUTO;
                } else if (y > 1) {
                    return x = (PREZZO_AUTO + (PREZZO_AUTO * y));
                }
            } else if (veicoli[i].tipo.equals("motorino")) {
                if (y == 1) {
                    return PREZZO_MOTO;
                } else if (y > 1) {
                    return x = (PREZZO_MOTO + (PREZZO_MOTO * y));
                }

            }
        }

        return -11;

    }

    public void eliminaAtIndex(int ix) {
        veicoli[ix] = null;
        for (int i = ix; i < this.indexVeicoli; i++) {
            veicoli[i] = veicoli[i + 1];
        }
        this.indexVeicoli--;
    }

//    public Veicolo[] getVeicoli() {
//        return Arrays.copyOf(veicoli, indexVeicoli);
//
//    }

    public void scontrino(int i, int spesa, int oraUscita) {

        if (spesa == -12) {
            System.out.println("non puoi eseguire questo comando");
        } else {
            System.out.println("Tipo: " + veicoli[i].getTipo());
            System.out.println("Ora entrata: " + veicoli[i].getBiglietto().getOraIngresso());
            System.out.println("Ora uscita: " + oraUscita);
            System.out.println("Prezzo da pagare: " + spesa + "$");
        }

    }

    public void vediArray() {
        for (int i = 0; i < this.indexVeicoli; i++) {
            System.out.println(veicoli[i].toString());
        }
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getQuartiere() {
        return quartiere;
    }

    public void setQuartiere(String quartiere) {
        this.quartiere = quartiere;
    }

    public int getIndexVeicoli() {
        return indexVeicoli;
    }

}
