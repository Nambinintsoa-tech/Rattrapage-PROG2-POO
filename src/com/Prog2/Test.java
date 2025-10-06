package com.Prog2;

import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        Utilisateur Rakotoarisoa = new Utilisateur("1", "Rakotoarisoa", "Nomena", "rakotoarisoa@gmail.com");
        Utilisateur anon1 = new Utilisateur("A1");
        Utilisateur anon2 = new Utilisateur("A2");
        Publication pub = new Publication("P01", Rakotoarisoa);
        pub.ajouterMessage(new Message("Bonjour tout le monde ! ", false, Rakotoarisoa));
        pub.ajouterMessage(new Message("Message anonyme 1", true, anon1));
        pub.ajouterMessage(new Message("Message anonyme 2", false, anon2));
        pub.ajouterMessage(new Message("Encore Rakotoarisoa", false, Rakotoarisoa));

        System.out.println("Auteurs de la publications :");
        pub.afficherAuteurs();
    }
}
