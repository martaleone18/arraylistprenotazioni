/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appprenotazioni;


/**
 *
 * @author tss
 */
public class Utente {

    private String nomeUtente;
    private String cognomeUtente;
    private String Username;
    private String Password;
    private String Email;

    public Utente(String nomeUtente, String cognomeUtente, String Username, String Password, String Email) {
      
        this.nomeUtente = nomeUtente;
        this.cognomeUtente = cognomeUtente;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
 // this.nomeUtente = JOptionPane.showInputDialog("chiedere nome utente");
        //this.cognomeUtente = JOptionPane.showInputDialog("chiedere cognome utente");
        //this.Username = JOptionPane.showInputDialog("chiedere usernamem utente");
        //this.Password = JOptionPane.showInputDialog("chiedere password utente");
        //this.Email = JOptionPane.showInputDialog("chiedere Email utente");
        

    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getCognomeUtente() {
        return cognomeUtente;
    }

    public void setCognomeUtente(String cognomeUtente) {
        this.cognomeUtente = cognomeUtente;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
