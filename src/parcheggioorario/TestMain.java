/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcheggioorario;

import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string;
        int i = 0;
        int spesa = 0;
        Integer uscita = 0;
        Parcheggio parcheggio = new Parcheggio("via a", "quartiere b", 5);
        do {
            System.out.println("----------------------------------------");
            System.out.println("0: nuovo veicolo");
            System.out.println("1: visualizza veicoli nel parcheggio");
            System.out.println("2: uscita per targa");
            System.out.println("3: visualizza scontrino (prima assicurarsi di aver selezionatola funziuone n2)");
            System.out.println("4: exit");
            System.out.println("----------------------------------------");

            System.out.println("Scegli un opzione: ");
            String sceltaa = scanner.nextLine();
            Integer scelta = Integer.parseInt(sceltaa);

            switch (scelta) {
                case 0:

                    Macchina v = new Macchina(7, 9, "acs", "dada", 12);
                    Macchina v1 = new Macchina(9, 5, "lubcnca", "CC583", 12);
                    Motorino v2 = new Motorino("mitsubishi", 180, "f4t56", 18);

                    //mettere gli add
                    parcheggio.add(v);
                    parcheggio.add(v1);
                    parcheggio.add(v2);

                    break;

                case 1:
                    parcheggio.vediArray();

                    break;

                case 2:
                    System.out.println("che targa ha il veicolo che deve uscire: ");
                    string = scanner.nextLine();
                    i = parcheggio.cercaTramiteTarga(string);
                    if (i == -1) {
                        System.out.println("targa non trovata");

                    } else {
                        System.out.println("a che ora esce il veicolo con targa:" + string + " : ");
                        string = scanner.nextLine();
                        uscita = Integer.parseInt(string);
                        spesa = parcheggio.uscitaPerTarga(uscita, i);
                        if (spesa == -1) {
                            System.out.println("errore orario l'orario inserito e' sbagliato riprovare");
                            spesa = -12;
                        }
                    }

                    break;

                case 3:
                    parcheggio.scontrino(i, spesa, uscita);
                    parcheggio.eliminaAtIndex(i);
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("inserisci uno dei numeri presenti");

            }

        } while (true);

    }

}
