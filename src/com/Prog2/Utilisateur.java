package com.Prog2;

public class Utilisateur {
    private String id;
    private String prenom;
    private String nom;
    private String  email;

    public Utilisateur(String id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public boolean estAnonyme() {
        return prenom == null;
    }

    public void afficherInfos() {
        if (estAnonyme()) {
            System.out.println("ID Anonyme: " + id);
        }else {
            System.out.println("ID: " + id + ", Nom: " + nom+ ", Prénom: " +prenom+ ", Email: " +email);
        }
    }
}

