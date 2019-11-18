/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appprenotazioni;

import java.time.LocalDateTime;
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author tss
 */
public class GestioneTicket {

    static ArrayList<Evento> elencoEventi = new ArrayList<Evento>();
    static ArrayList<Utente> elencoUtenti = new ArrayList<Utente>();
    static ArrayList<Ticket> elencoTicket = new ArrayList<Ticket>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Utente utente;
        Evento evento;
        Ticket ticket;
//metodo per chiedere dati utente con JOptionPan:
        //utente = new Utente("chiedere nome utente", "chiedere cognome utente");
        //Utente nuovoAccount = new Utente("chiedere username utente", "chiedere password utente",
        //      "chiedere Email utente");

        //creo un utente
        utente = new Utente("poi", "poi", "pippo", "pluto", "pippo@pluto.it");
        elencoUtenti.add(utente);
        utente = new Utente("Marta", "Leone", "Martaleo", "MmmmmLllll", "martaleo@alice.it");
        elencoUtenti.add(utente);

        //creo un evento
        LocalDateTime dataevento = LocalDateTime.of(2019, 12, 25, 20, 30);
        evento = new Evento("jovanotti tour", dataevento, "Samone (TO)");
        elencoEventi.add(evento);
        evento = new Evento("Vasco Rossi", dataevento, "Torino (TO)");
        elencoEventi.add(evento);

        //creo biglietto
        ticket = new Ticket(20, elencoEventi.get(1), elencoUtenti.get(1));
        elencoTicket.add(ticket);
        ticket = new Ticket(20, elencoEventi.get(0), elencoUtenti.get(0));
        elencoTicket.add(ticket);

        ticket = new Ticket(20, elencoEventi.get(0), elencoUtenti.get(1));
        elencoTicket.add(ticket);

        System.out.println(stampaTicket());

    }

    static String stampaTicket() {
        String ris = "Elenco biglietti\n";
        for (int i = 0; i < elencoTicket.size(); i++) {
            Ticket tick = elencoTicket.get(i);
            Evento ev = tick.getEvento();
            Utente ut = tick.getUtente();

            ris += (1 + i) + " - " + ev.getTitolo() + " - " + ut.getCognomeUtente() + " "
                    + ut.getNomeUtente() + "\n";

        }
        return ris;
    }

}
