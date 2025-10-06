package com.Prog2;
import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages;

public class Publication {
    private String id;
    private Utilisateur proprietaire;
    private List<Message> message;

    public Publication(String id, Utilisateur proprietaire, List<Message> message) {
        this.id = id;
        this.proprietaire = proprietaire;
        this.message = new ArrayList<>();
    }

    public void ajouterMessage(Message message) {
        messages.add(message);
    }

    public void afficherAuteurs() {
        List<String> dejaAffiches = new ArrayList<>();
        for (Message m : message) {
            String uid = m.getAuteur().getId();
            if (!dejaAffiches.contains(uid)) {
                m.getAuteur().afficherInfos();
                dejaAffiches.add(uid);
            }
        }
    }
}
