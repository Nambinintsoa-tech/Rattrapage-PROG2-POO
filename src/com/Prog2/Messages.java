package com.Prog2;
import java.time.LocalDateTime;

public class Messages {
    private String texte;
    private boolean confidential;
    private LocalDateTime dateHeure;
    private Utilisateur auteur;

    public Messages(String texte, boolean confidential, Utilisateur auteur) {
        this.texte = texte;
        this.confidential = confidential;
        this.dateHeure = LocalDateTime.now();
        this.auteur = auteur;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }
}
