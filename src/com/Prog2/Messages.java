package com.Prog2;
import java.time.LocalDateTime;

public class Message {
    private String texte;
    private boolean confidential;
    private LocalDateTime dateHeure;
    private Utilisateur auteur;

    public Message(String texte, boolean confidential, LocalDateTime dateHeure, Utilisateur auteur) {
        this.texte = texte;
        this.confidential = confidential;
        this.dateHeure = LocalDateTime.now();
        this.auteur = auteur;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }
}
